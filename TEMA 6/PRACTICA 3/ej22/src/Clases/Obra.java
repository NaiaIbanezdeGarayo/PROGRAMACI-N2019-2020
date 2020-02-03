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
public class Obra {
    private String titulo;
    private int anoEdicion;
    private ArrayList <Artista> artistas;

    public Obra() {
    }

    public Obra(String titulo, int anoEdicion) {
        this.titulo = titulo;
        this.anoEdicion = anoEdicion;
    }
    
    public Obra(String titulo, int anoEdicion, ArrayList<Artista> artistas) {
        this.titulo = titulo;
        this.anoEdicion = anoEdicion;
        this.artistas = artistas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoEdicion() {
        return anoEdicion;
    }

    public void setAnoEdicion(int anoEdicion) {
        this.anoEdicion = anoEdicion;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
    public void setArtista (Artista a){
        artistas.add(a);
    }

    @Override
    public String toString() {
        return "Obra{" + "titulo=" + titulo + ", anoEdicion=" + anoEdicion + ", artistas=" + artistas + '}';
    }
    
}
