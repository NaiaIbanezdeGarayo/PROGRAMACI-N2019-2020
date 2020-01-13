/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String nro = JOptionPane.showInputDialog("Introduce un número entero negativo");
        Pattern pat = Pattern.compile("-[0-9]+");
        Matcher mat = pat.matcher(nro);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El dato es correcto");
        }else
            JOptionPane.showMessageDialog(null, "El dato es incorrecto");
        
    }
    
}
