/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

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
        String mensaje = JOptionPane.showInputDialog("Introduce un mensaje");
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
