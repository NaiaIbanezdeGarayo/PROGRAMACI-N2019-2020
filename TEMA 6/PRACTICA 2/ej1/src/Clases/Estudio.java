/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author 1gdaw06
 */
public class Estudio {

    private String nombre;
    private String ciudad;
    private String direccion;
    private String dirWeb;
    private Date fechaFundacion;
    private String pais;
    private String [] telefono;
    

    

    public Estudio() {
    }

    public Estudio(String nombre, String ciudad, String direccion, String dirWeb, Date fechaFundacion, String pais, String[] telefono) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirWeb = dirWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String[] getTelefono() {
        return telefono;
    }

    public void setTelefono(String[] telefono) {
        this.telefono = telefono;
    }
    
    
    
    public void modificaEstudio(){
    }
    
    public void cierraEstudio(){
    }
    
    public Estudio[] despliegaEstudio (){
        return null;
    }
}
