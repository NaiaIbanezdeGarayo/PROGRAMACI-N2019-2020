/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double mayor = -1;
        double menor = 11;
        
        String nombreMayor = " ";
        String nombreMenor = " ";
        for (int i = 0; i < 40; i++) {
            String nom1 = JOptionPane.showInputDialog("Introduce el nombre del alumno");
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota del alumno"));
            if (n1 > mayor ) {
                mayor = n1;
                nombreMayor = nom1;
            }
            if (n1 < menor) {
                menor = n1;
                nombreMenor = nom1;
            }
        
        }
        JOptionPane.showMessageDialog(null, "Alumno con menor nota: " + menor + " " + nombreMenor + "\n" + "Alumno con mayor nota: " + mayor + " " + nombreMayor);
    }
    
}
