/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Naia
 */
public class Acontecimiento {
    private String nombre;
    private String lugar;
    private String fecha;
    private String horaInicio;
    private String horaFinal;
    private int aforo;
    private ArrayList<Persona> listaPersonas;

    public Acontecimiento() {
        listaPersonas = new ArrayList();
    }

    public Acontecimiento(String nombre, String lugar, String fecha, String horaInicio, String horaFinal, int aforo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.aforo = aforo;
        listaPersonas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(Persona p) {
        this.listaPersonas.add(p);
    }

    
    @Override
    public String toString() {
        return nombre + " " + lugar + " " + fecha + " " + horaInicio + " " + horaFinal + " " + aforo + " " + listaPersonas + " ";
    }
    
   

   
    
}
