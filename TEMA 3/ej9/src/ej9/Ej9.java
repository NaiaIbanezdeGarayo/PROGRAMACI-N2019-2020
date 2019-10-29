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
    public static int cantUnidades = 0;
    public static int precUnitario = 0;
    public static String porIva;
    public static int ivaNormal = 21;
    public static int ivaReducido = 10;
    public static int ivaSupereducido = 4;
    public static int continuar;
    public static String lineaDetalle;
    public static int MULTIPLICACION = cantUnidades * precUnitario;
    public static int almacen4;
    public static int almacen10;
    public static int almacen21;
    public static double CALCULO4 = almacen4 * 0.04;
    public static double CALCULO10 = almacen10 * 0.10;
    public static double CALCULO21 = almacen21 * 0.21;
    public static String TOTALIVA4 = "4% de " + almacen4 + " = " + CALCULO4;;
    public static String TOTALIVA10 = "10% de " + almacen10 + " = " + CALCULO10;;
    public static String TOTALIVA21 = "21% de " + almacen21 + " = " + CALCULO21;;
    public static double totalesIva;
    public static double TOTAL = totalesIva + almacen4 + almacen10 + almacen21; 
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        nombreCli = JOptionPane.showInputDialog("Introduce el nombre del cliente");
        do {
            
            cantUnidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de unidades"));
            precUnitario = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio unitario"));
            porIva = JOptionPane.showInputDialog("Introduce el porcentaje de IVA (4% o 10% o 21%)");
            if ("4".equals(porIva)) {
                iva4();
            }
            if ("10".equals(porIva)) {
               iva10(); 
            }
            if ("21".equals(porIva)) {
                iva21();
            }
            continuar = JOptionPane.showConfirmDialog(null, "¿Quieres introducir productos?");
        } while (continuar != 1);
        lineaDetalle();
        
        totalIva();
        
        factura();
        
    }

    private static void factura() {
    
        JOptionPane.showMessageDialog(null, "NOMBRE: " + nombreCli + "\n" +
                                      "LINEAS DE DETALLE: " + "\n" + lineaDetalle + "\n" + 
                                      "TOTAL SIN IVA: " + TOTALIVA4 + "\n" + TOTALIVA10 + "\n" + TOTALIVA21 + "\n" +
                                      "TOTAL IVA: " + totalesIva + "\n" +
                                      "TOTAL CON IVA: "  );
        

    }

    private static void lineaDetalle() {
        
        
        lineaDetalle += cantUnidades + " X " + precUnitario + " = " + MULTIPLICACION; 
    }

    

    private static void totalIva() {
        totalesIva = CALCULO4 + CALCULO10 + CALCULO21;
    }

    

    private static void iva4() {
        almacen4 += MULTIPLICACION;
    }

    private static void iva10() {
        almacen10 += MULTIPLICACION;
    }

    private static void iva21() {
        almacen21 += MULTIPLICACION;
    }
    
}
