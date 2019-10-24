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

    public static String cadena;
    public static int contador = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        cadena = JOptionPane.showInputDialog("Introduce una cadena de carácteres para mostrar por pantalla el número de vocales");
        int nroCadena = cadena.length();
        calcularvocales(cadena, nroCadena);
    }

    private static void calcularvocales(String cadena, int nroCadena) {
        for (int i = 0; i < nroCadena; i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                    contador += 1;
                    break;
                case 'e':
                    contador += 1;
                    break;
                case 'i':
                    contador += 1;
                    break;
                case 'o':
                    contador += 1;
                    break;
                case 'u':
                    contador += 1;
                    break;
                case 'A':
                    contador += 1;
                    break;
                case 'E':
                    contador += 1;
                    break;
                case 'I':
                    contador += 1;
                    break;
                case 'O':
                    contador += 1;
                    break;
                case 'U':
                    contador += 1;
                    break;    
                default:
                    break;
            }
 
             
        }
        JOptionPane.showMessageDialog(null, "La cantidad de vocales es " + contador);
    }
    
}
