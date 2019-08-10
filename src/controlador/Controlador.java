package controlador;

import java.util.ArrayList;
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
                Pregunta unaPregunta = new Pregunta(pregunta, descripcion, unForo, unUsuario);
                unForo.añadirPregunta(unaPregunta);
                unUsuario.añadirPregunta(unaPregunta);
                this.p.insertar(unaPregunta);
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
		try{
                    this.p.iniciarTransaccion();
                    Foro unForo= unaPregunta.getForo();
                    unForo.eliminarPregunta(unaPregunta);
                    Usuario unUsuario = unaPregunta.getUsuario();
                    unUsuario.eliminarPregunta(unaPregunta);
                    this.p.modificar(unForo);
                    this.p.modificar(unUsuario);
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
	}

	/**
	 * 
	 * @param unaBusqueda
	 */
	public List<Pregunta> buscarPregunta(String unaBusqueda) {
		try{
                    List<Foro> foro=new ArrayList<>();
                    List<Pregunta>ResultadoPregunta=new ArrayList<>();
                    int i=0;
                    while(foro.get(i)!=null){
                        Foro unForo = foro.get(i);
                        List<Pregunta> pregunta=unForo.getPreguntas();
                        int j=0;
                        while(pregunta.get(j)!=null){
                            Pregunta unaPregunta = pregunta.get(j);
                            boolean retorno1=unaPregunta.compararPregunta(unaBusqueda);
                            boolean retorno2=unaPregunta.compararDescripcion(unaBusqueda);
                            if(retorno1||retorno2){
                                ResultadoPregunta.add(unaPregunta);
                            }
                        }    
                    }
                    if(ResultadoPregunta.isEmpty()){
                        JOptionPane.showMessageDialog(null,"No se encontraron coincidencias de Preguntas");
                        return null;
                    }else{
                        return ResultadoPregunta;
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    return null;
                }
        }
	/**
	 * 
	 * @param respuesta
	 * @param unaPregunta
	 * @param unUsuario
	 */
	public void añadirRespuesta(String respuesta, Pregunta unaPregunta, Usuario unUsuario) {
		try{
                    this.p.iniciarTransaccion();
                    Respuesta unaRespuesta= new Respuesta(respuesta,unaPregunta,unUsuario);
                    unaPregunta.añadirRespuesta(unaRespuesta);
                    unUsuario.añadirRespuesta(unaRespuesta);
                    this.p.insertar(unaRespuesta);
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
	}

	/**
	 * 
	 * @param unaRespuesta
	 */
	public void eliminarRespuesta(Respuesta unaRespuesta) {
		try{
                    this.p.iniciarTransaccion();
                    Pregunta unaPregunta=unaRespuesta.getPregunta();
                    unaPregunta.eliminarRespuesta(unaRespuesta);
                    Usuario unUsuario = unaRespuesta.getUsuario();
                    unUsuario.eliminarRespuesta(unaRespuesta);
                    this.p.modificar(unaPregunta);
                    this.p.modificar(unUsuario);
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
                
	}

	/**
	 * 
	 * @param unaRespuesta
	 * @param positivo
	 */
	public void puntuarRespuesta(Respuesta unaRespuesta, boolean positivo) {
		try{
                     this.p.iniciarTransaccion();
                     Usuario unUsuario=unaRespuesta.getUsuario();
                     if(positivo=true){
                        int puntaje = unaRespuesta.getPuntaje();
                        unaRespuesta.setPuntaje(puntaje + 1);
                        float reputacion=unUsuario.getReputacion();
                        unUsuario.setReputacion(reputacion + 1);
                     }else{
                        int puntaje = unaRespuesta.getPuntaje();
                        unaRespuesta.setPuntaje(puntaje - 1);
                        float reputacion=unUsuario.getReputacion();
                        unUsuario.setReputacion(reputacion - 1);
                     }
                     this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
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
		try{
                    this.p.iniciarTransaccion();
                    this.p.modificar(unForo);
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
	public void eliminarForo(Foro unForo) {
		try{
                    this.p.iniciarTransaccion();
                    this.p.eliminar(unForo);
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
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
		//no esta igual en el diagrama, hay que actualizar DSD
                try{
                    List<Usuario>ListaUsuario=new ArrayList<>();
                    List<Usuario> usuario = this.p.buscarTodos(Usuario.class);//no esta en dsd
                    int i = 0;
                    while(usuario.get(i)!=null){
                        Usuario unUsuario=usuario.get(i);
                        boolean retorno1=unUsuario.compararNombre(unaBusqueda);
                        boolean retorno2=unUsuario.compararApellido(unaBusqueda);
                        if(retorno1||retorno2){
                            ListaUsuario.add(unUsuario);
                        }
                        i++;
                    }
                    if(ListaUsuario.isEmpty()){//a partir de aca no esta en dsd
                        JOptionPane.showMessageDialog(null,"No se encontraron coincidencias");
                         return null;
                    }else{
                        return ListaUsuario;
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                     return null;
                }
       
	}

	/**
	 * 
	 * @param unUsuario
	 */
	public void modificarUsuario(Usuario unUsuario) {
		try{
                    System.out.println(unUsuario);
                    this.p.iniciarTransaccion();
                    this.p.modificar(unUsuario);
                    System.out.println("modifica");
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println("Errorcito------>" + e.getMessage());
                    this.p.descartarTransaccion();
                }
	}

	/**
	 * 
	 * @param unUsuario
	 */
	public void eliminarUsuario(Usuario unUsuario) {
		try{
                    this.p.iniciarTransaccion();
                    this.p.eliminar(unUsuario);
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
	}

	/**
	 * 
	 * @param causa
	 * @param unaPregunta
	 * @param unUsuario
	 */
	public void reportarPregunta(String causa, Pregunta unaPregunta, Usuario unUsuario) {
		try{
                    this.p.iniciarTransaccion();
                    Reporte reporte= new Reporte(causa,unaPregunta,unUsuario);
                    unaPregunta.añadirReporte(reporte);
                    unUsuario.añadirReporte(reporte);
                    this.p.modificar(unaPregunta);
                    this.p.modificar(unUsuario);
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
            
	}

	/**
	 * 
	 * @param causa
	 * @param unaRespuesta
	 * @param unUsuario
	 */
	public void reportarRespuesta(String causa, Respuesta unaRespuesta, Usuario unUsuario) {
		try{
                    this.p.iniciarTransaccion();
                    Reporte reporte= new Reporte(causa,unaRespuesta,unUsuario);
                    unaRespuesta.añadirReporte(reporte);
                    unUsuario.añadirReporte(reporte);
                    this.p.modificar(unaRespuesta);
                    this.p.modificar(unUsuario);
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
	}

	public List<Reporte> verReportesPreguntas() {
		//no esta igual que en diagrama
                try{
                    List<Reporte>ListaReportes=new ArrayList<>();
                    List<Pregunta> preguntas = this.p.buscarTodos(Pregunta.class);//no esta en dsd
                    int i = 0;
                    while(preguntas.get(i)!=null){
                        Pregunta unaPregunta=preguntas.get(i);
                        Reporte Reportes=unaPregunta.getReportes().get(i);
                        ListaReportes.add(Reportes);
                        i++;
                    }
                    if(ListaReportes.isEmpty()){
                        JOptionPane.showMessageDialog(null,"No se encontraron Reportes de Preguntas");
                         return null;
                    }else{
                        return ListaReportes;
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                     return null;
                }
	}

	/**
	 * 
	 * @param unReporte
	 */
	public void rechazarReporte(Reporte unReporte) {
		try{
                    this.p.iniciarTransaccion();
                    unReporte.setBorrado(true);
                    this.p.modificar(unReporte);
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
	}

	public List<Reporte> verReportesRespuestas() {
		//no esta igual que en diagrama
                try{
                    List<Reporte>ListaReportes=new ArrayList<>();
                    List<Respuesta> respuestas = this.p.buscarTodos(Respuesta.class);//no esta en dsd
                    int i = 0;
                    while(respuestas.get(i)!=null){
                        Respuesta unaRespuesta=respuestas.get(i);
                        Reporte Reportes=unaRespuesta.getReportes().get(i);
                        ListaReportes.add(Reportes);
                        i++;
                    }
                    if(ListaReportes.isEmpty()){
                        JOptionPane.showMessageDialog(null,"No se encontraron Reportes de Respuestas");
                         return null;
                    }else{
                        return ListaReportes;
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                     return null;
                }
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