/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuadrado = -1;
        int cuadradoT = 0 ;
        //int contador = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for (int i = 0; i < n; i++) {
        
            cuadrado = cuadrado + 2;
            cuadradoT = cuadradoT + cuadrado;
        }
       JOptionPane.showMessageDialog(null, "El cuadrado de " + n + " es= " +  cuadradoT);
    }
    
}
