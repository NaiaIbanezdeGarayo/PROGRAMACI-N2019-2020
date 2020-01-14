/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String octal = JOptionPane.showInputDialog("Introduce un número octal");
        Pattern pat = Pattern.compile("^0[1-7][0-7]*$");
        Matcher mat = pat.matcher(octal);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "número válido");
        }
        else
            JOptionPane.showMessageDialog(null, "número no válido");
    }
    
}
