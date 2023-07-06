/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 */
public class OperacionServicios {
    Scanner sc = new Scanner(System.in);
  
     
    public Operacion crearOperacion (){
        Operacion operacion = new Operacion();
        System.out.println("Ingrese primer número");
        operacion.setNumero1(sc.nextDouble());
        System.out.println("Ingrese segundo número");
        operacion.setNumero2(sc.nextDouble());
        return operacion;
    }
    
    public void sumar (Operacion num1){
        double sum = num1.getNumero1() + num1.getNumero2();
        System.out.println("La suma es: " + sum);
    }
    
    public void restar (Operacion num1) {
        double resta = num1.getNumero1() - num1.getNumero2();
        System.out.println("La resta es: " + resta);
    }
    
    public double multiplicar (Operacion num1){
        double mult = num1.getNumero1() * num1.getNumero2();
        return mult;
    }
    
    public void division (Operacion num1) {
        double div = num1.getNumero1() / num1.getNumero2();
        System.out.println("La division es: " + div);
    }
}
