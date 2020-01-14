/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hexa = JOptionPane.showInputDialog("Introduce un número hexadecimal");
        Pattern pat = Pattern.compile("^[0-9A-F]+$");
        Matcher mat = pat.matcher(hexa);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "Número válido");
        }else
            JOptionPane.showMessageDialog(null, "Número no válido");
    }
    
}
