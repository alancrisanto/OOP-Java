/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 */
public class CircunferenciaServicios {
    
    Scanner sc = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia () {
        Circunferencia circunferencia = new Circunferencia();
        System.out.println("Ingrese el radio");
        circunferencia.setRadio(sc.nextDouble());
        return circunferencia;
    }
    
    public void area (Circunferencia radio1) {
        double area = Math.PI * radio1.getRadio();
        System.out.println("El área es " + area);
    }
    
    public void perimetro (Circunferencia radio1) {
        double perimetro = 2 * Math.PI * radio1.getRadio();
        System.out.println("El perímetro es " + perimetro);
    }
}
