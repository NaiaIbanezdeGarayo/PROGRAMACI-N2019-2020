/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fecha = JOptionPane.showInputDialog("Introduce una fecha con el formato dd/mm/aaaa");
        Pattern pat = Pattern.compile("^[0-9]|[1-2][0-9]|3[01]/[0-9]|1[0-2]/1[0-9][0-9][0-9]|200[0-9]|201[0-9]|2020");
        Matcher mat = pat.matcher(fecha);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "fecha válida");
        }else
            JOptionPane.showMessageDialog(null, "fecha no válida");
    }
    
}
