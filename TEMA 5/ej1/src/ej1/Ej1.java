/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList <Float> num = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        String continuar = "";
        do {
            float nums = Float.parseFloat(JOptionPane.showInputDialog("Introduce un número"));
            num.add(nums);
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo números? \n"
                                                                + "si es si, escribe s\n"
                                                                + "en lo contrario, escribe fin");
        } while (continuar.equalsIgnoreCase("s"));
        menu();
    }

    private static void menu() {
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
                                        + "1. Visualizar el valor maximo y el mínimo.\n"
                                        + "2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo has encontrado o no.\n"
                                        + "3. Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error \n"
                                        + "4. Convertir el arrayList en un array.\n"
                                        + "5. Si no esta vacío, mostrar el numero de elementos que contiene.\n"
                                        + "6. Insertar un nuevo elemento por el final.\n"
                                        + "7. Insertar un nuevo elemento en la posicion que te indique el usuario.\n"
                                        + "8. Borrar un elemento de una posicion concreta\n"
                                        + "9. Calcular la suma y la media aritmetica de los valores contenidos.\n"
                                        + "10. Finalizar."));
        switch(op){
            case 1: valorMaxMin();
            break;
            case 2: buscarNum();
            break;
            case 3: buscarNumBorrar();
            break;
            case 4: convertir();
            break;
            case 5: mostrarNumeros();
            break;
            case 6: insertarElemento();
            break;
            case 7: insertarElementoPosicion();
            break;
            case 8: borrarPosicion();
            break;
            case 9: calcular();
            break;
            case 10: fin();
            break;
            default: JOptionPane.showMessageDialog(null, "La opción introducida no existe");
            }
        }while(op == 10);      
            
      
    }

    private static void valorMaxMin() {
        float max = 0;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) < max) {
                max = num.get(i);
            }
        }
        float min = max;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) < min) {
                min = num.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Máximo: " + max + "\n"
                                            + "Mínimo: " + min);
        
        menu();
    }

    private static void buscarNum() {
        float n = Float.parseFloat(JOptionPane.showInputDialog("Introduce un número para buscarlo"));
       
        if (num.contains(n)) {
            JOptionPane.showMessageDialog(null, "Se ha encontrado el número " + n + " en el ArrayList");
        }else
            JOptionPane.showMessageDialog(null, "No se ha encontrado el número " + n + " en el ArrayList");
        
        menu();
    }

    private static void buscarNumBorrar() {
        float n = Float.parseFloat(JOptionPane.showInputDialog("Introduce un número para buscarlo"));
        if (num.contains(n)) {
            num.remove(n);
            JOptionPane.showMessageDialog(null, "El número elegido se acaba de borrar");
        }else
            JOptionPane.showMessageDialog(null, "No se ha encontrado el número " + n + " en el ArrayList");
        menu();
    }

    private static void convertir() {
        num.toArray();
        menu();
    }

    private static void mostrarNumeros() {
        String texto = "";
        for (int i = 0; i < num.size(); i++) {
            texto += "Posición " + i + ": " + num.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
        menu();
    }

    private static void insertarElemento() {
        float n = Float.parseFloat(JOptionPane.showInputDialog("Introduce un número para añadirlo"));
        num.add(n);
        JOptionPane.showMessageDialog(null, "El número elegido se ha introducido");
        menu();
    }

    private static void insertarElementoPosicion() {
        float n = Float.parseFloat(JOptionPane.showInputDialog("Introduce un número para añadirlo"));
        int p = Integer.parseInt(JOptionPane.showInputDialog("Introduce en la posición que que quieres añadirlo"));
        num.add(p, n);
        menu();
    }

    private static void borrarPosicion() {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Introduce en la posición que que quieres borrar"));
        num.remove(p);
        menu();
    }

    private static void calcular() {
        float suma = 0;
        int contador = 0;
        for (int i = 0; i < num.size(); i++) {
            float g = num.get(i);
            suma = suma + g;
            contador +=1;
        }
        float media = suma/contador;
        JOptionPane.showMessageDialog(null, "La media del ArrayList es: " + media);
        menu();
    }

    private static void fin() {
        System.exit(0);
    }
    
}
