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
public class Pelicula extends Obra{
    private String productora;
    private int duracion;
    private ArrayList <Artista> listaArtistas;

    public Pelicula() {
    }

    public Pelicula(String productora, int duracion, ArrayList<Artista> listaArtistas) {
        this.productora = productora;
        this.duracion = duracion;
        this.listaArtistas = listaArtistas;
    }

    public Pelicula(String productora, int duracion, ArrayList<Artista> listaArtistas, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.productora = productora;
        this.duracion = duracion;
        this.listaArtistas = listaArtistas;
    }

    public Pelicula(String productora, int duracion, ArrayList<Artista> listaArtistas, String titulo, int anoEdicion, ArrayList<Artista> artistas) {
        super(titulo, anoEdicion, artistas);
        this.productora = productora;
        this.duracion = duracion;
        this.listaArtistas = listaArtistas;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    
}
