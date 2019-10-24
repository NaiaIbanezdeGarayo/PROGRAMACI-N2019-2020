/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nota = JOptionPane.showInputDialog("Introduce una nota");
        double n = Double.parseDouble(nota);
        if (n >= 5) {
            JOptionPane.showMessageDialog(null, "Aprobado");
        }else
            JOptionPane.showMessageDialog(null, "Suspendido");
    }
    
}
