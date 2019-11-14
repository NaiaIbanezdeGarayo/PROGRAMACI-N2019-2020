/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepaso;

import static java.awt.SystemColor.menu;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class EjercicioRepaso {

    /**
     * @param args the command line arguments
     */
    public static int menu;
    public static int contador = 0;
    public static String cadenaInvertida;
    public static void main(String[] args) {
        // TODO code application logic here
        /*Menu:
            - 1. Calcular la edad de una persona.
            - 2. Contar cuantas vocales tiene una cadena ed carácteres.
            - 3. Invertir una cadena de carácteres.
            - 4. Sumar 65 días a una fecha introducida y que devuelva en este este formato: Lunes, 11 de noviembre del 2019.
            - 5. Salir.
        * Hasta que no introduzca el número 5 para salir, después de cada operación saldra el menu de nuevo.
        
        */
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n" +
"            - 1. Calcular la edad de una persona.\n" +
"            - 2. Contar cuantas vocales tiene una cadena ed carácteres.\n" +
"            - 3. Invertir una cadena de carácteres.\n" +
"            - 4. Sumar 65 días a una fecha introducida y que devuelva en este este formato: Lunes, 11 de noviembre del 2019.\n" +
"            - 5. Salir."));
            opciones(menu);
        } while (menu != 5);
        
        
        
    }

    private static void opciones(int menu) {
        switch(menu){
            case 1: calcularEdad();
            break;
            case 2: contarVocales();
            break;
            case 3: invertirCadena();
            break;
            case 4: sumarDias();
            break;
            case 5: salir();
            break;
            default: JOptionPane.showMessageDialog(null, "Elige una opción correcta");
        }
    }

    private static void calcularEdad() {
        try{
            String fechaNac = JOptionPane.showInputDialog("Introduce una fecha de nacimiento para calcular la edad");
            DateTimeFormatter formato =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaN = LocalDate.parse(fechaNac, formato);
            Period periodo = Period.between(fechaN, LocalDate.now());
            JOptionPane.showMessageDialog(null, "Tienes " + periodo.getYears() + " años");
            
        }catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "Introduce una fecha válida");
        }
    }

    private static void contarVocales() {
        
        String cadena = JOptionPane.showInputDialog("Introduce una cadena de carácteres para calcular las vocales");
        int nroCadena = cadena.length();
        for (int i = 0; i < nroCadena; i++) {
            switch(cadena){
                case "a": contador += 1;
                break;
                case "A": contador += 1;
                break;
                case "e": contador += 1;
                break;
                case "E": contador += 1;
                break;
                case "i": contador += 1;
                break;
                case "I": contador += 1;
                break;
                case "o": contador += 1;
                break;
                case "O": contador += 1;
                break;
                case "u": contador += 1;
                break;
                case "U": contador += 1;
                break;
                default: JOptionPane.showMessageDialog(null, "En esta cadena no hay ninguna vocal");
            }
        }
        JOptionPane.showMessageDialog(null, "En la cadena introducida hay " + contador + "vocales");
    }

    private static void invertirCadena() {
        String cadena = JOptionPane.showInputDialog("Introduce una cadena para invertirla");
        StringBuilder builder = new StringBuilder(cadena);
        cadenaInvertida = builder.reverse().toString();
        JOptionPane.showMessageDialog(null, cadenaInvertida);
        
    }

    private static void sumarDias() {
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia"));
        LocalDate fecha = LocalDate.of(ano, mes, dia);
        LocalDate fechaNueva = fecha.plusDays(+65);
        JOptionPane.showMessageDialog(null, fechaNueva);
        
    }

    private static void salir() {
        System.exit(0);
    }
    
}
