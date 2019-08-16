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
	
	public List<Foro> verListadoDeForos() {
            return this.p.buscarActivos(Foro.class);
	}       
        
        public List<Usuario> verListadoDeUsuarios(){
            return this.p.buscarActivos(Usuario.class);
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
                    unaPregunta.setBorrado(true);
                    this.p.modificar(unaPregunta);                    
                    this.p.confirmarTransaccion();
                }catch(Exception e){
                    System.out.println("Errorcito: " + e.getMessage());
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
                        //System.out.println("F"+i);
                        Foro unForo = foro.get(i);
                        List<Pregunta> pregunta=unForo.getPreguntas();
                        int j=0;
                        //System.out.println("tamanio> "+pregunta.size());
                        int size = pregunta.size();
                        while(j<size){
                           // System.out.println("vuelta n: "+ j);
                            Pregunta unaPregunta = pregunta.get(j);
                            if(!unaPregunta.isBorrado()){
                                boolean retorno1=unaPregunta.compararPregunta(unaBusqueda);
                                boolean retorno2=unaPregunta.compararDescripcion(unaBusqueda);
                                if(retorno1||retorno2){
                                    System.out.println("encontre "+j);
                                    ResultadoPregunta.add(unaPregunta);
                                }
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
                    Respuesta unaRespuesta= new Respuesta(respuesta,unaPregunta,unUsuario);
                    unaPregunta.añadirRespuesta(unaRespuesta);
                    unUsuario.añadirRespuesta(unaRespuesta);
                    this.p.modificar(unaPregunta);
                    this.p.modificar(unUsuario);
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
                    unaRespuesta.setBorrado(true);
                    this.p.modificar(unaRespuesta);
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
                     Voto unVoto = usuarioActual.buscarVotoRespuesta(unaRespuesta);
                     int puntaje = unaRespuesta.getPuntaje();
                     float reputacion=unUsuario.getReputacion();                     
                     if(positivo){
                        if(unVoto == null){                            
                            unaRespuesta.setPuntaje(puntaje + 1);                            
                            unUsuario.setReputacion(reputacion + 1);                            
                            //Creamos instancia de Voto
                            unVoto = new Voto(unaRespuesta,usuarioActual,positivo);                           
                            
                            //Asociamos el voto al usuario y a la respuesta
                            unaRespuesta.añadirPuntajeUsuario(unVoto);
                            usuarioActual.añadirPuntajeRespuesta(unVoto);                            
                            
                            this.p.insertar(unVoto);
                            
                            System.out.println("Presiona UP");
                        }else{                            
                            unaRespuesta.setPuntaje(puntaje - 1);                            
                            unUsuario.setReputacion(reputacion - 1);                            
                            
                            //Buscamos el registro de voto que corresponda
                            //Voto unVoto = usuarioActual.buscarVotoRespuesta(unaRespuesta);                            
                            
                            //Eliminamos las asociaciones de usuario - voto - respuesta
                            usuarioActual.eliminarPuntajeRespuesta(unVoto);
                            unaRespuesta.eliminarPuntajeUsuario(unVoto);
                            
                            //Eliminamos el voto del registro
                            this.p.eliminar(unVoto);
                            System.out.println("Despresiona UP");
                        }                       
                        
                     }else{
                        if(usuarioActual.buscarVotoRespuesta(unaRespuesta)== null){                            
                            unaRespuesta.setPuntaje(puntaje - 1);                            
                            unUsuario.setReputacion(reputacion - 1);
                            
                            //Creamos instancia de Voto
                            unVoto = new Voto(unaRespuesta,usuarioActual,positivo);
                            
                            //asociamos usuario - voto - respuesta
                            unaRespuesta.añadirPuntajeUsuario(unVoto);
                            usuarioActual.añadirPuntajeRespuesta(unVoto);
                            
                            this.p.insertar(unVoto);
                            
                            System.out.println("Presiona DOWN");
                        }else{                            
                            unaRespuesta.setPuntaje(puntaje + 1);                            
                            unUsuario.setReputacion(reputacion + 1);
                            //usuarioActual.eliminarPuntajeRespuesta(unaRespuesta);
                            System.out.println("Despresiona DOWN");
                            
                            //Buscamos el registro de voto que corresponda
                            //Voto unVoto = usuarioActual.buscarVotoRespuesta(unaRespuesta);                            
                            
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
                    unForo.setBorrado(true);
                    this.p.modificar(unForo);
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
                    List<Usuario> usuario = this.p.buscarActivos(Usuario.class);//no esta en dsd
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
                    unUsuario.setBorrado(true);
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
	 * @param unaPregunta
	 * @param unUsuario
	 */
	public void reportarPregunta(String causa, Pregunta unaPregunta, Usuario unUsuario) {
		try{
                    this.p.iniciarTransaccion();
                    Reporte unReporte= new Reporte(causa,unaPregunta,unUsuario);
                    unaPregunta.añadirReporte(unReporte);
                    unUsuario.añadirReporte(unReporte);
                    this.p.modificar(unaPregunta);
                    this.p.modificar(unUsuario);
                    this.p.confirmarTransaccion();
                    JOptionPane.showMessageDialog(null,"Se Generó su reporte");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
            
	}

	public void reportarRespuesta(String causa, Respuesta unaRespuesta, Usuario unUsuario) {
		try{
                    this.p.iniciarTransaccion();
                    Reporte unReporte= new Reporte(causa,unaRespuesta,unUsuario);
                    unaRespuesta.añadirReporte(unReporte);
                    unUsuario.añadirReporte(unReporte);
                    this.p.modificar(unaRespuesta);
                    this.p.modificar(unUsuario);                    
                    this.p.confirmarTransaccion();
                    JOptionPane.showMessageDialog(null,"Se Generó su reporte");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    this.p.descartarTransaccion();
                }
	}

	public List<Reporte> verReportesPreguntas() {
		//no esta igual que en diagrama
                try{
                    List<Reporte>ListaReportes=new ArrayList<>();
                    List<Pregunta> preguntas = this.p.buscarActivos(Pregunta.class);//no esta en dsd
                    int i = 0;
                    System.out.println("tamanio "+preguntas.size());
                    int size = preguntas.size();
                    while(i<size){
                        System.out.println("vueltita n "+i);
                        Pregunta unaPregunta=preguntas.get(i);
                        if(!unaPregunta.getReportes().isEmpty()){
                            for (int j = 0;j < unaPregunta.getReportes().size(); j++) {
                                Reporte reporte= unaPregunta.getReportes().get(j);
                                ListaReportes.add(reporte);
                            }
                        }
                        i++;
                    }
                    if(ListaReportes.isEmpty()){
                         return ListaReportes;
                    }else{
                        return ListaReportes;
                    }
                }catch(HeadlessException e){
                    System.out.println(e.getMessage());
                    List<Reporte> repo = new ArrayList<>();
                    return repo;
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
                    List<Respuesta> respuestas = this.p.buscarActivos(Respuesta.class);//no esta en dsd
                    int i = 0;
                    int size = respuestas.size();
                    while(i<size){
                        Respuesta unaRespuesta=respuestas.get(i);
                        if(!unaRespuesta.getReportes().isEmpty()){
                            for (int j = 0; j < unaRespuesta.getReportes().size(); j++) {
                                Reporte Reportes=unaRespuesta.getReportes().get(j);
                                ListaReportes.add(Reportes);
                            }
                        }
                        
                        i++;
                    }
                    if(ListaReportes.isEmpty()){
                        return ListaReportes;
                    }else{
                        return ListaReportes;
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    List<Reporte> vacia = new ArrayList<>();
                     return vacia;
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