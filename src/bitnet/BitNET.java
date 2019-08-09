package bitnet;

import controlador.Controlador;
import controlador.Persistencia;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import modelo.Rol;
import modelo.Usuario;
import vista.VistaLogin;
import vista.VistaPreguntas;
import vista.VistaPrincipal;

public class BitNET {


    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BitNETPU");
        Persistencia p = new Persistencia(emf);
        Controlador c1 = new Controlador(p);
        VistaLogin vp = new VistaLogin(c1);
        
        /*Usuario usrVacio = null;
        JFrame ventanaVacia=null;
        VistaPrincipal vp = new VistaPrincipal(c1,ventanaVacia,usrVacio);*/
    }
    
}
