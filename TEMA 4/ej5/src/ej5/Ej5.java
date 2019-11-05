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
    public static void main(String[] args) {
        // TODO code application logic here
        int mesNum = 0;
        int [] meses = new int [12];
        meses [0] = 1;
        meses [1] = 2;
        meses [2] = 3;
        meses [3] = 4;
        meses [4] = 5;
        meses [5] = 6;
        meses [6] = 7;
        meses [7] = 8;
        meses [8] = 9;
        meses [9] = 10;
        meses [10] = 11;
        meses [11] = 12;
        pedirDatos(meses,mesNum);
                
    }

    private static void pedirDatos(int[] meses, int mesNum) {
        int seguir ;
        do {
            
            String dia = JOptionPane.showInputDialog("Introduce un día");
            mesNum = Integer.parseInt(JOptionPane.showInputDialog("Introduce un mes"));
            meses [mesNum] += Integer.parseInt(JOptionPane.showInputDialog("Introduce los litros"));
            
            
            seguir = JOptionPane.showConfirmDialog(null, "¿Quieres introducir más datos?");
        } while (seguir == 1);
        
        JOptionPane.showMessageDialog(null, "Enero: " + meses[0] + "\n"
                                      + "Febrero: " + meses[1] + "\n" 
                                      + "Marzo: " + meses[2] + "\n"
                                      + "Abril: " + meses[3] + "\n" 
                                      + "Mayo: " + meses[4] + "\n"
                                      + "Junio: " + meses[5] + "\n" 
                                      + "Julio: " + meses[6] + "\n"
                                      + "Agosto: " + meses[7] + "\n" 
                                      + "Septiembre: " + meses[8] + "\n"
                                      + "Octubre: " + meses[9] + "\n" 
                                      + "Noviembre: " + meses[10] + "\n"
                                      + "Diciembre: " + meses[11] + "\n"  );
        
    }
    
}
