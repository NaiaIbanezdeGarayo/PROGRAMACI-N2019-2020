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
public class Cuenta {
    private String numero;
    private ArrayList <Movimiento> listaMovimientos;

    public Cuenta() {
    }

    public Cuenta(String numero) {
        this.numero = numero;
    }
    
    public Cuenta(String numero, ArrayList<Movimiento> listaMovimientos) {
        this.numero = numero;
        listaMovimientos = new ArrayList();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }
    
    public void setMovimiento(Movimiento m){
        listaMovimientos.add(m);
    }
}
