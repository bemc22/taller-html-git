from app import app
from modelos import *
from flask import render_template, request, redirect, url_for, flash


@app.route('/')
def Index():
    all_data = Persona.query.all()
    return render_template("index.html", personas=all_data)


@app.route('/insert', methods=['POST'])
def insert():
    if request.method == 'POST':

        nombres = request.form['nombres']
        apellidos = request.form['apellidos']
        id_tipodocumento = request.form['id_tipodocumento']
        documento = request.form['documento']
        lugar_residencia = request.form['lugar_residencia']
        fecha_nacimiento = request.form['fecha_nacimiento']
        email = request.form['email']
        telefono = request.form['telefono']
        usuario = request.form['usuario']
        password = request.form['password']


        name =request.form['name']
        email = request.form['email']
        phone = request.form['phone']

        my_data = Persona(name,email,phone)
        db.session.add(my_data)
        db.session.commit()

        flash("Usuario agregado exitosamente")

        return redirect(url_for('Index'))

@app.route('/update', methods=['GET', 'POST'])
def update():
    if request.method == 'POST':
        my_data = Persona.query.get(request.form.get('id'))

        my_data.name = request.form['name']
        my_data.email = request.form['email']
        my_data.phone = request.form['phone']

        db.session.commit()
        flash("Employee Update Successfully")
        return redirect(url_for('Index'))



@app.route('/delete/<id>/', methods = ['GET' , 'POST'])
def delete(id):
    my_data = Persona.query.get(id)
    db.session.delete(my_data)
    db.session.commit()
    flash("Employee Deleted Successfully")
    return redirect(url_for('Index'))
