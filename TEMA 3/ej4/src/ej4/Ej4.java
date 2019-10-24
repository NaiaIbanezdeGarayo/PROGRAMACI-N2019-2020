/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej4 {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //PRIMERA FECHA
        int a1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de la primera fecha"));
        int m1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes de la primera fecha"));
        int d1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día de la primera fecha"));
        LocalDate fecha1 = LocalDate.of(a1, m1, d1);
        //SEGUNDA FECHA
        int a2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de la segunda fecha"));
        int m2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes de la segunda fecha"));
        int d2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día de la segunda fecha"));
        LocalDate fecha2 = LocalDate.of(a2, m2, d2);
        
        calcularDiferencia(fecha1,fecha2);
    }

    private static void calcularDiferencia(LocalDate fecha1, LocalDate fecha2) {
        Period periodo = Period.between(fecha1, fecha2);
        JOptionPane.showMessageDialog(null, "Diferencia entre las 2 fechas introducidas " + periodo.getYears() + " año(s) " + periodo.getMonths() +  " mes(es) " + periodo.getDays() + " día(s)");
    }
    
}
