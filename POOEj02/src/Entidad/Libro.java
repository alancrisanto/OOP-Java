/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Crisvall
 */
public class Libro {
    
    public int isbn;
    public String autor;
    public String titulo;
    public int paginas;

    public Libro() {
    }

    public Libro(int isbn, String autor, String titulo, int paginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }
    
     
}
