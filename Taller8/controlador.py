from app import app
from modelos import *
from flask import render_template, request, redirect, url_for, flash


@app.route('/')
def Index():
    all_data = db.session.query(Persona,Tipodocumento,Ciudad).join(Tipodocumento).join(Ciudad).all()
    documentos_data = Tipodocumento.query.all()
    ciudades = Ciudad.query.all()

    return render_template("index.html.jinja", personas=all_data, documents = documentos_data, cities = ciudades)


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


        my_data = Persona(nombres,apellidos,id_tipodocumento,documento,
        lugar_residencia,fecha_nacimiento,email,telefono,usuario,password)
        db.session.add(my_data)
        db.session.commit()

        flash("Usuario agregado exitosamente")

        return redirect(url_for('Index'))

@app.route('/update', methods=['GET', 'POST'])
def update():
    if request.method == 'POST':
        my_data = Persona.query.get(request.form.get('id'))

        my_data.nombres = request.form['nombres']
        my_data.apellidos = request.form['apellidos']
        my_data.id_tipodocumento = request.form['id_tipodocumento']
        my_data.documento = request.form['documento']
        my_data.lugar_residencia = request.form['lugar_residencia']
        my_data.email = request.form['email']
        my_data.telefono = request.form['telefono']

        db.session.commit()
        flash("Información actualizada exitosamente ")
        return redirect(url_for('Index'))



@app.route('/delete/<id>/', methods = ['GET' , 'POST'])
def delete(id):
    my_data = Persona.query.get(id)
    db.session.delete(my_data)
    db.session.commit()
    flash("Usuario eliminado Exitosamente")
    return redirect(url_for('Index'))
