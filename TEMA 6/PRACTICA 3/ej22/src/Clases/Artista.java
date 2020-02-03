/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author 1gdaw06
 */
public class Artista {
    private String nombre;
    private LocalDate fechaNacimiento;
    private ArrayList <Obra> obras;

    public Artista() {
    }

    public Artista(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Artista(String nombre, LocalDate fechaNacimiento, ArrayList<Obra> obras) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.obras = obras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }
    public void setObra (Obra o){
        obras.add(o);
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }
    
}
