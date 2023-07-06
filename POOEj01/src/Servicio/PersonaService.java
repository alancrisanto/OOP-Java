/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Persona;
import java.util.Scanner;


/**
 *
 * @author Crisvall
 */
public class PersonaService {
    
    public Persona crearPersona () {
        
        Scanner leer = new Scanner(System.in);
        
        // instanciamos un objeto con sus atributos vacíos
        Persona personaCompleta = new Persona();
        
        //Pedimos al usuario que ingrese la información que se alojará en el atributo por consola
        System.out.println("Ingrese el nombre de la persona");
        
        // utilizamos el objeto para invocar el método SET y con Scanner recibimos la información
        personaCompleta.setNombre(leer.next());
        
        // Este objeto retorna un objeto persona con sus atributos llenos de información
        return personaCompleta;

    }
    
    public  String verPersona(){
        
        Persona verPersona = new Persona();
       return  verPersona.getNombre();    
    }
}
