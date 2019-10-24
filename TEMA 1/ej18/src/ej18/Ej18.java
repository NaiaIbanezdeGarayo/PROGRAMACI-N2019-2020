/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej18;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        int b = 1;
        int c = 1;
                
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de repeticiones que quieres que el programa haga"));
        for (int i = 0; i < num; i++) {
            c =  a + b;
            a =  b;
            b =  c;
            JOptionPane.showMessageDialog(null, " , " + c);
        }
        JOptionPane.showMessageDialog(null, "");
    }
    
}
