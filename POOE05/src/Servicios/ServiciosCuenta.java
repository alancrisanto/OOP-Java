/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 */
public class ServiciosCuenta {
    
    Scanner sc = new Scanner(System.in);
    public Cuenta crearCuenta(){
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese número cuenta");
        cuenta.setNumeroCuenta(sc.nextInt());
        System.out.println("Ingrese saldo de la cuenta");
        cuenta.setSaldoActual(sc.nextDouble());
        System.out.println("Ingrese interés de la cuenta");
        cuenta.setInteres(sc.nextDouble());
        System.out.println("Ingrese Dni");
        cuenta.setDNI(sc.nextInt());
        
        return cuenta;
    }
    
    public void ingresar(Cuenta saldo){
        System.out.println("Por favor ingresa monto a depositar");
        double monto = sc.nextDouble();
        saldo.setSaldoActual( monto + saldo.getSaldoActual());
        
        System.out.println("Monto ingresado");
        System.out.println("El saldo actual es de la cuenta es: " + saldo.getSaldoActual());
    }
    
    public void retirar (Cuenta saldo){
        System.out.println("Ingrese monto a retirar");
        double retiro = sc.nextDouble();
        double saldoActual = saldo.getSaldoActual();
        
        if (saldoActual < retiro) {
            System.out.println("No cuenta con los fondos suficientes para retirar");
        } else {
            saldo.setSaldoActual( saldoActual - retiro);
            System.out.println("Su saldo es: " + saldo.getSaldoActual());
        }
    }
    
    public void extraccionRapida(Cuenta saldo){
        double saldoActual = saldo.getSaldoActual();
        System.out.println("Cuanto desea extraer de su cuenta?");
        double extraer = sc.nextDouble();
        
        if (extraer > saldoActual * 0.20) {
            System.out.println("Solo puede retirar como máximo un 20% de su saldo");
        } else {
            saldo.setSaldoActual(saldoActual - extraer);
            System.out.println("Su saldo actual es de: " + saldo.getSaldoActual());
        }
    }
    
    public void consultarSaldo(Cuenta saldo){
        System.out.println("Su saldo actual es: " + saldo.getSaldoActual() );
    }
    
    public void consultarDatos(Cuenta saldo){
        System.out.println("Sus datos son: ");
        System.out.println("Número de cuenta: " + saldo.getNumeroCuenta());
        System.out.println("Su saldo es: " + saldo.getSaldoActual());
        System.out.println("Su DNI es: " + saldo.getDNI());
        System.out.println("el interés de la cuenta es: " + saldo.getInteres());
    }
}
