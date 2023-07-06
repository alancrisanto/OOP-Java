/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;
import Entidad.Persona;
import Servicio.PersonaService;
/**
 *
 * @author Crisvall
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instanciación uitlizando el constructor vacio
        Persona primerPersona = new Persona();
        
        // Instanciación utilizando el constructor por parámetros
        Persona segundaPersona = new Persona("Alan1");
        
        Persona personaEdad = new Persona(33);
        
        primerPersona.setNombre("Juan");
        segundaPersona.getNombre();
        
        // usando el service
        // Iniciando un objeto del tipo servicio para acceder a sus atributos
        PersonaService personaServicio = new PersonaService();
        
        Persona terceraPersona = personaServicio.crearPersona();
        
        String cuartaPersona = personaServicio.verPersona();
        }
    }