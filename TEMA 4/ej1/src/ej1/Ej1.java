/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double [] numeros = new double [10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
            
        }
        Arrays.sort(numeros);
        //JOptionPane.showMessageDialog(null,Arrays.toString(numeros));
        
        JOptionPane.showMessageDialog(null, "Mínimo: " + numeros[0] + " Máximo: " + numeros[9]);   
                
    }
    
}
