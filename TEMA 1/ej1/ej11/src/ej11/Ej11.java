/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1 = JOptionPane.showInputDialog("Introduce el primer número");
        String num2 = JOptionPane.showInputDialog("Introduce el segundo número");
        String num3 = JOptionPane.showInputDialog("Introduce el tercer número");
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        if (n1 < n2) {
            if (n2 < n3 ) {
                JOptionPane.showMessageDialog(null, n1 + " es menor");
                JOptionPane.showMessageDialog(null, n3 + " es mayor");
            }else
                if (n3 < n1) {
                    JOptionPane.showMessageDialog(null, n3 + " es menor");
                    JOptionPane.showMessageDialog(null, n2 + " es mayor");
                }else
                    JOptionPane.showMessageDialog(null, n1 + "es menor");
                    JOptionPane.showMessageDialog(null, n2 +  "es mayor");
        }else
            
            if (n1 < n3) {
                JOptionPane.showMessageDialog(null, n2 + " es menor");
                JOptionPane.showMessageDialog(null, n3 + " es mayor");
            }else
                if (n2 < n3) {
                   JOptionPane.showMessageDialog(null, n2 + " es menor"); 
                   JOptionPane.showMessageDialog(null, n1 + " es mayor");
                }else
                    JOptionPane.showMessageDialog(null, n3 + " es menor");
                    JOptionPane.showMessageDialog(null, n1 + " es mayor");    
            }
        
    }
    
