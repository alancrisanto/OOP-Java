/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavehiculo;

import Entidad.Vehiculo;
import Servicios.ServiciosVehiculo;

/**
 *
 * @author Crisvall
 */
public class PracticaVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosVehiculo veh = new ServiciosVehiculo();
        
        Vehiculo vehiculo1 = veh.crearVehiculo();
        Vehiculo vehiculo2 = veh.crearVehiculo();
        Vehiculo vehiculo3 = veh.crearVehiculo();
        
        int seg5 = 5;
        int seg10 = 10;
        int min = 60;
        
        int recorrido1 = veh.moverse(vehiculo1, seg5);
        int recorrido2 = veh.moverse(vehiculo2, seg5);
        int recorrido3 = veh.moverse(vehiculo3, seg5);
        
        int frenado1 = veh.frenar(vehiculo1, seg5);
        int frenado2 = veh.frenar(vehiculo1, seg5);
        int frenado3 = veh.frenar(vehiculo1, seg5);
          
         System.out.println(vehiculo1.getTipo() + " avanzó " + recorrido1 + " frenó " + frenado1);
         System.out.println(vehiculo2.getTipo() + " avanzó " + recorrido2 + " frenó " + frenado2);
         System.out.println(vehiculo3.getTipo() + " avanzó " + recorrido3 + " frenó " + frenado3);
         
            
        
     
    }
    
}
