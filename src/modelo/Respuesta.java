package modelo;
import java.text.Format;
import java.text.SimpleDateFormat;
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
        
        @ManyToOne
        private Usuario usuario;
        
        public Respuesta(){
        
        }
        

        public Respuesta(String respuesta, Pregunta unaPregunta, Usuario unUsuario) {
            this.respuesta=respuesta;
            this.pregunta=unaPregunta;
            this.usuario=unUsuario;
            this.fechaPublicacion=new Date();
        }   

        
	/**
	 * 
	 * @param unReporte
	 */
	public void añadirReporte(Reporte unReporte) {
		// TODO - implement Respuesta.añadirReporte
		throw new UnsupportedOperationException();
	}

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public String getFechaPublicacionLinda(){
            Format formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.format(this.fechaPublicacion);            
        }
    
    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public List<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(List<Reporte> reportes) {
        this.reportes = reportes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        

    @Override
    public String toString() {
        return "" + this.respuesta + "  " + this.puntaje + " puntos  " + this.getFechaPublicacionLinda();
    }

         
}