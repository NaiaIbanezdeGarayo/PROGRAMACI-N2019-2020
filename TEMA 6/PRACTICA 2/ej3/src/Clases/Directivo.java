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
public class Directivo extends Empleado {

    private String categoria;
    private ArrayList <Empleado> subordinados;

    public Directivo() {
    }

    public Directivo(String categoria, ArrayList<Empleado> subordinados) {
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public Directivo(String categoria, ArrayList<Empleado> subordinados, double sueldoBruto) {
        super(sueldoBruto);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public Directivo(String categoria, ArrayList<Empleado> subordinados, double sueldoBruto, String nombre, int edad) {
        super(sueldoBruto, nombre, edad);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public String getCategoria() {
        return categoria;
    }                         

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return subordinados;
    }

    public void setListaEmpleados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }

}
