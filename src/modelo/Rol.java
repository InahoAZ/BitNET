package modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="rol")
public class Rol {
    @Id
    @SequenceGenerator(name="sec_idRol", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_idRol")
    private int idRol;
    
    private String nombre;
    
    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuarios;

    public Rol() {
        
    }

    public Rol(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}