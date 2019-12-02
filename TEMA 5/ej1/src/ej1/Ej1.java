/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList <Float> num = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        String continuar = "";
        do {
            float nums = Float.parseFloat(JOptionPane.showInputDialog("Introduce un número"));
            num.add(nums);
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo números? \n"
                                                                + "si es si, escribe s\n"
                                                                + "en lo contrario, escribe fin");
        } while (continuar.equalsIgnoreCase("fin"));
        menu();
    }

    private static void menu() {
        op = JOptionPane.showInputDialog("Menu:\n"
                                        + "1. Visualizar el valor maximo y el mínimo.\n"
                                        + "2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo has encontrado o no.");
    }
    
}
