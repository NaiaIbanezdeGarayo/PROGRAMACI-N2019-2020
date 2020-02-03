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
public class Vehiculo {
    private String matricula;
    private Persona p;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, Persona p) {
        this.matricula = matricula;
        this.p = p;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }
    
}
