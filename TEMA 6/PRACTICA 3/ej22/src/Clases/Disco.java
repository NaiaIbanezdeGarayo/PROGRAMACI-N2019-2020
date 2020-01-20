/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw06
 */
public class Disco extends Obra{
   private String discografia;
   private int numeroCanciones;

    public Disco() {
    }

    public Disco(String discografia, int numeroCanciones) {
        this.discografia = discografia;
        this.numeroCanciones = numeroCanciones;
    }

    public Disco(String discografia, int numeroCanciones, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.discografia = discografia;
        this.numeroCanciones = numeroCanciones;
    }

    public Disco(String discografia, int numeroCanciones, String titulo, int anoEdicion, ArrayList<Artista> artistas) {
        super(titulo, anoEdicion, artistas);
        this.discografia = discografia;
        this.numeroCanciones = numeroCanciones;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }
   
}
