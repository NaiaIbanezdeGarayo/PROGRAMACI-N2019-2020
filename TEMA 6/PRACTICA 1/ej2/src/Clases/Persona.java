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
    public class Persona {
    private String cAlumno;
    private String nAlumno;
    private String domicilio;
    private String telefono;
    private ArrayList <Persona> alumnos;
    
    public Persona() {
    }

    public Persona(String cAlumno, String nAlumno, String domicilio, String telefono, ArrayList<Persona> alumnos) {
        this.cAlumno = cAlumno;
        this.nAlumno = nAlumno;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.alumnos = alumnos;
    }

    public String getcAlumno() {
        return cAlumno;
    }

    public void setcAlumno(String cAlumno) {
        this.cAlumno = cAlumno;
    }

    public String getnAlumno() {
        return nAlumno;
    }

    public void setnAlumno(String nAlumno) {
        this.nAlumno = nAlumno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Persona> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Persona> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Alumno: \n" + "Código:" + cAlumno + " Nombre: " + nAlumno ;
    }

    
    
    
}
