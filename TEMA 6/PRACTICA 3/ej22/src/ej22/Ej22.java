/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        validarObraTitulo();
    }

    private static void validarObraTitulo() {
        String titulo = JOptionPane.showInputDialog("Introduce el titulo de la obra");
        Pattern pat = Pattern.compile("^(([A-z]{2,})\\s)+$");
        Matcher mat = pat.matcher(titulo);
        if (mat.matches()) {
            
        }
        
    }
    
}
