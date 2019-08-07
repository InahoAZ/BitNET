package modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="foro")
public class Foro {
        @Id
        @SequenceGenerator(name="sec_idForo", initialValue=1, allocationSize=1)
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_idForo")
	private int idForo;
	private String titulo;
	private String descripcion;
        @OneToMany(mappedBy = "foro")
        private List<Pregunta> preguntas;
        
        public Foro() {
        }

        public Foro(String titulo, String descripcion) {
            this.titulo = titulo;
            this.descripcion = descripcion;
        }        

        public List<Pregunta> getPreguntas() {
            return preguntas;
        }

        public void setPreguntas(List<Pregunta> preguntas) {
            this.preguntas = preguntas;
        }
        
        
        
	/**
	 * 
	 * @param unaPregunta
	 */
	public void añadirPregunta(Pregunta unaPregunta) {
		// TODO - implement Foro.añadirPregunta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param unaPregunta
	 */
	public void eliminarPregunta(Pregunta unaPregunta) {
		// TODO - implement Foro.eliminarPregunta
		throw new UnsupportedOperationException();
	}

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public int getIdForo() {
            return idForo;
        }

        public void setIdForo(int idForo) {
            this.idForo = idForo;
        }
             
        
        

}