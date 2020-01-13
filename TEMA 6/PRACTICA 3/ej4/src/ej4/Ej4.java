/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = JOptionPane.showInputDialog("Introduce un dni");
        Pattern pat = Pattern.compile("[0-9]{8}[ABCDEFGHJKLMNPQRSTWXYZ]");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El dni introducido es correcto");
        }else
            JOptionPane.showMessageDialog(null, "El dni introducido es incorrecto");
    }
    
}
