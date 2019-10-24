/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String radio = JOptionPane.showInputDialog("Introduce un valor del radio para calcular el area");
        double r = Double.parseDouble(radio);
        double a = Math.PI * r * r;
        a = Math.rint(a);
        JOptionPane.showMessageDialog(null, a);
    }
    
}
