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
public class Alumno {
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String edad;
    private String sexo;
    private String fNacimiento;
    private String emailPersonal;
    private String emailCentro;
    private String paginaWeb;
    private String curso;
    private String estadoCivil;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String domicilio, String telefono, String edad, String sexo, String fNacimiento, String emailPersonal, String emailCentro, String paginaWeb, String curso, String estadoCivil) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.fNacimiento = fNacimiento;
        this.emailPersonal = emailPersonal;
        this.emailCentro = emailCentro;
        this.paginaWeb = paginaWeb;
        this.curso = curso;
        this.estadoCivil = estadoCivil;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public String getEmailCentro() {
        return emailCentro;
    }

    public void setEmailCentro(String emailCentro) {
        this.emailCentro = emailCentro;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", edad=" + edad + ", sexo=" + sexo + ", fNacimiento=" + fNacimiento + ", emailPersonal=" + emailPersonal + ", emailCentro=" + emailCentro + ", paginaWeb=" + paginaWeb + ", curso=" + curso + ", estadoCivil=" + estadoCivil + '}';
    }
    
}
