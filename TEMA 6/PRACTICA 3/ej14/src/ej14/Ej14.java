/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String decimales = JOptionPane.showInputDialog("Cuantos decimales quieres que tenga el número real?");
        String dato= JOptionPane.showInputDialog("Teclea un dato");
        
        if (validar(dato, decimales)){
            JOptionPane.showMessageDialog(null, "dato correcto");
        }else 
            JOptionPane.showMessageDialog(null, "dato incorrecto");
    }
    
    public static boolean validar(String dato,String decimales){
        
        String patron = "[0-9]+[.,][0-9]{"+decimales+"}";
        
        Pattern p = Pattern.compile(patron);
        Matcher m = p.matcher(dato);
        return m.matches();
    }   
    }
    

