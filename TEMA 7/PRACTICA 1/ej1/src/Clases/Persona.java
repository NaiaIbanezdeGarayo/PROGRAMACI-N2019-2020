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
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private ArrayList <Vehiculo> listavehiculos;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido, String direccion, String telefono, ArrayList<Vehiculo> listavehiculos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listavehiculos = listavehiculos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getListavehiculos() {
        return listavehiculos;
    }

    public void setListavehiculos(ArrayList<Vehiculo> listavehiculos) {
        this.listavehiculos = listavehiculos;
    }
    
}
