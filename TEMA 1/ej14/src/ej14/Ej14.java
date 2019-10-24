/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double contadorS = 0;
        for (int i = 0; i < 3; i++) {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
            
            contadorS = contadorS + num;
            
        }
        JOptionPane.showMessageDialog(null, "Suma de todos los números:" + contadorS);
    }
    
}
