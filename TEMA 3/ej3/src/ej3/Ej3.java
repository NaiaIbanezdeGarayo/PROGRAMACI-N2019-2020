/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej3 {

    public static String cadena;
    public static String caracter;
    public static int contador = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            cadena = JOptionPane.showInputDialog("Introduce una cadena de carácteres");
            caracter = JOptionPane.showInputDialog("Introduce un carácter para verificar cuántas veces se repite en la cadena");
            verificarCadena(cadena, caracter);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "No se pueden introducir números");
        }
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Introduce una cadena");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }

    private static void verificarCadena(String cadena, String caracter) {
       
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter.charAt(0)) {
                contador += 1;
            } 
        }
        JOptionPane.showMessageDialog(null, "El carácter " + caracter + " se repite " + contador + " veces");
    }
    
}
