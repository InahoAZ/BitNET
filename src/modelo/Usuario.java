package modelo;

import java.util.Date;

public class Usuario {

	private long legajo;
	private String nombre;
	private String apellido;
	private Date fechaNac;
	private String correo;
	private float reputacion;

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

}