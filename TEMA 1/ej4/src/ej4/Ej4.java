/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String d1 = JOptionPane.showInputDialog("Introduce el valor de la diagonal grande");
        String d2 = JOptionPane.showInputDialog("Intorduce el valor de la diagonal pequeña");
        double D = Double.parseDouble(d1);
        double d = Double.parseDouble(d2);
        double area = D * d/2 ;
        JOptionPane.showMessageDialog(null, area);
    }
    
}
