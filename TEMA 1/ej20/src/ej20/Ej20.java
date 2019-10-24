/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static int seguir = 0 ;
    public static void main(String[] args) {
        // TODO code application logic here
        int numAl = (int)(Math.random()*100);
        
        System.out.println(numAl);
        int nAl = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número aleatorio"));
        while(nAl != numAl || seguir != 1 ){
            if (nAl > numAl) {
                numeroIgual(nAl,numAl);
                JOptionPane.showMessageDialog(null, "El valor es más pequeño");
            }
            else{
                numeroIgual(nAl,numAl);
                JOptionPane.showMessageDialog(null, "El número es mas pequeño");
                }
            
        }
        
        } 

    private static void numeroIgual(int nAl, int numAl) {
        if (nAl == numAl) {
            JOptionPane.showMessageDialog(null, "Felicidades!!Has acertado el número aleatorio");
        }else{
            seguir = JOptionPane.showConfirmDialog(null, "Quieres seguir introduciendo números");
            if (seguir == 0) {
                JOptionPane.showInputDialog("Introduce otro número");
                }
        }  
    }

    
    
}
