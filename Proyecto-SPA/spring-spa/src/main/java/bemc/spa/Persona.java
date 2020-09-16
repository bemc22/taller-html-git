package bemc.spa;

import javax.persistence.*;
        
@Entity
@Table(name="persona")

public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column 
    private String apellido;
    
    @Column 
    private int id_tipodocumento;
    
    @Column 
    private String documento;
    
    @Column 
    private int lugar_residencia;
    
    @Column 
    private String fecha_nacimiento;
    @Column 
    private String email;
    @Column 
    private String telefono;
    
    @Column 
    private String usuario;
    
    @Column 
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId_tipodocumento() {
        return id_tipodocumento;
    }

    public void setId_tipodocumento(int id_tipodocumento) {
        this.id_tipodocumento = id_tipodocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getLugar_residencia() {
        return lugar_residencia;
    }

    public void setLugar_residencia(int lugar_residencia) {
        this.lugar_residencia = lugar_residencia;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    

    
    
    
}
