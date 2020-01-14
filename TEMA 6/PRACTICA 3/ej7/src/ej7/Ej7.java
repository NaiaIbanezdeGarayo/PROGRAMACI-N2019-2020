/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nBinario = JOptionPane.showInputDialog("Introduce una matricula");
        Pattern pat = Pattern.compile("^[01]{1,}$");
        Matcher mat = pat.matcher(nBinario);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "numero válido");
        }else
            JOptionPane.showMessageDialog(null, "numero inválido");
    }
    
}
