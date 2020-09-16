package bemc.spa;

import javax.persistence.*;
        
@Entity
@Table(name="documento")

public class Documento {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipodocumento;
    @Column
    private String nombre;

    public int getId_tipodocumento() {
        return id_tipodocumento;
    }

    public void setId_tipodocumento(int id_tipodocumento) {
        this.id_tipodocumento = id_tipodocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
}
