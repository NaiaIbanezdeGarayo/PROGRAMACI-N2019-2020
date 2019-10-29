/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej8 {

    
    public static String menu;
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        OPCIONES:
        a) Calcular la edad de una persona.
        b) Sumar dos numeros. ´
        c) Contar cuantas vocales hay en una cadena.
        d) Salir
        */
        
        do {
            menu = JOptionPane.showInputDialog("OPCIONES:" + "\n"+
                                           "a) Calcular la edad de una persona." + "\n" +
                                           "b) Sumar dos numeros." + "\n" +
                                           "c) Contar cuantas vocales hay en una cadena." + "\n" +
                                           "d) Salir" );
            opcionesMenu(menu);
        } while (!"d".equals(menu));
        
        
    }

    private static void opcionesMenu(String menu) {
        switch(menu){
            case "a" : calcularEdad();
            break;
            case "A" : calcularEdad();
            break;
            case "b": sumar();
            break;
            case "B": sumar();
            break;
            case "c": contarVocales();
            break;
            case "C": contarVocales();
            break;
            case "d": salir();
            break;
            case "D": salir();
            break;
            default: JOptionPane.showMessageDialog(null, "Introduce una opción valida");
            
        
        }
    }

    private static void calcularEdad() {
        try{
            String fechaNac = JOptionPane.showInputDialog("Introduce tú fecha de nacimiento para adivinar cuántos años tienes" + "\n" +
                                                          "FORMATO: dd/MM/yyyy");

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaN = LocalDate.parse(fechaNac, formato);

            Period edad = Period.between(fechaN, LocalDate.now());

            JOptionPane.showMessageDialog(null, "Tienes " + edad.getYears() + " años");
        }
        catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "La fecha tecleada no es correcta");
        }
    }

    private static void sumar() {
        try {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

            int suma = n1 + n2;
            JOptionPane.showMessageDialog(null, "La suma de " + n1 + " y " + n2 + " es: " + suma);
        }
        catch(NumberFormatException | NullPointerException e){
            JOptionPane.showMessageDialog(null, "Introduce correctamente un número");
        }
    }

    private static void contarVocales() {
        String cadena = JOptionPane.showInputDialog("Introduce una cadena de carácteres para mostrar por pantalla el número de vocales");
        int nroCadena = cadena.length();
        calcularvocales(cadena, nroCadena);
    }

    private static void salir() {
        System.exit(0);
    }

    private static void calcularvocales(String cadena, int nroCadena) {
        int contador = 0;
        for (int i = 0; i < nroCadena; i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                    contador += 1;
                    break;
                case 'e':
                    contador += 1;
                    break;
                case 'i':
                    contador += 1;
                    break;
                case 'o':
                    contador += 1;
                    break;
                case 'u':
                    contador += 1;
                    break;
                case 'A':
                    contador += 1;
                    break;
                case 'E':
                    contador += 1;
                    break;
                case 'I':
                    contador += 1;
                    break;
                case 'O':
                    contador += 1;
                    break;
                case 'U':
                    contador += 1;
                    break;    
                default:
                    break;
            }
 
             
        }
        JOptionPane.showMessageDialog(null, "La cantidad de vocales es " + contador);
    }
    
}
