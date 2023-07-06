/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe07;

import Entidad.Persona;
import Servicios.ServiciosPersona;

/**
 *
 * @author Crisvall
 */
public class POOE07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosPersona pservicio = new ServiciosPersona();
        Persona p1 = pservicio.crearPersona();
        Persona p2 = pservicio.crearPersona();
        Persona p3 = pservicio.crearPersona();
        Persona p4 = pservicio.crearPersona();
        
        int [] imc = new int[4];
        boolean [] esMayor = new boolean[4];
        
        imc[0] = pservicio.calcularIMC(p1);
        imc[1] = pservicio.calcularIMC(p2);
        imc[2] = pservicio.calcularIMC(p3);
        imc[3] = pservicio.calcularIMC(p4);  
        
        esMayor[0] = pservicio.esMayorDeEdad(p1);
        esMayor[1] = pservicio.esMayorDeEdad(p2);
        esMayor[2] = pservicio.esMayorDeEdad(p3);
        esMayor[3] = pservicio.esMayorDeEdad(p4);
                
        double count0 = 0;
        double count1 = 0;
        double count_1 = 0;

        double isMayor = 0;
        double esMenor = 0;
     
        for (int i = 0; i < imc.length; i++) {
            switch (imc[i]) {
                case 0:
                    count0 += 1;
                    break;
                case 1:
                    count1 += 1;
                    break;
                default:
                    count_1 += 1;
                    break;
            }
        }
        
        
        for (int i = 0; i < esMayor.length; i++) {          
            if(esMayor[i] == true){
                esMenor += 1;
            } else {
                isMayor += 1;
            }
        }
        
       
        System.out.println("Personas con peso ideal " + (count0 / imc.length) *100);
        System.out.println("Personas con sobrepeso " + (count1 / imc.length) *100);
        System.out.println("Personas con debajo de su peso ideal " + (count_1 / imc.length) *100);
        
        System.out.println("Personas Mayores " + (isMayor / esMayor.length) *100);
        System.out.println("Personas Menores " + (esMenor / esMayor.length) *100);
       
    } 
}
    
   

