/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0 ;
        int numAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Indica el número de notas de alumnos que quieres introducir")); 
        for (int i = 0; i < numAlumnos ; i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota"));
            if (nota >= 6.00) {
                contador = contador + 1 ;   
            }
            
        }
        JOptionPane.showMessageDialog(null, "Cantidad de aprobados: " + contador);
    }
    
}
