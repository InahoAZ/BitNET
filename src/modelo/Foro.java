package modelo;

import java.util.ArrayList;
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
        @SequenceGenerator(name="sec_idforo", initialValue=1, allocationSize=1)
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_idforo")
	private int idForo;
	private String titulo;
	private String descripcion;
        @OneToMany(mappedBy = "foro")
        private List<Pregunta> preguntas=new ArrayList<>();
        private boolean borrado;
        
        public Foro() {
            this.preguntas = new ArrayList<>();
            this.borrado = false;
        }

        public Foro(String titulo, String descripcion) {
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.preguntas = new ArrayList<>();
            this.borrado = false;
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
            System.out.print("añadirPregunta Foro: ");
            this.preguntas.add(unaPregunta);
            System.out.println("OK");
	}

	/**
	 * 
	 * @param unaPregunta
	 */
	public void eliminarPregunta(Pregunta unaPregunta) {
		this.preguntas.remove(unaPregunta);
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

        public boolean isBorrado() {
            return borrado;
        }

        public void setBorrado(boolean borrado) {
            this.borrado = borrado;
        }
        

        @Override
        public String toString() {
            return "" + titulo + "  " + descripcion;
        }
        
        
        
        

}