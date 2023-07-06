/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo06;

import Entidad.Cafetera;
import Servicios.ServiciosCafetera;

/**
 *
 * @author Crisvall
 */
public class POO06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosCafetera cafeService = new ServiciosCafetera();
        Cafetera cafetera = cafeService.llenarCafetera();
        cafeService.servirTaza(cafetera);
        cafeService.vaciarCafetera();
        cafeService.agregarCafe();
    }
    
}
    