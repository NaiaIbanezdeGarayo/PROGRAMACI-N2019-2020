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
    public static int [][] matriz = new int [4][4];
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        menu();
        
    }

    private static void menu() {
        int opcion = 0;
       
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una de estas opciones: \n"
                                                                    + "1. Rellenar toda la matriz de numeros \n"
                                                                    + "2. Suma de una fila que se pedira al usuario \n"
                                                                    + "3. Suma de una columna que se pedira al usuario \n"
                                                                    + "4. Sumar la diagonal principal \n"
                                                                    + "5. Sumar la diagonal inversa \n"
                                                                    + "6. La media de todos los valores de la matriz. \n"
                                                                    + "7. Salir \n"));
        
            
        } while (opcion != 1 && matriz[0][0] == 0);
        switch(opcion){
            case 1: rellenar();
            break;
            case 2: sumarFila();
            break;
            case 3: sumarColumna();
            break;
            case 4:sumarDiagonalPrincipal();
            break;
            case 5: sumarDiagonalInversa();
            break;
            case 6: media();
            break;
            case 7: System.exit(0);
            break;
            default: JOptionPane.showMessageDialog(null, "La opción introducida es erronea");
        }
        
        }

    private static void rellenar() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Rellena primero la matriz" ));
                
            }}
        menu();
    }

    private static void sumarFila() {
        int sumaF = 0;
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de la fila"));
        if (fila >= 0 && fila < 4) {
           for (int i = 0; i < matriz.length; i++) {
            sumaF += matriz[fila][i];
        }
        JOptionPane.showMessageDialog(null, "La suma de la fila es: " +sumaF);
        menu(); 
        }
        
    }

    private static void sumarColumna() {
        int sumaC = 0;
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de la columna"));
        if (columna > 0 && columna < 4) {
            for (int i = 0; i < matriz.length; i++) {
                sumaC += matriz[i][0];
            }
            JOptionPane.showMessageDialog(null, "La suma de la columna es: " +sumaC);
            menu();
        }
    }

    private static void sumarDiagonalPrincipal() {
        int sumaDP = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            sumaDP += matriz[i][i];
        }
        JOptionPane.showMessageDialog(null, "La suma de la diagonal principal es: " +sumaDP);
        menu();
    }

    private static void sumarDiagonalInversa() {
        int sumaDI = 0;
        for (int i = matriz.length -1, x=0; x < matriz.length; i--, x--) {
            sumaDI += matriz[x][i];
        }
        JOptionPane.showMessageDialog(null, "La suma de la diagonal inversa es: " +sumaDI);
        menu();
    }

    private static void media() {
        int sumaT = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaT += matriz[i][j];
            }
        }
        int suma = sumaT/16;
        JOptionPane.showMessageDialog(null, "La suma de la media es: " +suma);
        menu();
    }
        
       
    }

    

    
    

