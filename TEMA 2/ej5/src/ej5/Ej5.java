/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static int nAleatorio;
    public static String nA;
    public static String n3;
    public static String n2;
    public static String n1;
    public static int muertos = 0;
    public static int heridos = 0;
    public static int seguir;
    public static void main(String[] args) {
        // TODO code application logic here
        nAleatorio = (int)(Math.random()*1000);
        nA = Integer.toString(nAleatorio);
        
        System.out.println(nA);
        try{
            do{  
                if (nA.length() == 3) {
                n3 = JOptionPane.showInputDialog("Introduce un número de 3 cífras");
                comprobarHeridosMuertos3(nA);
                juegoGanado();
                    if (nA.length() == 2) {
                    n2 = JOptionPane.showInputDialog("Introduce un número de 2 cífras");
                    comprobarHeridosMuertos2(nA);
                    juegoGanado();
                    }
                    else if (nA.length() == 1) {
                        n3 = JOptionPane.showInputDialog("Introduce un número de 1 cífra");
                        comprobarHeridosMuertos1(nA);
                        juegoGanado();
                    }
                seguir = JOptionPane.showConfirmDialog(null, "Quieres seguir intentandolo?");
                
                }
            }while (seguir == 0);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Introduce un número");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hay un error");
        }
        
    }

    private static void comprobarHeridosMuertos3(String nA) {
        muertos = 0;
        heridos = 0;
        if (nA.charAt(0) == n3.charAt(0)) {
            muertos += 1; 
        }
        if (nA.charAt(0) == n3.charAt(1)) {
            heridos += 1;
        }
        if (nA.charAt(0) == n3.charAt(2)) {
            heridos += 1;
        }
        if (nA.charAt(1) == n3.charAt(0)) {
            heridos += 1;
        }
        if (nA.charAt(1) == n3.charAt(1)) {
            muertos += 1;
        }
        else if (nA.charAt(1) == n3.charAt(2)) {
            heridos += 1;
        }
        if (nA.charAt(2) == n3.charAt(0)) {
            heridos += 1;
        }
        if (nA.charAt(2) == n3.charAt(1)) {
            heridos += 1;
        }
        if (nA.charAt(2) == n3.charAt(2)) {
            muertos += 1;
        }
        
        JOptionPane.showMessageDialog(null, muertos + " muertos y " + heridos + " heridos");
     
    }

    private static void comprobarHeridosMuertos2(String nA) {
        muertos = 0;
        heridos = 0;
        if (nA.charAt(0) == n2.charAt(0)) {
            muertos += 1;
        }
        if (nA.charAt(0) == n2.charAt(1)) {
            heridos += 1;
        }
        if (nA.charAt(1) == n2.charAt(0)) {
            heridos += 1;
        }
        if (nA.charAt(1) == n2.charAt(1)) {
            muertos += 1;
        }
        
        JOptionPane.showMessageDialog(null, muertos + " muertos y " + heridos + " heridos");
    }

    private static void comprobarHeridosMuertos1(String nA) {
        muertos = 0;
        heridos = 0;
        if (nA.charAt(0) == n1.charAt(0)) {
            muertos += 1;
        }
        
        JOptionPane.showMessageDialog(null, muertos + " muertos y " + heridos + " heridos");
    }

    private static void juegoGanado() {
        if(muertos == 3){
            JOptionPane.showMessageDialog(null, "Felicidades has acertado!!");
            System.exit(0);
        }
    }

    
    
}
