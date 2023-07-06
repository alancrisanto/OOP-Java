/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3_1;

import Entidad.Operacion;
import Servicios.OperacionServicios;

/**
 *
 * @author Crisvall
 */
public class POOEj3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperacionServicios opser = new OperacionServicios();
        Operacion op1 = opser.crearOperacion();
        
        opser.sumar(op1);
        opser.restar(op1);
        double mult = opser.multiplicar(op1);
        System.out.println(mult);
        opser.division(op1);
        
        

        

    }
    
}
