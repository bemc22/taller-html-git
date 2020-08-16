from app import db

class Persona(db.Model):
    id = db.Column(db.Integer, primary_key = True)
    nombres = db.Column(db.String(100))
    apellidos = db.Column(db.String(100))
    id_tipodocumento = db.Column(db.Integer)
    documento = db.Column(db.String(20))
    lugar_residencia = db.Column(db.Integer)
    fecha_nacimiento = db.Column(db.String(100))
    email = db.Column(db.String(50))
    telefono = db.Column(db.Integer)
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
