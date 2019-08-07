package modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "usuario")

public class Usuario {
        @Id
	private long legajo;
        
	private String nombre;
	private String apellido;
        
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date fechaNac;
        
	private String correo;
	private float reputacion;
        
        @ManyToOne
        private Rol rol;
        
        public Usuario(){       
        
        }
        
        public Usuario(long legajo, String nombre, String apellido, Date fechaNac, String correo, float reputacion) {
            this.legajo = legajo;
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNac = fechaNac;
            this.correo = correo;
            this.reputacion = reputacion;
        }

        
	/**
	 * 
	 * @param unaPregunta
	 */
	public void añadirPregunta(Pregunta unaPregunta) {
		// TODO - implement Usuario.añadirPregunta
		throw new UnsupportedOperationException();
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

        public long getLegajo() {
            return legajo;
        }

        public void setLegajo(long legajo) {
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
        
        

}