package modelo;
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
@Table (name="preguntas")
public class Pregunta {
        
        @Id
        @SequenceGenerator(name="sec_idPregunta", initialValue=1, allocationSize=1)
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_idPregunta")
	private int idPregunta;
        
	private String pregunta;
	private String descripcion;
        
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date fechaPublicacion;
        
        @ManyToOne
        private Foro foro;
        
        @OneToMany(mappedBy = "pregunta")
        private List<Respuesta> respuestas;
        
        @OneToMany(mappedBy = "pregunta")
        private List<Reporte> reportes;

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