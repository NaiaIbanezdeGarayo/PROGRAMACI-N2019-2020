/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] golosina = new String [4][4];
        golosina [0][0] = "KitKat";
        golosina [0][1] = "Chicles Fresa";
        golosina [0][2] = "Lacasitos";
        golosina [0][3] = "Palotes";
        golosina [1][0] = "Kinder Bueno";
        golosina [1][1] = "Bolsa variada Haribo";
        golosina [1][2] = "Cheetos";
        golosina [1][3] = "Twix";
        golosina [2][0] = "Kinder Bueno";
        golosina [2][1] = "M&M";
        golosina [2][2] = "Papa Delta";
        golosina [2][3] = "Chicles Menta";
        golosina [3][0] = "Lacasitos";
        golosina [3][1] = "Crunch";
        golosina [3][2] = "Milkybar";
        golosina [3][3] = "KitKat";
        
        double [][] precio = new double [4][4];
        precio [0][0] = 1.1;
        precio [0][1] = 0.8;
        precio [0][2] = 1.5;
        precio [0][3] = 0.9;
        precio [1][0] = 1.8;
        precio [1][1] = 1;
        precio [1][2] = 1.2;
        precio [1][3] = 1;
        precio [2][0] = 1.8;
        precio [2][1] = 1.3;
        precio [2][2] = 1.2;
        precio [2][3] = 0.8;
        precio [3][0] = 1.5;
        precio [3][1] = 1.1;
        precio [3][2] = 1.1;
        precio [3][3] = 1.1;
        
        int [][] cantidad = new int [4][4];
        for (int i = 0; i < cantidad.length; i++) {
            for (int j = 0; j < cantidad.length; j++) {
                cantidad[i][j]=5;
            }
        }
        /*cantidad [0][0] = 5;
        cantidad [0][1] = 5;
        cantidad [0][2] = 5;
        cantidad [0][3] = 5;
        cantidad [1][0] = 5;
        cantidad [1][1] = 5;
        cantidad [1][2] = 5;
        cantidad [1][3] = 5;
        cantidad [2][0] = 5;
        cantidad [2][1] = 5;
        cantidad [2][2] = 5;
        cantidad [2][3] = 5;
        cantidad [3][0] = 5;
        cantidad [3][1] = 5;
        cantidad [3][2] = 5;
        cantidad [3][3] = 5;*/
        /*Arrays.fill(cantidad,5);*/
        
        menu();
    }

    private static void menu() {
        int m = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opción"
                + "1. Pedir golosina \n"
                + "2. Mostrar golosinas \n"
                + "3. Rellenar golosinas \n"
                + "4. Apagar máquina \n"));
        switch(m){
            case 1: pedirGolosina();
            break;
            case 2: mostrarGolosinas();
            break;
            case 3: rellenarGolosinas();
            break;
            case 4: apagarMaquina();
            break;
            default: JOptionPane.showMessageDialog(null, "Introduce correctamente la opción");
        }
    }

    private static void pedirGolosina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void mostrarGolosinas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void rellenarGolosinas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void apagarMaquina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
