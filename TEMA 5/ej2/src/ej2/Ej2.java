/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList <ArrayList <Integer>> alumnos;
    public static ArrayList <String> idioma;
    public static ArrayList <String> nivel;
    public static void main(String[] args) {
        // TODO code application logic here
        alumnos= new ArrayList<>();
        alumnos.add(new ArrayList<Integer>());
        //alumnos.get(0).add();
        idioma = new ArrayList();
        idioma.add(0, "Inglés");
        idioma.add(1, "Francés");
        idioma.add(2, "Alemán");
        idioma.add(3, "Ruso");
        nivel = new ArrayList();
        //nivel.add(0, "Básico");
        //nivel.add(1, "Medio");
        //nivel.add(2, "Perfeccionamiento");
        
        //alumnos.get(0).add(0, Integer.SIZE);
        añadirAlumnos();
    }

    private static void añadirAlumnos() {
        do {
            String i = JOptionPane.showInputDialog("Introduce el idioma tal y como está escrito: \n"
                                            + " Inglés \n"
                                            + " Francés \n"
                                            + " Alemán \n"
                                            + " Ruso");
            if (idioma.contains(i)) {
            
                String n = JOptionPane.showInputDialog("Introduce el nivel: \n"
                                        + "B --> Básico \n"
                                        + "M --> Medio \n"
                                        + "P --> Perfeccionamiento"); 
                if (n.equalsIgnoreCase("B")) {
                    int cant = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de alumnos que hay en esa clase"));
                    alumnos.get(0).add(idioma.indexOf(i),cant);
                }
                else if (n.equalsIgnoreCase("M")) {
                    int cant = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de alumnos que hay en esa clase"));
                    alumnos.get(1).add(idioma.indexOf(i),cant);
                }
                else if (n.equalsIgnoreCase("P")) {
                    int cant = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de alumnos que hay en esa clase"));
                    alumnos.get(2).add(idioma.indexOf(i),cant);
                }
            }
        } while (JOptionPane.showConfirmDialog(null, "¿Quieres añadir más?")!=-1);
        
        
    }
    
}
