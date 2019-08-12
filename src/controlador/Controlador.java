package controlador;

import java.awt.HeadlessException;
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
import modelo.Voto;

public class Controlador {
    private Persistencia p;
    
        public Controlador(Persistencia p) {
            this.p = p;
        }
        //Dejo algo ranciowich por aqui
        public List<Pregunta> returnVacio(){
            Foro unForo=new Foro();
            return unForo.getPreguntas();
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
        public List<Respuesta> verRespuestas(Pregunta unaPregunta){
            return unaPregunta.getRespuestas();
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
     * @return 
	 */
	public List<Pregunta> buscarPregunta(String unaBusqueda) {
		try{
                    List<Foro> foro=this.p.buscarTodos(Foro.class);
                    List<Pregunta>ResultadoPregunta=new ArrayList<>();
                    int i=0;
                    int sizeForo = foro.size();
                    while(i<sizeForo){
                        System.out.println("F"+i);
                        Foro unForo = foro.get(i);
                        List<Pregunta> pregunta=unForo.getPreguntas();
                        int j=0;
                        System.out.println("tamanio> "+pregunta.size());
                        int size = pregunta.size();
                        while(j<size){
                            System.out.println("vuelta n: "+ j);
                            Pregunta unaPregunta = pregunta.get(j);
                            boolean retorno1=unaPregunta.compararPregunta(unaBusqueda);
                            boolean retorno2=unaPregunta.compararDescripcion(unaBusqueda);
                            if(retorno1||retorno2){
                                System.out.println("encontre "+j);
                                ResultadoPregunta.add(unaPregunta);
                            }
                            j++;
                        } 
                        i++;
                    }
                    if(ResultadoPregunta.isEmpty()){
                        JOptionPane.showMessageDialog(null,"No se encontraron coincidencias de Preguntas");
                        //return null;
                    }else{
                        return ResultadoPregunta;
                    }
                    return ResultadoPregunta;

                }catch(HeadlessException e){
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
                    System.out.println("Pregunta recibi3> "+ unaPregunta+" usr recib2> "+unUsuario);
                    Respuesta unaRespuesta= new Respuesta(respuesta,unaPregunta,unUsuario);
                    System.out.println(""+unaRespuesta);
                    unaPregunta.añadirRespuesta(unaRespuesta);
                    System.out.println("1");
                    unUsuario.añadirRespuesta(unaRespuesta);
                    System.out.println("2");
                    this.p.modificar(unaPregunta);
                    System.out.println("3");
                    this.p.modificar(unUsuario);
                    System.out.println("4");
                    this.p.insertar(unaRespuesta);
                    System.out.println("5");
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
         * @param usuarioActual
	 * @param positivo
	 */
	public void puntuarRespuesta(Respuesta unaRespuesta, Usuario usuarioActual, boolean positivo) {
		try{
                     this.p.iniciarTransaccion();
                     Usuario unUsuario=unaRespuesta.getUsuario();
                     //Voto unVoto = new Voto();
                     if(positivo){
                        if(usuarioActual.buscarVotoRespuesta(unaRespuesta)== null){
                            int puntaje = unaRespuesta.getPuntaje();
                            unaRespuesta.setPuntaje(puntaje + 1);
                            float reputacion=unUsuario.getReputacion();
                            unUsuario.setReputacion(reputacion + 1);
                            
                            //Creamos instancia de Voto
                            Voto unVoto = new Voto(unaRespuesta,usuarioActual,positivo);                            
                            
                            //Asociamos el voto al usuario y a la respuesta
                            unaRespuesta.añadirPuntajeUsuario(unVoto);
                            usuarioActual.añadirPuntajeRespuesta(unVoto);                            
                            
                            this.p.insertar(unVoto);
                            
                            System.out.println("Presiona UP");
                        }else{
                            int puntaje = unaRespuesta.getPuntaje();
                            unaRespuesta.setPuntaje(puntaje - 1);
                            float reputacion=unUsuario.getReputacion();
                            unUsuario.setReputacion(reputacion - 1);                            
                            
                            //Buscamos el registro de voto que corresponda
                            Voto unVoto = usuarioActual.buscarVotoRespuesta(unaRespuesta);                            
                            
                            //Eliminamos las asociaciones de usuario - voto - respuesta
                            usuarioActual.eliminarPuntajeRespuesta(unVoto);
                            unaRespuesta.eliminarPuntajeUsuario(unVoto);
                            
                            //Eliminamos el voto del registro
                            this.p.eliminar(unVoto);
                            System.out.println("Despresiona UP");
                        }                       
                        
                     }else{
                        if(usuarioActual.buscarVotoRespuesta(unaRespuesta)== null){
                            int puntaje = unaRespuesta.getPuntaje();
                            unaRespuesta.setPuntaje(puntaje - 1);
                            float reputacion=unUsuario.getReputacion();
                            unUsuario.setReputacion(reputacion - 1);
                            
                            //Creamos instancia de Voto
                            Voto unVoto = new Voto(unaRespuesta,usuarioActual,positivo);
                            
                            //asociamos usuario - voto - respuesta
                            unaRespuesta.añadirPuntajeUsuario(unVoto);
                            usuarioActual.añadirPuntajeRespuesta(unVoto);
                            
                            this.p.insertar(unVoto);
                            
                            System.out.println("Presiona DOWN");
                        }else{
                            int puntaje = unaRespuesta.getPuntaje();
                            unaRespuesta.setPuntaje(puntaje + 1);
                            float reputacion=unUsuario.getReputacion();
                            unUsuario.setReputacion(reputacion + 1);
                            //usuarioActual.eliminarPuntajeRespuesta(unaRespuesta);
                            System.out.println("Despresiona DOWN");
                            
                            //Buscamos el registro de voto que corresponda
                            Voto unVoto = usuarioActual.buscarVotoRespuesta(unaRespuesta);                            
                            
                            //Eliminamos las asociaciones de usuario - voto - respuesta
                            usuarioActual.eliminarPuntajeRespuesta(unVoto);
                            unaRespuesta.eliminarPuntajeUsuario(unVoto);
                            
                            //Eliminamos el voto del registro
                            this.p.eliminar(unVoto);
                        }
                     }                     
                     this.p.modificar(unaRespuesta);
                     this.p.modificar(unUsuario);
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
                    int size = usuario.size();
                    while(i<size){
                        Usuario unUsuario=usuario.get(i);
                        boolean retorno1=unUsuario.compararNombre(unaBusqueda);
                        boolean retorno2=unUsuario.compararApellido(unaBusqueda);
                        if(retorno1||retorno2){
                            ListaUsuario.add(unUsuario);
                        }
                        i++;
                    }
                    
                    if(ListaUsuario.isEmpty()){//a partir de aca no esta en dsd
                        JOptionPane.showMessageDialog(null,"No se encontraron coincidencias en usuarios");
                        return ListaUsuario;
                    }else{
                        return ListaUsuario;
                    }
                }catch(HeadlessException e){
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

	public void reportarRespuesta(String causa, Respuesta unaRespuesta, Usuario unUsuario) {
		try{
                    this.p.iniciarTransaccion();
                    Reporte reporte= new Reporte(causa,unaRespuesta,unUsuario);
                    unaRespuesta.añadirReporte(reporte);
                    unUsuario.añadirReporte(reporte);
                    this.p.modificar(unaRespuesta);
                    this.p.modificar(unUsuario);
                    JOptionPane.showMessageDialog(null,"Se Generó su reporte");
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