/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] codigos = new int [5];
        int [][] faltas = new int [5][31];
        int a = 0;
        int continuar;
        do{
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del alumno"));
            codigos[a]=codigo;
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce un día"));
            
            int falta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de faltas del día introducido"));
            faltas[codigo][dia] = falta;
            continuar = JOptionPane.showConfirmDialog(null, "¿Quieres continuar introduciendo codigos?");
            
        }while(continuar == 0);
        calcularFaltas(codigos,faltas);
    }

    private static void calcularFaltas(int[] codigos, int[][] faltas) {
         
    }
    
}
