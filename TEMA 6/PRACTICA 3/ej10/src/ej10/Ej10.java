/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String real = JOptionPane.showInputDialog("Introduce un número real");
        Pattern pat = Pattern.compile("^-?[0-9]+[.,][0-9]+$$");
        Matcher mat = pat.matcher(real);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "Número real válido");
        }else
            JOptionPane.showMessageDialog(null, "Número real no válido");
    }
    
}
