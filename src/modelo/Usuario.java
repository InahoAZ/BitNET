package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "usuario")

public class Usuario {
        @Id
	private String legajo;
        
	private String nombre;
	private String apellido;
        
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date fechaNac;
        
	private String correo;
	private float reputacion;
        
        @ManyToOne
        private Rol rol;
        
        @OneToMany(mappedBy = "usuario")
        private List<Pregunta> preguntas;
        
        private String password;
        
        public Usuario(){
            this.preguntas = new ArrayList<>();
                  
        }
        
        public Usuario(String legajo, String nombre, String apellido, Date fechaNac, String correo, String password, Rol rol) {
            this.legajo = legajo;
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNac = fechaNac;
            this.correo = correo;
            this.password = password;
            this.preguntas = new ArrayList<>();
            this.rol = rol;
            
        }

        
	/**
	 * 
	 * @param unaPregunta
	 */
	public void añadirPregunta(Pregunta unaPregunta) {
                System.out.print("añadirPregunta Usuario: ");
                this.preguntas.add(unaPregunta);
                System.out.println("OK");
	}

	/**
	 * 
	 * @param unaRespuesta
	 */
	public void añadirRespuesta(Respuesta unaRespuesta) {
		// TODO - implement Usuario.añadirRespuesta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaPregunta
	 */
	public void eliminarPregunta(Pregunta unaPregunta) {
		// TODO - implement Usuario.eliminarPregunta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaRespuesta
	 */
	public void eliminarRespuesta(Respuesta unaRespuesta) {
		// TODO - implement Usuario.eliminarRespuesta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unReporte
	 */
	public void añadirReporte(Reporte unReporte) {
		// TODO - implement Usuario.añadirReporte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaBusqueda
         * @return 
	 */
	public boolean compararNombre(String unaBusqueda) {
		// TODO - implement Usuario.compararNombre
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaBusqueda
         * @return 
	 */
	public boolean compararApellido(String unaBusqueda) {
		// TODO - implement Usuario.compararApellido
		throw new UnsupportedOperationException();
	}
        
        public boolean compararPassword(String password){
                System.out.println("pwd recibido: " + password);
                System.out.println("pwd compara2: " + this.password);
                return this.password.equals(password);       
        }
        

        public String getLegajo() {
            return legajo;
        }

        public void setLegajo(String legajo) {
            this.legajo = legajo;
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

        public Date getFechaNac() {
            return fechaNac;
        }

        public void setFechaNac(Date fechaNac) {
            this.fechaNac = fechaNac;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public float getReputacion() {
            return reputacion;
        }

        public void setReputacion(float reputacion) {
            this.reputacion = reputacion;
        }

        public Rol getRol() {
            return rol;
        }

        public void setRol(Rol rol) {
            this.rol = rol;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        
        

        @Override
        public String toString() {
            return "" + nombre + "  " + apellido + "  " + fechaNac + "  " + correo + "  " + reputacion;
        }
        
        

}