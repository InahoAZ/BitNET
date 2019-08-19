/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Santy Villar
 */

@Entity
@Table(name = "voto")
public class Voto {    
    @Id
    @SequenceGenerator(name="sec_idrespuesta", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_idrespuesta")
    private long idVoto;
    private boolean positivo;  
    
    @ManyToOne
    private Respuesta respuestaPuntuada;
    @ManyToOne
    private Usuario usuarioPuntuador;
    
    
    public Voto(){
    
    }
    
    public Voto(Respuesta respuestaPuntuada, Usuario usuarioPuntuador, boolean positivo) {
        this.respuestaPuntuada = respuestaPuntuada;
        this.usuarioPuntuador = usuarioPuntuador;
        this.positivo = positivo;
    }

    public long getIdVoto() {
        return idVoto;
    }

    public void setIdVoto(long idVoto) {
        this.idVoto = idVoto;
    }

    public Respuesta getRespuestaPuntuada() {
        return respuestaPuntuada;
    }

    public void setRespuestaPuntuada(Respuesta respuestaPuntuada) {
        this.respuestaPuntuada = respuestaPuntuada;        
    }

    public Usuario getUsuarioPuntuador() {
        return usuarioPuntuador;
    }

    public void setUsuarioPuntuador(Usuario usuarioPuntuador) {
        this.usuarioPuntuador = usuarioPuntuador;
    }

    public boolean isPositivo() {
        return positivo;
    }

    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }

    
    
    

    

    
}
