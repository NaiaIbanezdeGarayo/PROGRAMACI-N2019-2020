/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static int contadorM ;
    public static int contadorH ;
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 1; i++) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce el peso"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
            String sexo = JOptionPane.showInputDialog("Introduce el sexo del alumno");
            if (sexo.equals("M") ) {
                requisitosMujer(peso,altura);
                JOptionPane.showMessageDialog(null, "Alumno introducido");
            }
            else{
                requisitosHombre(peso,altura);
                JOptionPane.showMessageDialog(null, "Alumno introducido");
                }
        }
        JOptionPane.showMessageDialog(null, "Este es el total de los aceptados:" + "\n" +
                                        "Niñas: " + contadorM + "Niños:" + contadorH);
    }

    private static void requisitosMujer(double peso, double altura) {
        if (altura >= 1.60 && peso >= 60) {
            contadorM++;
        }
    }

    private static void requisitosHombre(double peso, double altura) {
        if (altura >= 1.70 && peso >= 70) {
            contadorH++;
        }
    }
    
}
