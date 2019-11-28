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
    public static String [][] golosina;
    public static double [][] precio;
    public static int [][] cantidad;
    public static int [][] ventasC;
    public static void main(String[] args) {
        // TODO code application logic here
        golosina = new String [4][4];
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
        
        precio = new double [4][4];
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
        
        cantidad = new int [4][4];
        for (int i = 0; i < cantidad.length; i++) {
            for (int j = 0; j < cantidad.length; j++) {
                cantidad[i][j]=5;
            }
        }
        
        ventasC = new int [4][4];
        for (int i = 0; i < ventasC.length; i++) {
            for (int j = 0; j < ventasC.length; j++) {
                ventasC[i][j]=0;
            }
        }
        
        
        menu();
    }

    private static void menu() {
        int m = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opción\n"
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
        int continuar ;
        do {
            String fc = JOptionPane.showInputDialog("Introduce el número del producto");
            int p1 = Integer.parseInt(Character.toString(fc.charAt(0)));
            int p2 = Integer.parseInt(Character.toString(fc.charAt(1)));
            if ((p1 >= 0 && p1 <=3) && (p2 >= 0 && p2 <=3)) {
                if (cantidad[p1][p2] == 0) {
                    JOptionPane.showMessageDialog(null, "El producto seleccionado está agotado");
                }else
                    cantidad[p1][p2] = cantidad[p1][p2] -1;
                    ventasC[p1][p2] = ventasC[p1][p2] +1;

            }else
                JOptionPane.showMessageDialog(null, "El número introducido es erróneo");
            continuar = JOptionPane.showConfirmDialog(null, "Puede recoger el producto: " + golosina[p1][p2] + " con precio:" + precio[p1][p2] + "\n" 
                                                        + "¿Quiere sacar más productos?");
            
        } while (continuar != 1);
        
        menu();
    }

    private static void mostrarGolosinas() {
        String texto = "";
        for (int i = 0; i < golosina.length; i++) {
            for (int j = 0; j < golosina.length; j++) {
                if (cantidad[i][j] != 0) {
                    texto += "Código del producto: " + i + ""+ j + "" + " Nombre del producto: " + golosina[i][j] + " Precio: " + precio[i][j] + "\n";
                }
                
            }
        }
        JOptionPane.showMessageDialog(null, texto);
        menu();
    }

    private static void rellenarGolosinas() {
        int continuar = 3 ;
        
        
            String con = JOptionPane.showInputDialog("Introduce la contraseña");
            if (con.equals("MaquinaExpendedora2019")) {
                do {
                    String cod = JOptionPane.showInputDialog("Introduce primero el código del producto");
                    int p1 = Integer.parseInt(Character.toString(cod.charAt(0)));
                    int p2 = Integer.parseInt(Character.toString(cod.charAt(1)));
                    if ((p1 >= 0 && p1 <=3) && (p2 >= 0 && p2 <=3)) {
                        int cant = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad que vas a meter"));
                        cantidad[p1][p2] += cant;
                        JOptionPane.showMessageDialog(null, "Se ha introducido al producto " + cod + ": " + golosina[p1][p2] +  " esta cantidad: " + cant );
                        continuar = JOptionPane.showConfirmDialog(null, "¿Quieres introducir más productos?");
                        }
                } while (continuar != 1);
                menu();
            }else
                JOptionPane.showMessageDialog(null, "La contraseña introducida es errónea");
                menu();
        
    }

    private static void apagarMaquina() {
        String texto ="";
        for (int i = 0; i < golosina.length; i++) {
            for (int j = 0; j < golosina.length; j++) {
                texto += "Código del producto: " + i + ""+ j + "" + " Nombre del producto: " + golosina[i][j] + " Cantidades vendidas: " + ventasC[i][j] + "\n"; 
            }
        }
        JOptionPane.showMessageDialog(null, texto);
        System.exit(0);
        
    }
    
}
