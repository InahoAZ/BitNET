package controlador;

import java.util.List;
import modelo.Foro;
import modelo.Pregunta;
import modelo.Reporte;
import modelo.Respuesta;
import modelo.Usuario;

public class Controlador {

	/**
	 * 
	 * @param unForo
         * @return 
	 */
	public List<Pregunta> verListadoDePreguntas(int unForo) {
		// TODO - implement Controlador.verListadoDePreguntas
		throw new UnsupportedOperationException();
	}

	public List<Foro> verListadoDeForos() {
		// TODO - implement Controlador.verListadoDeForos
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pregunta
	 * @param descripcion
	 * @param unForo
	 * @param unUsuario
	 */
	public void añadirPregunta(String pregunta, String descripcion, Foro unForo, Usuario unUsuario) {
		// TODO - implement Controlador.añadirPregunta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaPregunta
	 */
	public void eliminarPregunta(Pregunta unaPregunta) {
		// TODO - implement Controlador.eliminarPregunta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaBusqueda
	 */
	public List<Pregunta> buscarPregunta(String unaBusqueda) {
		// TODO - implement Controlador.buscarPregunta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param respuesta
	 * @param unaPregunta
	 * @param unUsuario
	 */
	public void añadirRespuesta(String respuesta, Pregunta unaPregunta, Usuario unUsuario) {
		// TODO - implement Controlador.añadirRespuesta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaRespuesta
	 */
	public void eliminarRespuesta(Respuesta unaRespuesta) {
		// TODO - implement Controlador.eliminarRespuesta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaRespuesta
	 * @param positivo
	 */
	public void puntuarRespuesta(Respuesta unaRespuesta, boolean positivo) {
		// TODO - implement Controlador.puntuarRespuesta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param titulo
	 * @param descripcion
	 */
	public void añadirForo(String titulo, String descripcion) {
		// TODO - implement Controlador.añadirForo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unForo
	 */
	public void modificarForo(Foro unForo) {
		// TODO - implement Controlador.modificarForo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unForo
	 */
	public void eliminarForo(Foro unForo) {
		// TODO - implement Controlador.eliminarForo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unUsuario
	 */
	public void añadirUsuario(Usuario unUsuario) {
		// TODO - implement Controlador.añadirUsuario
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaBusqueda
         * @return 
	 */
	public List<Usuario> buscarUsuario(String unaBusqueda) {
		// TODO - implement Controlador.buscarUsuario
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unUsuario
	 */
	public void modificarUsuario(Usuario unUsuario) {
		// TODO - implement Controlador.modificarUsuario
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unUsuario
	 */
	public void eliminarUsuario(Usuario unUsuario) {
		// TODO - implement Controlador.eliminarUsuario
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param causa
	 * @param unaPregunta
	 * @param unUsuario
	 */
	public void reportarPregunta(String causa, Pregunta unaPregunta, Usuario unUsuario) {
		// TODO - implement Controlador.reportarPregunta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param causa
	 * @param unaRespuesta
	 * @param unUsuario
	 */
	public void reportarRespuesta(String causa, Respuesta unaRespuesta, Usuario unUsuario) {
		// TODO - implement Controlador.reportarRespuesta
		throw new UnsupportedOperationException();
	}

	public List<Reporte> verReportesPreguntas() {
		// TODO - implement Controlador.verReportesPreguntas
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unReporte
	 */
	public void rechazarReporte(Reporte unReporte) {
		// TODO - implement Controlador.rechazarReporte
		throw new UnsupportedOperationException();
	}

	public List<Reporte> verReportesRespuestas() {
		// TODO - implement Controlador.verReportesRespuestas
		throw new UnsupportedOperationException();
	}

}