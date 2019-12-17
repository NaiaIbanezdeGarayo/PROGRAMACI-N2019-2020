/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import Clases.Esfera;
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
        Esfera e = new Esfera();
        Double r = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio para calcularlo"));
        e.setRadio(r);
        
        //e.calcularArea(e);
        //e.calcularLongitud(e);
        //e.calcularVolumen(e);
        
        JOptionPane.showMessageDialog(null, "Resultados:\n"
                                            + "Longitud: " + e.calcularLongitud(e) + "\n"
                                            + "Área: " + e.calcularArea(e) + "\n"
                                            + "Volumen: " + e.calcularVolumen(e));
    }
    
}
