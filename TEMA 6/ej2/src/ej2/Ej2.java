/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import Clases.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p = new Persona();
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del alumno"));
        p.setcAlumno(codigo);
        
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno");
        p.setnAlumno(nombre);
        
        String domicilio = JOptionPane.showInputDialog("Introduce el domicilio del alumno");
        p.setDomicilio(domicilio);
        
        String telefono = JOptionPane.showInputDialog("Introduce el número de teléfono del alumnow");
        p.setTelefono(telefono);
        
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del estudiante que quieres"));
        if (cod.compareTo == codigo) {
            
        }
        
        JOptionPane.showMessageDialog(null, "Código del estudiante: " + p.getcAlumno() + "Nombre: " + p.getnAlumno()
                                        + "Domicilio: " + p.getDomicilio() + "Teléfono: " + p.getTelefono());
    }
    
}
