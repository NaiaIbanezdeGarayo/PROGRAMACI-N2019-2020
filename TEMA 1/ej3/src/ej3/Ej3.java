/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String base = JOptionPane.showInputDialog("Introduce el valor de la base");
        String altura = JOptionPane.showInputDialog("Introduce el valor de la altura");
        int b = Integer.parseInt(base);
        int a = Integer.parseInt(altura);
        int perimetro = 2 * b + 2 * a;
        JOptionPane.showMessageDialog(null, perimetro);
    }
    
}
