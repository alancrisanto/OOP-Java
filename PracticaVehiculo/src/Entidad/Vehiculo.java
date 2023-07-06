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
public class Vehiculo {
    private String marca, modelo, tipo;
    private int año;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String tipo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAño() {
        return año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAño(int año) {
        this.año = año;
    }
   
    
}
