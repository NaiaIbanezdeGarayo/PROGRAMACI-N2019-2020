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
public class Moto extends Vehiculo{
    private MotoEnum marca;

    public Moto() {
    }

    public Moto(MotoEnum marca) {
        this.marca = marca;
    }

    public Moto(MotoEnum marca, String matricula, Persona p) {
        super(matricula, p);
        this.marca = marca;
    }

    public MotoEnum getMarca() {
        return marca;
    }

    public void setMarca(MotoEnum marca) {
        this.marca = marca;
    }
    
}
