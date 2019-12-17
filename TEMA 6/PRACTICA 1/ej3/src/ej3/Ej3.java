/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Clases.Persona;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej3 {
    /**
     * @param args the command line arguments
     */
    public static ArrayList <Persona> listaPersonas;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p;
        do {
            String n = JOptionPane.showInputDialog("Introduce el nombre de la persona");
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día de nacimiento"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes de nacimiento"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de nacimiento"));

            LocalDate fecha = LocalDate.of(dia,mes,ano);


            String dir = JOptionPane.showInputDialog("Introduce la dirección");
            String cp = JOptionPane.showInputDialog("Introduce el código postal");
            String ciudad = JOptionPane.showInputDialog("Introduce el nombre de la cuidad");
            p = new Persona(n,dia,mes,ano,dir,cp,ciudad);
        } while (JOptionPane.showConfirmDialog(null, "¿Quieres seguir introduciendo personas?")!=-1);
        personaMayorDeEdad();
        
        
    }
    private static void personaMayorDeEdad() {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (true) {
                
            }
        }
    }

}
