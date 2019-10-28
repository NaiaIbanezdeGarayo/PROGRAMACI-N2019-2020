/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej9 {

    public static String nombreCli;
    public static int cantUnidades;
    public static int precUnitario;
    public static String porIva;
    public static int ivaNormal = 21;
    public static int ivaReducido = 10;
    public static int ivaSupereducido = 4;
    public static int continuar;
    
    public static void main(String[] args) {
        // TODO code application logic here
        nombreCli = JOptionPane.showInputDialog("Introduce el nombre del cliente");
        do {
            continuar = JOptionPane.showConfirmDialog(null, "¿Quieres introducir productos?");
            cantUnidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de unidades"));
            precUnitario = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio unitario"));
            porIva = JOptionPane.showInputDialog("Introduce el porcentaje de IVA");
            
        } while (continuar != 1);
        
        factura();
        
    }

    private static void factura() {
        JOptionPane.showMessageDialog(null, "NOMBRE: " + nombreCli)
    }
    
}
