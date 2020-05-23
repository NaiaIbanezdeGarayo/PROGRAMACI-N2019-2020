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
    private int id_multa;
    private String matricula;
    private LocalDate fecha;

    public VehiculoMulta() {
    }

    public VehiculoMulta(int id_multa, String matricula, LocalDate fecha) {
        this.id_multa = id_multa;
        this.matricula = matricula;
        this.fecha = fecha;
    }

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
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
