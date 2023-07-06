/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Vehiculo;
import java.util.Scanner;


/**
 *
 * @author Crisvall
 */
public class ServiciosVehiculo {
    
    Scanner sc = new Scanner(System.in);
   
   public Vehiculo crearVehiculo (){
       Vehiculo vehiculo = new Vehiculo();
        System.out.println("Ingrese el marca");
        vehiculo.setMarca(sc.next());
        System.out.println("Ingrese la modelo");
        vehiculo.setModelo(sc.next());
        System.out.println("Ingrese el tipo");
        vehiculo.setTipo(sc.next());
        System.out.println("Ingrese el año");
        vehiculo.setAño(sc.nextInt());
        return vehiculo;
   }
   
   public int moverse (Vehiculo vehiculo, int tiempo){
       int recorrido = 0;
          if (vehiculo.getTipo().equalsIgnoreCase("automovil")) {
              recorrido = tiempo * 3;
          } else if (vehiculo.getTipo().equalsIgnoreCase("motocicleta")){
              recorrido = tiempo * 2;
          } else {
              recorrido = tiempo * 1;
          }
          
          return recorrido;
    }
   
   public int frenar (Vehiculo vehiculo, int tiempo){
       int frenado = 0;
       int recorrido = 0;
              
       if (vehiculo.getTipo().equalsIgnoreCase("automovil")) {
              recorrido = moverse(vehiculo, tiempo);
              frenado = recorrido + 2;
          } else if (vehiculo.getTipo().equalsIgnoreCase("motocicleta")){
              recorrido = moverse(vehiculo, tiempo);
              frenado = recorrido + 2;
          } else {
              recorrido = moverse(vehiculo, tiempo);
              frenado = recorrido;
          }
       
       return frenado;
   }
}
