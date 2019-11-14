/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    
    public static double vuelta = 0 ;
    public static double pago = 0 ;
    public static double importe = 0 ;
    
    public static void main(String[] args) {
        // TODO code application logic here
        double [] dinero = new double [12];
        dinero[0] = 500;
        dinero[1] = 200;
        dinero[2] = 100;
        dinero[3] = 50;
        dinero[4] = 20;
        dinero[5] = 10;
        dinero[6] = 5;
        dinero[7] = 2;
        dinero[8] = 1;
        dinero[9] = 0.5;
        dinero[10] = 0.2;
        dinero[11] = 0.1;
        int [] cambio = new int [12];
        pedirImporte();
        darcambios(dinero,cambio);
        
    }

    private static void pedirImporte() {
        
        try {
            importe = Double.parseDouble(JOptionPane.showInputDialog("Introduce el importe de la venta"));
            pago = Double.parseDouble(JOptionPane.showInputDialog("Introduce cuanto dinero vas a meter"));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Introduce un valor válido");
        }
        
        
             
    }

    private static void darcambios(double[] dinero, int[] cambio) {
        vuelta = pago - importe;
        do {
           if (vuelta > 500) {
                cambio[0]+= 1;
                vuelta= vuelta - 500;
            }else if (vuelta > 200) {
                cambio[1]+= 1;
                vuelta= vuelta - 200;
            }else if (vuelta > 100) {
                cambio[2]+= 1;
                vuelta= vuelta - 100;
            }else if (vuelta > 50) {
                cambio[3]+= 1;
                vuelta= vuelta - 50;
            }else if (vuelta > 20) {
                cambio[4]+= 1;
                vuelta= vuelta - 20;
            }else if (vuelta > 10) {
                cambio[5]+= 1;
                vuelta= vuelta - 10;
            }else if (vuelta > 5) {
                cambio[6]+= 1;
                vuelta= vuelta - 5;
            }else if (vuelta > 2) {
                cambio[7]+= 1;
                vuelta= vuelta - 2;
            }else if (vuelta > 1) {
                cambio[8]+= 1;
                vuelta= vuelta - 1;
            }else if (vuelta > 0.5) {
                cambio[9]+= 1;
                vuelta= vuelta - 0.5;
            }else if (vuelta > 0.2) {
                cambio[10]+= 1;
                vuelta= vuelta - 0.2;
            }else if (vuelta > 0.1) {
                cambio[11]+= 1;
                vuelta= vuelta - 0.1;
            }
           
           
        } while (vuelta != 0);
        
        String mostrar = " ";
        for (int n = 0; n < dinero.length; n++) {
            mostrar +=  cambio[n] + " billetes/monedas de " + dinero[n] + "\n" ;
        }
        JOptionPane.showMessageDialog(null, mostrar);    
        
    }

    
    
}
