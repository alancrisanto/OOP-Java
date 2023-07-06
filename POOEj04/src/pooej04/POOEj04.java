/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej04;

import Entidad.Rectangulo;
import Servicios.ServicioRectangulo;

/**
 *
 * @author Crisvall
 */
public class POOEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioRectangulo rectangulo = new ServicioRectangulo();
        Rectangulo rect1 = rectangulo.crearRectangulo();
        
        rectangulo.perimetro(rect1);
        rectangulo.superficie(rect1);
    }
    
}
