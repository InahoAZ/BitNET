package modelo;
import java.util.Date;

public class Respuesta {

	private int idRespuesta;
	private String respuesta;
	private int puntaje;
	private Date fechaPublicacion;

        public Respuesta(){
        
        }
        
        public Respuesta(String respuesta, int puntaje, Date fechaPublicacion) {
            this.respuesta = respuesta;
            this.puntaje = puntaje;
            this.fechaPublicacion = fechaPublicacion;
        }

        
	/**
	 * 
	 * @param unReporte
	 */
	public void añadirReporte(Reporte unReporte) {
		// TODO - implement Respuesta.añadirReporte
		throw new UnsupportedOperationException();
	}

         
}