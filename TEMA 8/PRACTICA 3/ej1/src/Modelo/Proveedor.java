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
public class Proveedor extends Persona{
    private Producto p;

    public Proveedor() {
    }

    public Proveedor(Producto p) {
        this.p = p;
    }

    public Proveedor(Producto p, String nombre) {
        super(nombre);
        this.p = p;
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }
    
}
