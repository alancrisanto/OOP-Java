/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 */
public class ServicioRectangulo {
    Scanner sc = new Scanner(System.in);
    
    public Rectangulo crearRectangulo (){
        Rectangulo rectangulo = new Rectangulo();
        
        System.out.println("Ingrese la altura del rectangulo");
        rectangulo.setAltura(sc.nextDouble());
        System.out.println("Ingrese la base del rectangulo");
        rectangulo.setBase(sc.nextDouble());
        
        return rectangulo;
    }
    
    public void superficie (Rectangulo rect){
        double superficie = rect.getAltura() * rect.getBase();
        System.out.println("La superficie del rectangulo es " + superficie);
    }
    
    public void perimetro (Rectangulo rect) {
        double perimetro = (rect.getAltura() + rect.getBase()) * 2;
        System.out.println("El perímetro del rectangulo es: " + perimetro);
    }
    
}
