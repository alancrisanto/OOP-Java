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
public class Cuenta {
    private int numeroCuenta, DNI;
    private double saldoActual,  interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double saldoActual, int DNI, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.DNI = DNI;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public int getDNI() {
        return DNI;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
   
}
