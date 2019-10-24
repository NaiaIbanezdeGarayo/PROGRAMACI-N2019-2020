/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datos = JOptionPane.showInputDialog("Introduce los grados para que se calculen en grados Fahrenheit");
        int d = Integer.parseInt(datos);
        double f = 1.8 * d + 32;
        JOptionPane.showMessageDialog(null, f + "ºF");
        
    }
    
}
