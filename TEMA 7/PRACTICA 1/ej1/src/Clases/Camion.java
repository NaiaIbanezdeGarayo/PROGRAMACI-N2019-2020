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
public class Camion extends Vehiculo{
    private CamionEnum marca;

    public Camion() {
    }

    public Camion(CamionEnum marca) {
        this.marca = marca;
    }

    public Camion(CamionEnum marca, String matricula, Persona p) {
        super(matricula, p);
        this.marca = marca;
    }

    public CamionEnum getMarca() {
        return marca;
    }

    public void setMarca(CamionEnum marca) {
        this.marca = marca;
    }

    
    
}
