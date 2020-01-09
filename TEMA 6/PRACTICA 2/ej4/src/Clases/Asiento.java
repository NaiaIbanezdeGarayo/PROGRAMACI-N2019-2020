/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw06
 */
public class Asiento {
    private int nAsiento;
    private Boolean estado;
    private String compartimiento;
    
    private Pasajero pasajero;
    private Vuelo vuelo;

    public Asiento() {
    }

    public Asiento(int nAsiento, Boolean estado, String compartimiento, Pasajero pasajero, Vuelo vuelo) {
        this.nAsiento = nAsiento;
        this.estado = estado;
        this.compartimiento = compartimiento;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
    }

    public int getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(int nAsiento) {
        this.nAsiento = nAsiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getCompartimiento() {
        return compartimiento;
    }

    public void setCompartimiento(String compartimiento) {
        this.compartimiento = compartimiento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    
    
    public void reservar(){}
    public void comprar(){}
    public Boolean mostrarDisponibilidad(){
        return null;
    }
    public void desbloquear(){}
    
}
