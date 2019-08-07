package modelo;

public class Reporte {

	private int idReporte;
	private String causa;
	private boolean borrado;

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
    
    

    
}