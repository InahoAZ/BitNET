package modelo;

import java.util.ArrayList;
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
    @SequenceGenerator(name="sec_idrol", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_idrol")
    private int idRol;
    
    private String nombre;
    
    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuarios;

    public Rol() {
        this.usuarios = new ArrayList<>();        
    }

    public Rol(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void añadirUsuario(Usuario unUsuario){
        this.usuarios.add(unUsuario);
        unUsuario.setRol(this);
    }
    
    public void eliminarUsuario(Usuario unUsuario){
        this.usuarios.remove(unUsuario);        
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    
    @Override
    public String toString() {
        return "" + nombre;
    }
    
    
    
}