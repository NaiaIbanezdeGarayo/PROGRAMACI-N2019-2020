/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kat1 = JOptionPane.showInputDialog("Introduce el valor de un cateto");
        String kat2 = JOptionPane.showInputDialog("Introduce el valor del otro cateto");
        double k1 = Double.parseDouble(kat1);
        double k2 = Double.parseDouble(kat2);
        double ka1 = Math.pow(k1, 2);
        double ka2 = Math.pow(k2, 2);
       
        double h = Math.sqrt(ka1 + ka2);
        double hi = Math.rint(h);
        JOptionPane.showMessageDialog(null, hi);
    }
    
}
