/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03;

import Entidad.Circunferencia;
import Servicios.CircunferenciaServicios;

/**
 *
 * @author Crisvall
 */
public class POOEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
        tipo real. A continuación, se deben crear los siguientes métodos:
        a) Método constructor que inicialice el radio pasado como parámetro.
        b) Métodos get y set para el atributo radio de la clase Circunferencia.
        c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
        objeto.
        d) Método area(): para calcular el área de la circunferencia (area = pi ∗ radio**2).
        e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
        */
        CircunferenciaServicios cir1 = new CircunferenciaServicios();
        
        Circunferencia circunferencia1 = cir1.crearCircunferencia();
        cir1.area(circunferencia1);
        cir1.perimetro(circunferencia1);
        
        
        
    }
    
}
