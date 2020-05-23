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
public class Reclamacion {
    private int idmulta;
    private LocalDate fecha;
    private String matricula;

    public Reclamacion() {
    }

    public Reclamacion(int idmulta, LocalDate fecha, String matricula) {
        this.idmulta = idmulta;
        this.fecha = fecha;
        this.matricula = matricula;
    }

    public int getIdmulta() {
        return idmulta;
    }

    public void setIdmulta(int idmulta) {
        this.idmulta = idmulta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
