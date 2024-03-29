package modelo;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table (name="reporte")
public class Reporte {
        @Id
        @SequenceGenerator(name="sec_idreporte", initialValue=1, allocationSize=1)
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_idreporte")
	private int idReporte;
        
	private String causa;
	private boolean borrado;
        
        @Temporal(javax.persistence.TemporalType.DATE)
        private Date fechaReporte;
        
        @ManyToOne
        private Pregunta pregunta;
        
        @ManyToOne
        private Respuesta respuesta;
        
        @ManyToOne
        private Usuario usuario;
        
        
    public Reporte() {
    }

    public Reporte(String causa) {
        this.causa = causa;
    }

    public Reporte(String causa, Pregunta unaPregunta, Usuario unUsuario) {
        this.causa=causa;
        this.pregunta=unaPregunta;
        this.usuario = unUsuario;
        this.fechaReporte=new Date();
        this.borrado=false;
    }
    public Reporte(String causa, Respuesta unaRespuesta, Usuario unUsuario) {
        this.causa=causa;
        this.respuesta=unaRespuesta;
        this.usuario = unUsuario;
        this.fechaReporte=new Date();
        this.borrado=false;
    }
    

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
     public Date getFechaReporte() {
        return fechaReporte;
    }
    
    public String getFechaReporteLinda(){
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(this.fechaReporte);            
        }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }    
    
    @Override
    public String toString() {
        return "" + this.causa + "  " + this.getFechaReporteLinda();
    }

   
    
    

    
}