/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe05;

import Entidad.Cuenta;
import Servicios.ServiciosCuenta;

/**
 *
 * @author Crisvall
 */
public class POOE05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosCuenta cuentaServicio = new ServiciosCuenta();
        Cuenta cuenta = cuentaServicio.crearCuenta();
        
        cuentaServicio.ingresar(cuenta);
        //cuentaServicio.retirar(cuenta);
        //cuentaServicio.extraccionRapida(cuenta);
        cuentaServicio.consultarSaldo(cuenta);
        cuentaServicio.consultarDatos(cuenta);
    }
    
    
    
}
