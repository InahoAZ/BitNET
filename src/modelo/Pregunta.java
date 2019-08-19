package modelo;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        @SequenceGenerator(name="sec_idpregunta", initialValue=1, allocationSize=1)
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_idpregunta")
	private int idPregunta;
	private String pregunta;
	private String descripcion;
        private boolean borrado;
        
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date fechaPublicacion;
        
        @ManyToOne
        private Foro foro;
        
        @OneToMany(mappedBy = "pregunta")
        private List<Respuesta> respuestas;
        
        @OneToMany(mappedBy = "pregunta")
        private List<Reporte> reportes;
        
        @ManyToOne
        private Usuario usuario;
        

        public Pregunta() {
            this.respuestas = new ArrayList<>();
            this.reportes = new ArrayList<>();
            this.borrado = false;
        }

        public Pregunta(String pregunta, String descripcion, Foro unForo, Usuario unUsuario) {
            this.respuestas = new ArrayList<>();
            this.reportes = new ArrayList<>();
            this.pregunta = pregunta;
            this.descripcion = descripcion;
            this.fechaPublicacion = new Date();
            this.foro = unForo;            
            this.usuario = unUsuario;
            this.borrado = false;
            
            
        }

        public boolean isBorrado() {
            return borrado;
        }

        public void setBorrado(boolean borrado) {
            this.borrado = borrado;
        }

        
        public Foro getForo() {
            return foro;
        }

        public void setForo(Foro foro) {
            this.foro = foro;
        }

        public List<Respuesta> getRespuestas() {
            return respuestas;
        }

        public void setRespuestas(List<Respuesta> respuestas) {
            this.respuestas = respuestas;
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
        
        public String getFechaPublicacionLinda(){
            Format formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.format(this.fechaPublicacion);            
        }

        public void setFechaPublicacion(Date fechaPublicacion) {
            this.fechaPublicacion = fechaPublicacion;
        }


        /**
         * 
         * @param unaRespuesta
         */
        public void añadirRespuesta(Respuesta unaRespuesta) {
                this.respuestas.add(unaRespuesta);
        }

	/**
	 * 
	 * @param unaRespuesta
	 */
	public void eliminarRespuesta(Respuesta unaRespuesta) {
		this.respuestas.remove(unaRespuesta);
	}

	/**
	 * 
	 * @param unReporte
	 */
	public void añadirReporte(Reporte unReporte) {
		this.reportes.add(unReporte);
	}

	/**
	 * 
	 * @param unaBusqueda
         * @return 
	 */
	public boolean compararPregunta(String unaBusqueda) {
		return this.pregunta.toUpperCase().contains(unaBusqueda.toUpperCase());
	}

	/**
	 * 
	 * @param unaBusqueda
         * @return 
	 */
	public boolean compararDescripcion(String unaBusqueda) {
		return this.descripcion.toUpperCase().contains(unaBusqueda.toUpperCase());
	}

    @Override
    public String toString() {
        return "" + pregunta + "  " + descripcion + "  " + fechaPublicacion;
    }
        
        

}