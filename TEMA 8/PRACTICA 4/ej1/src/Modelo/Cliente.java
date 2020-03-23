/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Naia
 */
public class Cliente {
    private String dni;
    private String nombreApellidos;
    private String clave;
    private ArrayList <Cuenta> listaCuentas;
    
    public Cliente() {
    }

    public Cliente(String dni, String nombreApellidos, String clave) {
        this.dni = dni;
        this.nombreApellidos = nombreApellidos;
        this.clave = clave;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    
    public int getNumeroCuentas(){
        return listaCuentas.size();
    }
    
    public String getNumeroCuentas(int x){
        return listaCuentas.get(x).getNumero();
    }
}
