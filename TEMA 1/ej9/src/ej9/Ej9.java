/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nota = JOptionPane.showInputDialog("Introduce una nota");
        double n = Double.parseDouble(nota);
        if (n <= 2) {
            JOptionPane.showMessageDialog(null, "Muy insuficiente");
        }else
            if (n <=4) {
                JOptionPane.showMessageDialog(null, "Insuficiente");
            }else
                if (n <=5) {
                    JOptionPane.showMessageDialog(null, "Suficiente");
                }else
                    if (n <=7) {
                        JOptionPane.showMessageDialog(null, "Bien");
                    }else
                        if (n <=9) {
                            JOptionPane.showMessageDialog(null, "Notable");
                        }else
                            if (n <= 10) {
                                JOptionPane.showMessageDialog(null, "Sobresaliente");
                            }
    }
    
}
