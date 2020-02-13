/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import Modelo.Persona;
import Vista.Alta;
import Vista.Listado;
import java.util.ArrayList;
import java.util.function.Function;

/**
 *
 * @author 1gdaw06
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    private static Persona p;
    private static ArrayList <Persona> listadoPersonas;
    private static Alta vAlta;
    private static Listado vListado;
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        listadoPersonas = new ArrayList();
        vAlta = new Alta();
        vAlta.setVisible(true);
    }

    public static void altaPersonas(String nombre, String ape, String dni) {
        p = new Persona();
        p.setNombre(nombre);
        p.setApellido(ape);
        p.setDni(dni);
        listadoPersonas.add(p);
    }

    public static void cerrarVentanaAlta() {
        vAlta.dispose();
        vListado = new Listado();
        vListado.setVisible(true);
    }

    public static String sacarListadoPorPantalla() {
        String texto = " ";
        /*for (int i = 0; i < listadoPersonas.size(); i++) {
            texto += "Nombre: " + listadoPersonas.get(i).getNombre() + "\n" + "Apellido: " + listadoPersonas.get(i).getApellido() + "\n" + "Dni: " + listadoPersonas.get(i).getDni() + "\n";
        }*/
        
        texto += listadoPersonas.stream().map((Persona p) -> "Nombre: " + p.getNombre() + "\n" + "Apellido: " + p.getApellido() + "\n" + "Dni: " + p.getDni() + "\n").reduce(texto, String::concat);
        return texto;
    }
    
}