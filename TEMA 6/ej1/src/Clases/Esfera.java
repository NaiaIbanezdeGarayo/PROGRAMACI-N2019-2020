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
public class Esfera {
    private double radio;

    public Esfera() {
    }

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularLongitud(Esfera e){
        double l = 2 * Math.PI * radio; 
        return l;
    }
    
    public double calcularArea(Esfera e){
        double a = Math.PI * radio * radio;
        return a;
    }
    
    public double calcularVolumen(Esfera e){
        double v = 4 * Math.PI * radio * radio * radio/3;
        return v;
    }
    
}
