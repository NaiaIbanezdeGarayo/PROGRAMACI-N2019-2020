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
        int total = 0;
        int tArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
        int [] numeros = new int [tArray];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*9) +1;
            total = total + numeros[i];
        }
        
        for (int i = 0; i < numeros.length; i++) {
            JOptionPane.showMessageDialog(null, "Posición: " + i + " Contenido: " + numeros[i]);
            
        }
        JOptionPane.showMessageDialog(null, "Total del array: " + total);
    }
    
}
