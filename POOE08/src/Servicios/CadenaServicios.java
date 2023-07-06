/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;

/**
 *
 * @author Crisvall
 */
public class CadenaServicios {
    
    public void mostrarVocales(Cadena cadena ){
        int vocal = 0;
        
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            char letter = Character.toLowerCase(cadena.getFrase().charAt(i));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vocal += 1;
            }
        }
        
        System.out.println("Vocales encontradas: " + vocal);
        
    }
    
    public void invertirFrase(Cadena cadena) {
        char [] caracteres = cadena.getFrase().toCharArray();
        for (int i = caracteres.length - 1; i >= 0; i--) {
            System.out.print(caracteres[i]);
        }
        System.out.println(" ");
    }
    
    public void vecesRepetido(String letra, Cadena cadena){
        int count = 0;
        String caracter = cadena.getFrase().toLowerCase();
        
        
        for (int i = 0; i < caracter.length(); i++) {
            if (letra.equals(String.valueOf(caracter.charAt(i)))) {
                count += 1;
            }
        }
        
        System.out.println("El caracter " + letra + " se repite " + count + " veces");
    }
    
    
}
