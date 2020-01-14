/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String email = JOptionPane.showInputDialog("Introduce un email");
       Pattern pat = Pattern.compile("^[A-Za-z0-9.-_]+@[A-Za-z.-_]+.[a-z]+");
       Matcher mat = pat.matcher(email);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, mat);
        }
    }
    
}
