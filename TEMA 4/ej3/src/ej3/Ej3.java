/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    
           
    public static void main(String[] args) {
        // TODO code application logic here
        String [] alfabeto = new String [27];
        //alfabeto [-1] = "fin";
        alfabeto [0] = "A";
        alfabeto [1] = "B";
        alfabeto [2] = "C";
        alfabeto [3] = "D";
        alfabeto [4] = "E";
        alfabeto [5] = "F";
        alfabeto [6] = "G";
        alfabeto [7] = "H";
        alfabeto [8] = "I";
        alfabeto [9] = "J";
        alfabeto [10] = "K";
        alfabeto [11] = "L";
        alfabeto [12] = "M";
        alfabeto [13] = "N";
        alfabeto [14] = "Ñ";
        alfabeto [15] = "O";
        alfabeto [16] = "P";
        alfabeto [17] = "Q";
        alfabeto [18] = "R";
        alfabeto [19] = "S";
        alfabeto [20] = "T";
        alfabeto [21] = "U";
        alfabeto [22] = "V";
        alfabeto [23] = "W";
        alfabeto [24] = "X";
        alfabeto [25] = "Y";
        alfabeto [26] = "Z";
        
        pedirCadena(alfabeto);
    }

    private static void pedirCadena(String[] alfabeto) {
        String cadena = "";
        int posicion;
        do {
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Estas son las posiciones: " + "\n" + 
                                    Arrays.toString(alfabeto) + "\n" + "[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26]"
                                    + "Introduce una posición, si no quieres introducir más pon -1"));
            if (posicion == -1) {
                JOptionPane.showMessageDialog(null, "Esta es la cadena creada: ");
            }else{
                cadena += alfabeto[posicion];
            }
        } while (posicion != -1);
        JOptionPane.showMessageDialog(null, cadena);
        
        
        
    }
    
}
