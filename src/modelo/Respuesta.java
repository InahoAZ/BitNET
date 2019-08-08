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
@Table(name="respuesta")
public class Respuesta {
        
        @Id
        @SequenceGenerator(name="sec_idrespuesta", initialValue=1, allocationSize=1)
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_idrespuesta")
	private int idRespuesta;
	private String respuesta;
	private int puntaje;
        
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date fechaPublicacion;
        
        
        @ManyToOne
        private Pregunta pregunta;
        
        @OneToMany(mappedBy = "respuesta")
        private List<Reporte> reportes;
        
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

    @Override
    public String toString() {
        return "" + respuesta + "  " + puntaje + " puntos  " + fechaPublicacion;
    }

         
}