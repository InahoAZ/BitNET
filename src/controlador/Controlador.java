package controlador;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Foro;
import modelo.Pregunta;
import modelo.Reporte;
import modelo.Respuesta;
import modelo.Rol;
import modelo.Usuario;

public class Controlador {
    private Persistencia p;
    
        public Controlador(Persistencia p) {
            this.p = p;
        }

	/**
	 * 
	 * @param unForo
         * @return 
	 */
	public List<Pregunta> verListadoDePreguntas(Foro unForo) {
                return unForo.getPreguntas();		
	}

	public List<Foro> verListadoDeForos() {
		return this.p.buscarTodos(Foro.class);
	}
        
        public List<Usuario> verListadoDeUsuarios(){
            return this.p.buscarTodos(Usuario.class);
        }
	/**
	 * 
	 * @param pregunta
	 * @param descripcion
	 * @param unForo
	 * @param unUsuario
	 */
	public void añadirPregunta(String pregunta, String descripcion, Foro unForo, Usuario unUsuario) {
            try{
                this.p.iniciarTransaccion();
                System.out.println("1");
                Pregunta unaPregunta = new Pregunta(pregunta, descripcion, unForo, unUsuario);
                System.out.println("1.1");
                System.out.println("forito: " + unForo);
                unForo.añadirPregunta(unaPregunta);
                System.out.println("2");
                //unUsuario.añadirPregunta(unaPregunta);
                System.out.println("3");
                this.p.insertar(unaPregunta);
                System.out.println("insert");
                this.p.confirmarTransaccion();
            }catch(Exception e){
                System.out.println("errorcito: " + e.getMessage());
                this.p.descartarTransaccion();
                
            }
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
		try{
                    this.p.iniciarTransaccion();
                    Foro unForo = new Foro(titulo, descripcion);
                    this.p.insertar(unForo);
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
                
                
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
     * @param legajo
     * @param nombre
     * @param apellido
     * @param fechaNac
     * @param correo
     * @param password
     * @param rol
	 */
	public void añadirUsuario(String legajo, String nombre, String apellido, Date fechaNac, String correo, String password, Rol rol) {
            try{
                this.p.iniciarTransaccion();
                Usuario unUsuario = new Usuario(legajo, nombre, apellido, fechaNac, correo, password, rol);
                rol.añadirUsuario(unUsuario);
                this.p.modificar(rol);
                this.p.insertar(unUsuario);
                this.p.confirmarTransaccion();
            }catch(Exception e){
                System.out.println(e.getMessage());
                this.p.descartarTransaccion();
            }
	}

        public List<Rol> verListadoDeRoles(){     
            return this.p.buscarTodos(Rol.class);        
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
        
        public Usuario iniciarSesion(String legajo, String password){
            try{                
                System.out.println("Inician2 Sesion");
                Usuario unUsuario = this.p.buscar(Usuario.class, legajo);
                if (unUsuario.compararPassword(password)) {
                    System.out.println("Inicio un espectaculo");
                    return unUsuario;                
                }else{
                    System.out.println("no inicio nada");
                    return null;
                }                
            }catch(Exception e){
                System.out.println("errorcito: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
                
            }
        return null;
        }

}