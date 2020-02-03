/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gdaw06
 */
public class Coche extends Vehiculo{
    private CocheEnum marca;

    public Coche() {
    }

    public Coche(CocheEnum marca) {
        this.marca = marca;
    }

    public Coche(CocheEnum marca, String matricula, Persona p) {
        super(matricula, p);
        this.marca = marca;
    }

    public CocheEnum getMarca() {
        return marca;
    }

    public void setMarca(CocheEnum marca) {
        this.marca = marca;
    }
    
}
