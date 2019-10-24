/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
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
        //FECHA INTRODUCIDA
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de la fecha"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes de la fecha"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia de la fecha"));
       
        
        LocalDate fecha = LocalDate.of(ano, mes, dia);
        fecha = fecha.plusDays(+100);
        JOptionPane.showMessageDialog(null, "Esta es la fecha después de 100 días: " + fecha );
        
        
    }
    
}
