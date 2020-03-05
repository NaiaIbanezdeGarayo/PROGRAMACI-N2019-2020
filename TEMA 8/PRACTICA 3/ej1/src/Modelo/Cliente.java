/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw06
 */
public class Cliente extends Persona{
    private ArrayList <Producto> listaproductos;

    public Cliente() {
    }

    public Cliente(ArrayList<Producto> listaproductos) {
        this.listaproductos = listaproductos;
    }

    public Cliente(ArrayList<Producto> listaproductos, String nombre) {
        super(nombre);
        this.listaproductos = listaproductos;
    }

    public ArrayList<Producto> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(ArrayList<Producto> listaproductos) {
        this.listaproductos = listaproductos;
    }

    
    
}
