
import java.time.LocalDate;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1gdaw06
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de una fecha"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes de una fecha"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día de una fecha"));
        
        LocalDate fecha = LocalDate.of(ano, mes, dia);
        
    }
    
}
