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
public class Producto {
    private String nombre;
    private int nUnidades;
    private double precioUnitario;
    private ArrayList <Proveedor> listaproveedores;
    

    public Producto() {
        listaproveedores = new ArrayList();
    }

    public Producto(String nombre, int nUnidades, double precioUnitario, ArrayList<Proveedor> listaproveedores) {
        this.nombre = nombre;
        this.nUnidades = nUnidades;
        this.precioUnitario = precioUnitario;
        this.listaproveedores = listaproveedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades = nUnidades;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public ArrayList<Proveedor> getListaproveedores() {
        return listaproveedores;
    }

    public void setListaproveedores(ArrayList<Proveedor> listaproveedores) {
        this.listaproveedores = listaproveedores;
    }

    public void setListaProveedores(Proveedor p){
        this.listaproveedores.add(p);
    }
    
}
