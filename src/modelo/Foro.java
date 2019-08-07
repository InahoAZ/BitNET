package modelo;
@Entity
@Table(name="foro")
public class Foro {
        @Id
	private int idForo;
	private String titulo;
	private String descripcion;

        public Foro() {
        }

        public Foro(String titulo, String descripcion) {
            this.titulo = titulo;
            this.descripcion = descripcion;
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