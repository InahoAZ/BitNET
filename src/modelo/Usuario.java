package modelo;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "usuario")
@DiscriminatorValue("usuario")


public class Usuario {
        @Id
	private String legajo;        
	private String nombre;
	private String apellido;
        
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date fechaNac;
        
	private String correo;
	private float reputacion;
        
        @ManyToOne
        private Rol rol;
        
        @OneToMany(mappedBy = "usuario")
        private List<Pregunta> preguntas;
        
        @OneToMany(mappedBy = "usuario")
        private List<Respuesta> respuestas;
        
        @OneToMany(mappedBy = "usuario")
        private List<Reporte> reportes;
        
        private String password;
        
        @OneToMany(mappedBy="usuarioPuntuador")
        private List<Voto> respuestasPuntuadas;
        
        private boolean borrado;
        
        public Usuario(){
            this.preguntas = new ArrayList<>();
            this.borrado = false;
                  
        }
        
        public Usuario(String legajo, String nombre, String apellido, Date fechaNac, String correo, String password, Rol rol) {
            this.legajo = legajo;
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNac = fechaNac;
            this.correo = correo;
            this.password = password;
            this.preguntas = new ArrayList<>();
            this.rol = rol;
            this.borrado = false;
            
        }
        
	/**
	 * 
	 * @param unaPregunta
	 */
	public void añadirPregunta(Pregunta unaPregunta) {
                System.out.print("añadirPregunta Usuario: ");
                this.preguntas.add(unaPregunta);
                System.out.println("OK");
	}

	/**
	 * 
	 * @param unaRespuesta
	 */
	public void añadirRespuesta(Respuesta unaRespuesta) {
		this.respuestas.add(unaRespuesta);
	}
        
        public void añadirPuntajeRespuesta(Voto unVoto){
                this.respuestasPuntuadas.add(unVoto);
                //unaRespuesta.añadirPuntajeUsuario(this);
        }
        
        public void eliminarPuntajeRespuesta(Voto unVoto){
                this.respuestasPuntuadas.remove(unVoto);
                //unaRespuesta.eliminarPuntajeUsuario(this);
        }
        //Devuelve unVoto que contenga la respuesta pasada por parametro.
        public Voto buscarVotoRespuesta(Respuesta unaRespuesta){
            for(Voto item : this.respuestasPuntuadas){
                if(item.getRespuestaPuntuada().equals(unaRespuesta)){
                    return item;
                }
            }
            return null;
        }

	/**
	 * 
	 * @param unaPregunta
	 */
	public void eliminarPregunta(Pregunta unaPregunta) {
		this.preguntas.remove(unaPregunta);
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
	public boolean compararNombre(String unaBusqueda) {
		return this.nombre.contains(unaBusqueda);
	}

	/**
	 * 
	 * @param unaBusqueda
         * @return 
	 */
	public boolean compararApellido(String unaBusqueda) {
            return this.apellido.contains(unaBusqueda);
	}
        
        public boolean compararPassword(String password){
                System.out.println("pwd recibido: " + (password));
                System.out.println("pwd compara2: " + (this.password));
                return this.password.equals(password);       
        }
        

        public String getLegajo() {
            return legajo;
        }

        public void setLegajo(String legajo) {
            this.legajo = legajo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            System.out.println(apellido);
            this.apellido = apellido;
        }

        public Date getFechaNac() {
            return fechaNac;
        }

        public void setFechaNac(Date fechaNac) {
            this.fechaNac = fechaNac;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public float getReputacion() {
            return reputacion;
        }

        public void setReputacion(float reputacion) {
            this.reputacion = reputacion;
        }

        public Rol getRol() {
            return rol;
        }

        public void setRol(Rol rol) {
            this.rol = rol;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        
        public String getFechaNacLinda(){
            Format formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.format(this.fechaNac);            
        }

        public List<Pregunta> getPreguntas() {
            return preguntas;
        }

        public void setPreguntas(List<Pregunta> preguntas) {
            this.preguntas = preguntas;
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

        public List<Voto> getRespuestasPuntuadas() {
            return respuestasPuntuadas;
        }

        public void setRespuestasPuntuadas(List<Voto> respuestasPuntuadas) {
            this.respuestasPuntuadas = respuestasPuntuadas;
        }

        public boolean isBorrado() {
            return borrado;
        }

        public void setBorrado(boolean borrado) {
            this.borrado = borrado;
        }
        
        
        

        @Override
        public String toString() {
            return "" + nombre + "  " + apellido + "  " + this.getFechaNacLinda() + "  " + correo + "  " + reputacion;
        }
        
        

}