from app import db

class Ciudad(db.Model):
    id = db.Column(db.Integer, primary_key= True )
    nombre = db.Column(db.String(20))
    descripcion = db.Column(db.String(120))
    personas = db.relationship('Persona', backref='ciudad', lazy=True)

    def __init__(self, nombre, descripcion):
        self.nombre = nombre
        self.descripcion = descripcion


class Tipodocumento(db.Model):
    id = db.Column(db.Integer, primary_key= True )
    nombre = db.Column(db.String(2), unique=True)
    descripcion = db.Column(db.String(120))
    personas = db.relationship('Persona' , backref='Tipodocumento' , lazy=True)

    def __init__(self, nombre, descripcion):
        self.nombre = nombre
        self.descripcion = descripcion


class Persona(db.Model):
    id = db.Column(db.Integer, primary_key = True)
    nombres = db.Column(db.String(100))
    apellidos = db.Column(db.String(100))
    id_tipodocumento = db.Column(db.Integer , db.ForeignKey('tipodocumento.id'), nullable=False)
    documento = db.Column(db.String(20))
    lugar_residencia = db.Column(db.Integer , db.ForeignKey('ciudad.id') , nullable=False)
    fecha_nacimiento = db.Column(db.String(100))
    email = db.Column(db.String(50))
    telefono = db.Column(db.String(20))
    usuario = db.Column(db.String(25) , unique=True)
    password = db.Column(db.String(25))

    def __init__(self, nombres, apellidos, id_tipodocumento,documento,lugar_residencia,
    fecha_nacimiento,email,telefono,usuario,password):

        self.nombres = nombres
        self.apellidos = apellidos
        self.id_tipodocumento = id_tipodocumento
        self.documento = documento
        self.lugar_residencia = lugar_residencia
        self.fecha_nacimiento = fecha_nacimiento
        self.email = email
        self.telefono = telefono
        self.usuario = usuario
        self.password = password
