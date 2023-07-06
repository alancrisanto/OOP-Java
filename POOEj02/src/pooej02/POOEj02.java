/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02;

import Entidad.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author Crisvall
 */
public class POOEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibroServicio ls = new LibroServicio();
        
        Libro libro = ls.cargarLibro();
        ls.mostrarLibro(libro);
    }
    
}
