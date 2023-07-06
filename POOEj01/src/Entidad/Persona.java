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
public class Persona {
    public String nombre;
    public int edad;
    public int id;

    public Persona() {
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona(int edad) {
        this.edad = edad;
    }
    
    
}
