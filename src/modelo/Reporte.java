package modelo;

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
        
    public Reporte() {
    }

    public Reporte(String causa) {
        this.causa = causa;
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

    @Override
    public String toString() {
        return "" + causa + "  " + fechaReporte;
    }
    
    

    
}