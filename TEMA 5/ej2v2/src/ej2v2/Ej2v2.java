/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2v2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej2v2 {

    public static ArrayList <ArrayList <Integer>> alumnos;
    public static ArrayList <String> idioma;
    public static ArrayList <String> nivel;
    public static void main(String[] args) {
        // TODO code application logic here
        
        alumnos= new ArrayList<>();
        alumnos.add(new ArrayList<Integer>());
        idioma = new ArrayList();
        nivel = new ArrayList();
        añadirAlumnos();
    }

    private static void añadirAlumnos() {
        do {
            String i = JOptionPane.showInputDialog("Introduce el idioma tal y como está escrito: \n"
                                            + " Inglés \n"
                                            + " Francés \n"
                                            + " Alemán \n"
                                            + " Ruso");
            if (!idioma.contains(i)) {
                idioma.add(i);
            }
                
            String n = JOptionPane.showInputDialog("Introduce el nivel: \n"
                                        + "B --> Básico \n"
                                        + "M --> Medio \n"
                                        + "P --> Perfeccionamiento"); 
            nivel.add(n);
            
            int cant = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de alumnos que hay en esa clase"));
            
            alumnos.get(idioma.indexOf(i)).add(nivel.indexOf(n), cant);
        } while (JOptionPane.showConfirmDialog(null, "¿Quieres añadir más?")!=-1);
        sacarPorPantalla();
    }

    private static void sacarPorPantalla() {
        String texto="";
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < alumnos.size(); j++) {
                texto += "Idioma: " + idioma.get(i) + " Nivel: " + nivel.get(i) + alumnos.get(i).get(j);
            }
        }
        
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
