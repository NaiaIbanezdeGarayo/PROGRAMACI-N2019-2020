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
public class Libro extends Obra{
    private String editorial;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(String editorial, int numeroPaginas) {
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro(String editorial, int numeroPaginas, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro(String editorial, int numeroPaginas, String titulo, int anoEdicion, ArrayList<Artista> artistas) {
        super(titulo, anoEdicion, artistas);
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    

 
    
}
