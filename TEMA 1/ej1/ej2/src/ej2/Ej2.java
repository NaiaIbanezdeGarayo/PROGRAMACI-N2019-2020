/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1 = JOptionPane.showInputDialog("Introduce un número");
        String num2 = JOptionPane.showInputDialog("Introduce otro número");
        int n1= Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int mul = n1 * n2;
        JOptionPane.showMessageDialog(null, mul);
    }
    
}
