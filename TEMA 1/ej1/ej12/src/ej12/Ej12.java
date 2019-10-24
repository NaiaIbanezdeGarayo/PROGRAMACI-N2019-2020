/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cons = JOptionPane.showInputDialog("Inserte su consumo mensual");
        double con = Double.parseDouble(cons);
        if (con < 300) {
            if (con < 500) {
               double consumoResto = con - 300; 
               
            }
        }else
            
    }
    
}
