/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej3 {

    public static String opcion;
    
    public static void main(String[] args) {
        
        do {
            opcion = JOptionPane.showInputDialog("Elige un de estas opciones" + "\n"
                                            + "1. Sumar dos numeros" + "\n"
                                            + "2. Restar dos numeros " + "\n"
                                            + "3. Visualizar la tabla de multiplicar de un numero" + "\n"
                                            + "4. Visualizar el cociente y el resto de una division" + "\n"
                                            + "5. Salir del programa");
            menu();
        }while(opcion != "5");
                
        
    }

    private static void menu() {
        switch(opcion){
            case "1": sumarNumeros();
            break;
            case "2": restarNumeros();
            break;
            case "3": tablaMultiplicar();
            break;
            case "4": cocienteResto();
            break;
            case "5": salir();
            break;
            default: JOptionPane.showMessageDialog(null, "Introduce correctamente la opción");
        }
    }

    private static void sumarNumeros() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
        int suma = n1 + n2;
        JOptionPane.showMessageDialog(null, "El total de la suma de " + n1 + "+" + n2 + ":" + suma);
    }

    private static void restarNumeros() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
        int resta = n1 - n2;
        JOptionPane.showMessageDialog(null, "El total de la resta de " + n1 + "-" + n2 + ":" + resta);
    }

    private static void tablaMultiplicar() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for (int i = 0; i < 11; i++) {
            JOptionPane.showMessageDialog(null, n1 + " * " + i + " = " + (n1 * i));
            
        }
    }

    private static void cocienteResto() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número por el que quieres dividir el número anterior"));
        int resto = n1 % n2;
        int cociente = n1 / n2;
        JOptionPane.showMessageDialog(null, "El cociente de la división es: " + cociente +
                                      " y el resto de la división es: " + resto);
    }

    private static void salir() {
        System.exit(0);
    }
    
}
