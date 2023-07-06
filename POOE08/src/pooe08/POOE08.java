/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe08;

import Entidad.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 */
public class POOE08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear Scanner
        Scanner sc = new Scanner(System.in);
        
        // Crear objeto
        Cadena frase = new Cadena();
        
        // Crear Servicios
        CadenaServicios cservicios = new CadenaServicios();
        
        // Ingresar Frase
        System.out.println("Ingrese una palabra o frase");
        frase.setFrase(sc.nextLine());
        
        // Medir Longitud de Frase
        String frase1 = frase.getFrase();
        frase.setLongitud(frase1.length());
        System.out.println(frase.getLongitud());
        
        // Llamar método contar vocales
        cservicios.mostrarVocales(frase);
        
        // Método invertir cadena
        cservicios.invertirFrase(frase);
       
        
        // Método letra repetida
        System.out.println("Ingrese una letra");
        String letra = sc.nextLine();
        cservicios.vecesRepetido(letra, frase);
        
        
    }
    
}
