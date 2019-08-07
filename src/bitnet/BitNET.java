/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitnet;

import controlador.Controlador;
import controlador.Persistencia;

/**
 *
 * @author Santy Villar
 */
public class BitNET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BitNETPU");
        Persistencia p = new Persistencia(emf);
        Controlador c1 = new Controlador(p);
        
    }
    
}
