/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String matricula = JOptionPane.showInputDialog("Introduce una matricula");
        Pattern pat = Pattern.compile("[0-9]{4}[A-Z]{3}");
        Matcher mat = pat.matcher(matricula);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "Matrícula válida");
        }else
            JOptionPane.showMessageDialog(null, "Matrícula inválida");
    }
    
}
