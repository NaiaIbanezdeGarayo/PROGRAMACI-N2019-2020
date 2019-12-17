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
public class Pelicula {

    private String titulo;
    private String año;
    private float duracion;
    private String tipo;
    private ArrayList <Estudio> estudio;

    

    public Pelicula() {
    }

    public Pelicula(String titulo, String año, float duracion, String tipo) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void modificaPelicula(){
    }
    
    public void despliegaPelicula(){
    }
    
    public void eliminaPelicula(){
    }
    
    public ArrayList<Estudio> getEstudio() {
        return estudio;
    }

    public void setEstudio(ArrayList<Estudio> estudio) {
        this.estudio = estudio;
    }
}
