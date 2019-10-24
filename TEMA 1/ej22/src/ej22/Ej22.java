/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej22;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int contador = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "));
        for(int i = 1; i <= num; i++)
        {
            if((num % i) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            JOptionPane.showMessageDialog(null, "El numero es primo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es primo");
        }
    }
    
}
