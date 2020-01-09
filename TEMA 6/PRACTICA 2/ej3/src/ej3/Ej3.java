/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Clases.Directivo;
import Clases.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList <Empleado> empleados;
    public static ArrayList <Directivo> directores;

    
    public static void main(String[] args) {
        // TODO code application logic here
        añadirDatos();
        longitudArrays();
        
    }

    private static void añadirDatos() {
        empleados = new ArrayList();
        directores = new ArrayList();
        subordinados = new ArrayList();
        
        do {
            String nDirectivo = JOptionPane.showInputDialog("Introduce el nombre del director");
           
            int eDirectivo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del director"));
            String categoria = JOptionPane.showInputDialog("Introduce la categoria del director");
            double sueldoBruto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo bruto"));
            
            directores.add(new Directivo(categoria, sueldoBruto, nDirectivo, eDirectivo));
        } while (JOptionPane.showConfirmDialog(null, "Quieres seguir introduciendo directores?") != 1);
        do {
            String nEmpleado = JOptionPane.showInputDialog("Introduce el nombre del empleado");
            int eEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del empleado"));
            double sueldoBruto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo bruto"));
            
            empleados.add(new Empleado(sueldoBruto,nEmpleado,eEmpleado));
        } while (JOptionPane.showConfirmDialog(null, "Quieres seguir introduciendo empleados?") != 1);
        
       directores.add(listaEmpleados);
    }

    private static void longitudArrays() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
