/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 */
public class ServiciosCafetera {
    Scanner sc = new Scanner(System.in);
    
    public Cafetera llenarCafetera () {
        Cafetera cafetera = new Cafetera();
               cafetera.setCapacidadMaxima(1000);
              cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        return cafetera;
    }
    
    public void servirTaza(Cafetera cafe){
        System.out.println("Ingrese tamaño de taza");
        int taza = sc.nextInt();
        System.out.println("Sirviendo taza, espero por favor");
        if (cafe.getCantidadActual() < taza) {
            System.out.println("La taza no se llenó, solo se ingreso: " + cafe.getCantidadActual());  
        } else {
            System.out.println("La taza está llena");
            cafe.setCantidadActual(cafe.getCantidadActual() - taza);
        }
    }
    
    public void vaciarCafetera() {
        Cafetera cafe = new Cafetera();
        cafe.setCantidadActual(0);
        System.out.println("La capacidad es de: " + cafe.getCantidadActual());
    }
    
    public void agregarCafe() {
        Cafetera cafe = new Cafetera();
        System.out.println("Ingrese cantidad de cafe a llenar");
        int cantidad = sc.nextInt();
        cafe.setCantidadActual(cantidad);
        System.out.println("La cantidad es de: " + cafe.getCantidadActual());
    }
}
