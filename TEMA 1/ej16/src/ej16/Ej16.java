/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double promedio = 0 ;
        int contador = 0;
        int seguir;
        do {
            double edad = Double.parseDouble(JOptionPane.showInputDialog("Introduce la edad de los estudiantes"));
            promedio = edad + promedio;
            contador = contador + 1;
            seguir = JOptionPane.showConfirmDialog(null, "¿Quieres seguir introduciendo notas?");
        } while (seguir != 1);
        
        double promedioFinal = promedio/contador;
        JOptionPane.showMessageDialog(null, "Este es el promedio de el total de los alumnos: " + promedioFinal);
            
        
    }
    
}
