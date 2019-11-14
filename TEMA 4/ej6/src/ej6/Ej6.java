/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static char [] letra;
    public static int [] contadores;
    public static String cadena="";
    public static void main(String[] args) {
        // TODO code application logic here
        char [] letra = new char [27];
               letra [0] = 'A';
        letra [1] = 'B';
        letra [2] = 'C';
        letra [3] = 'D';
        letra [4] = 'E';
        letra [5] = 'F';
        letra [6] = 'G';
        letra [7] = 'H';
        letra [8] = 'I';
        letra [9] = 'J';
        letra [10] = 'K';
        letra [11] = 'L';
        letra [12] = 'M';
        letra [13] = 'N';
        letra [14] = 'Ñ';
        letra [15] = 'O';
        letra [16] = 'P';
        letra [17] = 'Q';
        letra [18] = 'R';
        letra [19] = 'S';
        letra [20] = 'T';
        letra [21] = 'U';
        letra [22] = 'V';
        letra [23] = 'W';
        letra [24] = 'X';
        letra [25] = 'Y';
        letra [26] = 'Z';
        int [] contadores = new int [27];
        pedirCadena();
        comprobarvocales(letra,contadores);
    }

    private static String pedirCadena() {
        try{
            cadena = JOptionPane.showInputDialog("Introduce una cadena");
            
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Introduce una cadena");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Introduce una cadena válida");
        }
        return cadena;
    }

    private static void comprobarvocales(char[] letra, int [] contadores) {
       cadena = cadena.toUpperCase();
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < letra.length; j++) {
                 
                if (cadena.charAt(i) == letra[j]) {
                    contadores[j]+=1;
                } 
 
            }
            //cadena.charAt(i);
        }
        String mostrar = "";
        for (int n = 0; n < letra.length; n++) {
            mostrar += " Hay " + contadores[n] + " " + letra[n] + "\n" ;
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    }
