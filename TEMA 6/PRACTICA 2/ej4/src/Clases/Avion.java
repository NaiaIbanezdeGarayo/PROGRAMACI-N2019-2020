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
public class Avion{
    private String aerolinea;
    private String cAvion;
    private int nAsiento;
    private String compartimentos;
    
    private ArrayList <Vuelo> vuelos = new ArrayList<>();

    public Avion() {
    }

    public Avion(String aerolinea, String cAvion, int nAsiento, String compartimentos) {
        this.aerolinea = aerolinea;
        this.cAvion = cAvion;
        this.nAsiento = nAsiento;
        this.compartimentos = compartimentos;
    }
    

    public Avion(String aerolinea, String cAvion, int nAsiento, String compartimentos, ArrayList<Vuelo> vuelos) {
        this.aerolinea = aerolinea;
        this.cAvion = cAvion;
        this.nAsiento = nAsiento;
        this.compartimentos = compartimentos;
        this.vuelos = vuelos;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getcAvion() {
        return cAvion;
    }

    public void setcAvion(String cAvion) {
        this.cAvion = cAvion;
    }

    public int getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(int nAsiento) {
        this.nAsiento = nAsiento;
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        this.compartimentos = compartimentos;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    public void setVuelo(Vuelo v){
        this.vuelos.add(v);
    }
    
    public Avion obtener(){
        return null;
    }
    public void asignarAVuelo(){}
    
    public void cancelarVuelo(){}

    

    
    
    
}
