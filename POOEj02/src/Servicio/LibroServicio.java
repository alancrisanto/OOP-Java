/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 */
public class LibroServicio {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargarLibro (){
        System.out.println("Ingrese el número de ISBN");
        int isbn = sc.nextInt();
        
        System.out.println("Ingrese el título");
        String titulo = sc.next();
        
        System.out.println("Ingrese el autor");
        String autor = sc.next();
        
        System.out.println("Ingrese número de páginas");
        int numPaginas = sc.nextInt();
        
        Libro libro1 = new Libro(isbn, autor, titulo, numPaginas);
        
        return libro1;
    }    
    
    public void mostrarLibro (Libro libro1){
        System.out.println("El isbn es " + libro1.isbn);
        System.out.println("El titulo es " + libro1.titulo);
        System.out.println("El autor es " + libro1.autor);
        System.out.println("El número de páginas son " + libro1.paginas);
        
    }
}
