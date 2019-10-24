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
        
        ordenar(n1,n2,n3);
        
        
    }

    private static void ordenar(int n1, int n2, int n3) {
        if (n1 > n2) {
            //si n1 es mayor que n2
            if (n2 > n3) {
               //si n3 es mayor que n2
                if (n1 > n3) {
                    //n3 mayor y n1 menor
                    JOptionPane.showMessageDialog(null, "El número más pequeño es " + n1 + "\n"
                    + "El número más grande es " + n3 );
                }else
                    //n2 mayor y 
                    JOptionPane.showMessageDialog(null, "El número más pequeño es " + n2 + "\n"
                    + "El número más grande es " + n1 );
            }else
                
            
        }else
            //si n2 es menor que n1
    }
    
}
