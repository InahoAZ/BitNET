package modelo;
import java.util.Date;
import javax.persistence.Entity;


@Entity
@Table (name="preguntas")
public class Pregunta {
        
        @Id
	private int idPregunta;
	private String pregunta;
	private String descripcion;
	private Date fechaPublicacion;

        public Pregunta() {
        }

        public Pregunta(String pregunta, String descripcion, Date fechaPublicacion) {
            this.pregunta = pregunta;
            this.descripcion = descripcion;
            this.fechaPublicacion = fechaPublicacion;
        }

        public int getIdPregunta() {
            return idPregunta;
        }

        public void setIdPregunta(int idPregunta) {
            this.idPregunta = idPregunta;
        }

        public String getPregunta() {
            return pregunta;
        }

        public void setPregunta(String pregunta) {
            this.pregunta = pregunta;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public Date getFechaPublicacion() {
            return fechaPublicacion;
        }

        public void setFechaPublicacion(Date fechaPublicacion) {
            this.fechaPublicacion = fechaPublicacion;
        }


        /**
         * 
         * @param unaRespuesta
         */
        public void añadirRespuesta(Respuesta unaRespuesta) {
                // TODO - implement Pregunta.añadirRespuesta
                throw new UnsupportedOperationException();
        }

	/**
	 * 
	 * @param unaRespuesta
	 */
	public void eliminarRespuesta(Respuesta unaRespuesta) {
		// TODO - implement Pregunta.eliminarRespuesta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unReporte
	 */
	public void añadirReporte(Reporte unReporte) {
		// TODO - implement Pregunta.añadirReporte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaBusqueda
         * @return 
	 */
	public boolean compararPregunta(String unaBusqueda) {
		// TODO - implement Pregunta.compararPregunta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaBusqueda
         * @return 
	 */
	public boolean compararDescripcion(String unaBusqueda) {
		// TODO - implement Pregunta.compararDescripcion
		throw new UnsupportedOperationException();
	}

}