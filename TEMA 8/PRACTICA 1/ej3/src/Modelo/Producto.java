/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 1gdaw06
 */
public class Producto {
    private tipoProductos nombre;
    private double precioUnitario;
    private int nUnidades;

    public Producto() {
    }

    public Producto(tipoProductos nombre, double precioUnitario, int nUnidades) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.nUnidades = nUnidades;
    }

    public tipoProductos getNombre() {
        return nombre;
    }

    public void setNombre(tipoProductos nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades = nUnidades;
    }
    
    
}
