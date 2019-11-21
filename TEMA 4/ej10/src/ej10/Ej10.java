 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu1();
        menu();
    }

    private static void menu1() {
        int opcion1 = 0;
        do {
            opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Elige una de estas opciones: \n"
                                                                    + "1. Rellenar toda la matriz de numeros \n"
                                                                    + "2. Suma de una fila que se pedira al usuario \n"
                                                                    + "3. Suma de una columna que se pedira al usuario"
                                                                    + "4. Sumar la diagonal principal \n"
                                                                    + "5. Sumar la diagonal inversa \n"
                                                                    + "6. La media de todos los valores de la matriz. \n"
                                                                    + "7. Salir \n"));
        
            rellenar();
        } while (opcion1 != 1);
       
    }

    private static void rellenar() {
        int [][] matriz = new int [4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Rellena primero la matriz en la posicion " + matriz[i].toString() + matriz[j].toString()));
                
            }
            
        }
        
        
    }

    private static void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
