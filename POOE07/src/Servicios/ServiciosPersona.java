/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 */
public class ServiciosPersona {
    Scanner sc = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("Ingrese su nombre");
        persona.setNombre(sc.next());
        System.out.println("ingrese edad");
        persona.setEdad(sc.nextInt());
        System.out.println("Ingrese su altura");
        persona.setAltura(sc.nextInt());
        System.out.println("Ingrese peso");
        persona.setPeso(sc.nextDouble());
        System.out.println("Ingrese sexo");
        String sexo = sc.next();
        
        while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O") ) {            
            System.out.println("Sexo permitido H, M, O");
            sexo = sc.next();
        }
        
        persona.setSexo(sexo);
         return persona;
    }
    
        public void verPersona(Persona person){
            System.out.println(person.getNombre());
            System.out.println(person.getEdad());
            System.out.println(person.getPeso());
            System.out.println(person.getAltura());
            System.out.println(person.getSexo());
            
        }
        
        public int calcularIMC(Persona person){
            double imc = person.getPeso() / Math.pow(person.getAltura()/100, 2);
        
            if (imc < 20) {
                return -1;
            } else if (imc < 25) {
                return 0;
            } else {
                return 1;
            }
       }
        
        public boolean  esMayorDeEdad(Persona person){
        return person.getEdad() > 18;
        }
}

