/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Naia
 */
public class Vehiculo {
    private String matricula;
    private String color;
    private String modelo;
    
    private ArrayList<Multa> listaMultas;

    public Vehiculo() {
        listaMultas = new ArrayList();
    }

    public Vehiculo(String matricula, String color, String modelo) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Multa> getListaMultas() {
        return listaMultas;
    }
    
    public void setListaMultas(Multa m) {
        this.listaMultas.add(m);
    }
    
    
}
