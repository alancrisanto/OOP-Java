/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;

import java.util.Scanner;

/**
 *
 * @author Crisvall
 */
public class CadenaServicios {

    Scanner sc = new Scanner(System.in);
    
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
    
    public void compararLongitud (String frase, Cadena cadena){
        int long1 = frase.length();
        int long2 = cadena.getLongitud();
        
        System.out.println("La frase tiene " + long1 + " caracteres" );
        System.out.println("La cadena tiene " + long2 + " caracteres" );
    }

    public void unirFrases(Cadena frase) {
        System.out.println("Ingresa una nueva frase ");
        String newFrase = sc.nextLine();
        System.out.println("La nueva frase es: " + newFrase + " " + frase.getFrase());
    }

    public void reemplazar(Cadena frase){
        System.out.println("Ingresa una letra o simbolo para reemplazar");
        char letra = sc.nextLine().charAt(0);
        char [] array = frase.getFrase().toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (Character.toLowerCase(array[i]) == 'a')  {
                array[i] = letra;
            }
        }

        String nuevaFrase = new String(array);

        System.out.println("La frase es: " + nuevaFrase);
    }

    public void contiene(Cadena frase){
        System.out.println("Ingresa una letra a verificar");
        char letra = sc.nextLine().charAt(0);
        char [] array = frase.getFrase().toCharArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (Character.toLowerCase(array[i]) == 'a')  {
                count += 1;
            }
        }

        if(count > 0) {
            System.out.println("La letra ingresa se encuentra en la frase");
        } else {
            System.out.println("La letra no se encuentra en la frase");
        }
    }
}

