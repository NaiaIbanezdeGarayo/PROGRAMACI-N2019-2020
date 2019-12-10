/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gdaw06
 */
    public class Persona {
    private int cAlumno;
    private String nAlumno;
    private String domicilio;
    private String telefono;

    public Persona() {
    }

    public Persona(int cAlumno, String nAlumno, String domicilio) {
        this.cAlumno = cAlumno;
        this.nAlumno = nAlumno;
        this.domicilio = domicilio;
    }

    public int getcAlumno() {
        return cAlumno;
    }

    public void setcAlumno(int cAlumno) {
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
    
    
}
