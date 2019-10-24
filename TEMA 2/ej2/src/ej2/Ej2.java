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
    public static String v;
    public static String c;
    public static String j;
    public static String s;
    public static void main(String[] args) {
        // TODO code application logic here
        
            v = JOptionPane.showInputDialog("Apto o no apto en Visual.Net. Apto: A y No Apto: NA ");
            c = JOptionPane.showInputDialog("Apto o no apto en Cobol. Apto: A y No Apto: NA ");
            j = JOptionPane.showInputDialog("Apto o no apto en Java. Apto: A y No Apto: NA ");
            s = JOptionPane.showInputDialog("Apto o no apto en SQL. Apto: A y No Apto: NA ");
            calcularNota();
        }
        
        
        
               
    

    private static void calcularNota() {
        if (v.equalsIgnoreCase("A")&& c.equalsIgnoreCase("A") && j.equalsIgnoreCase("A") && s.equalsIgnoreCase("A")) {
           JOptionPane.showMessageDialog(null, "Nota del curso: Sobresaliente");
        }else if (s.equalsIgnoreCase("A") && c.equalsIgnoreCase("A") && j.equalsIgnoreCase("A") || v.equalsIgnoreCase("A")) {
           JOptionPane.showMessageDialog(null, "Nota del curso: Notable"); 
        }else if (s.equalsIgnoreCase("A") && c.equalsIgnoreCase("A") ) {
           JOptionPane.showMessageDialog(null, "Nota del curso: Bien"); 
        }else if (s.equalsIgnoreCase("A") && j.equalsIgnoreCase("A") || v.equalsIgnoreCase("A")) {
           JOptionPane.showMessageDialog(null, "Nota del curso: Suficiente"); 
        }else if (c.equalsIgnoreCase("A") && j.equalsIgnoreCase("A") || v.equalsIgnoreCase("A")) {
           JOptionPane.showMessageDialog(null, "Nota del curso: Suficiente"); 
        }else 
            JOptionPane.showMessageDialog(null, "Nota del curso: Insuficiente");
    }
    
}
