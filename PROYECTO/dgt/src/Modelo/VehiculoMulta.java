/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Naia
 */
public class VehiculoMulta {
    private int id;
    private int id_multa;
    private String lugar;
    private String matricula;
    private LocalDate fecha;

    public VehiculoMulta() {
    }

    public VehiculoMulta(int id, int id_multa, String lugar, String matricula, LocalDate fecha) {
        this.id = id;
        this.id_multa = id_multa;
        this.lugar = lugar;
        this.matricula = matricula;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
