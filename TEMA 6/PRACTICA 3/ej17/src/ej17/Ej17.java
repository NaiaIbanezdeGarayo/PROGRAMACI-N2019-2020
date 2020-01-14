/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        Pattern pat = Pattern.compile("^(([A-z]{2,})\\s)+$");
        Matcher mat = pat.matcher(nombre);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "nombre válido");
        }else
            JOptionPane.showMessageDialog(null, "nombre no válido");
    }
    
}
