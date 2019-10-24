/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej1 {

    public static int horas;
    public static String estadoCivil;
    public static String nivelEstudios;
    public static int totalHoras;
    public static int horasN;
    public static void main(String[] args) {
        // TODO code application logic here
        horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el total de horas trabajadas"));
        estadoCivil = JOptionPane.showInputDialog("Introduce el estado civil");
        nivelEstudios = JOptionPane.showInputDialog("Introduce el nivel de estudios");
        calcularHoras(horas);
        combinaciones(estadoCivil,nivelEstudios);
        
    }

    private static void calcularHoras(int horas) {
        if (horas > 40) {
            int horasExtras = horas - 40;
            int horasExtra = horasExtras * 15;
            int horasNormales = 40 * 10;
            totalHoras = horasExtra + horasNormales;
        }
        else{
            horasN = horas * 10; 
        }
        
        }

    private static void combinaciones(String estadoCivil, String nivelEstudios) {
        if (estadoCivil.equalsIgnoreCase("s") && nivelEstudios.equalsIgnoreCase("p")) {
            if (horas >40) {
                sumaTotalExtras();
            }else
                sumaTotalHorasNormales();
            
        }else if (estadoCivil.equalsIgnoreCase("s") && nivelEstudios.equalsIgnoreCase("s")) {
            if (horas >40) {
                sumaTotalExtras();
            }else
                sumaTotalHorasNormales();
        }else if (estadoCivil.equalsIgnoreCase("s") && nivelEstudios.equalsIgnoreCase("m")) {
            if (horas >40) {
                sumaTotalExtras();
            }else
                sumaTotalHorasNormales();
        }else if (estadoCivil.equalsIgnoreCase("c") && nivelEstudios.equalsIgnoreCase("s")) {
            if (horas >40) {
                sumaTotalExtras();
            }else
                sumaTotalHorasNormales();
        }else if (estadoCivil.equalsIgnoreCase("v") && nivelEstudios.equalsIgnoreCase("s")) {
            if (horas >40) {
                sumaTotalExtras();
            }else
                sumaTotalHorasNormales();
        }else if (estadoCivil.equalsIgnoreCase("c") && nivelEstudios.equalsIgnoreCase("s")) {
            if (horas >40) {
                sumaTotalExtras();
            }else
                sumaTotalHorasNormales();
        }else if (estadoCivil.equalsIgnoreCase("v") && nivelEstudios.equalsIgnoreCase("p")) {
            if (horas >40) {
                sumaTotalExtras();
            }else
                sumaTotalHorasNormales();
        }else if (estadoCivil.equalsIgnoreCase("d") && nivelEstudios.equalsIgnoreCase("s")) {
            if (horas >40) {
                sumaTotalExtras();
            }else
                sumaTotalHorasNormales();
        }else 
            sumaTotalHorasNormalesSinPlus();
    }

    private static void sumaTotalExtras() {
        int sumaTotalExtras = totalHoras + 100;
        JOptionPane.showMessageDialog(null, "Sueldo correspondiente: " + sumaTotalExtras + "€");
    }

    private static void sumaTotalHorasNormales() {
        int sumaTotalHorasNormales = horasN + 100;
        JOptionPane.showMessageDialog(null, "Sueldo correspondiente: " + sumaTotalHorasNormales + "€");
    }

    private static void sumaTotalHorasNormalesSinPlus() {
        JOptionPane.showMessageDialog(null, "Sueldo correspondiente: " + horasN + "€");
    }
            
    }
    

