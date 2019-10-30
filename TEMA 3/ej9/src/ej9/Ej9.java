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
    public static int continuar = 0;
    public static String lineaDetalle = " ";
    public static int multiplicacion = 0; 
    public static int almacen4 = 0;
    public static int almacen10 = 0;
    public static int almacen21 = 0;
    public static double calculo4;
    public static double calculo10; 
    public static double calculo21 ; 
    public static String totalIva4;
    public static String totalIva10 ;
    public static String totalIva21 ;
    public static double totalesIva = 0;
    public static double total;  
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        nombreCli = JOptionPane.showInputDialog("Introduce el nombre del cliente");
        do {
            try{
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
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Escribe algo");
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Tienes que escribir números");
            }
            lineaDetalles();
            continuar = JOptionPane.showConfirmDialog(null, "¿Quieres introducir productos?");
        } while (continuar != 1);
        
        
        totalIva();
        
        factura();
        
    }

    private static void factura() {
    
        JOptionPane.showMessageDialog(null, "NOMBRE: " + nombreCli + "\n" +
                                      "LINEAS DE DETALLE: " + "\n" + lineaDetalle + "\n" + 
                                      "TOTAL SIN IVA: " + "\n" + totalIva4 + "\n" + totalIva10 + "\n" + totalIva21 + "\n" +
                                      "TOTAL IVA: " + totalesIva + "\n" +
                                      "TOTAL CON IVA: " + total  );
        

    }

    private static void lineaDetalles() {
        
        
        lineaDetalle += cantUnidades + " X " + precUnitario + " = " + (cantUnidades * precUnitario) + "\n"; 
    }

    

    private static void totalIva() {
        calculo4 = almacen4 * 0.04;
        calculo10 = almacen10 * 0.10;
        calculo21 = almacen21 * 0.21;
        totalesIva = calculo4 + calculo10 + calculo21;
        
        totalIva4 =  "4% de " + almacen4 + " = " + calculo4;
        totalIva10 = "10% de " + almacen10 + " = " + calculo10;
        totalIva21 = "21% de " + almacen21 + " = " + calculo21;
        total = totalesIva + almacen4 + almacen10 + almacen21;
    }

    

    private static void iva4() {
        almacen4 += cantUnidades * precUnitario;
    }

    private static void iva10() {
        almacen10 += cantUnidades * precUnitario;
    }

    private static void iva21() {
        almacen21 += cantUnidades * precUnitario;
    }
    
}
