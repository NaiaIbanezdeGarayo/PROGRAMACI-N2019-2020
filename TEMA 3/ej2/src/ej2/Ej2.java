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

    public static String cadena;
    public static int nroCadena;
    public static String cInvertida;
    public static void main(String[] args) {
        // TODO code application logic here
        cadena = JOptionPane.showInputDialog("Introduce una cadena de carácteres");
        //nroCadena = cadena.length();
        invertir(cadena);
    }

    private static void invertir(String cadena) {
        StringBuilder builder = new StringBuilder(cadena);
        cInvertida = builder.reverse().toString();
        JOptionPane.showMessageDialog(null, cInvertida);
    }
    
}
