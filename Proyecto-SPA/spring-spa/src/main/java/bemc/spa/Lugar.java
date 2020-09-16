package bemc.spa;

import javax.persistence.*;
        
@Entity
@Table(name="lugar")

public class Lugar {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_lugar;
    @Column
    private String nombre;

    public int getId_lugar() {
        return id_lugar;
    }
    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
    
}