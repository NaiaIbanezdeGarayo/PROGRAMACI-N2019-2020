/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static String nombre;
    public static double nota;
    public static String seguir;
    public static double media;
    public static double mediasTotales;
    public static double notas = 0;
    public static double notasT = 0;
    public static int contador = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        do {
            nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del alumno");
            notas = 0;
            for (double i = 0; i < 6; i++) {
             nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota"));
             notas += nota;
             
            }
            seguir = JOptionPane.showInputDialog("Quieres seguir introduciendo notas de alumnos?(Si quieres parar introduce fin)");
            contador = contador + 1;
            medias(notas);
            
        } while (!seguir.equalsIgnoreCase("fin"));
        mediasTotales = mediasTotales / contador;
            
        JOptionPane.showMessageDialog(null, "Esta es la nota media de todos los alumnos: " + mediasTotales);
    }

    private static void medias(double notas) {
        media = notas / 6;
        Math.rint(media);
        mediasTotales += media;
            
        JOptionPane.showMessageDialog(null, "Esta es la nota media de " + nombre + ": " + media);
        
    }
    
}
