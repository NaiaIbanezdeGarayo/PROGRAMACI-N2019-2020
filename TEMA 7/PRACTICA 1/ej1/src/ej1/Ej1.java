/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import Clases.Camion;
import Clases.CamionEnum;
import Clases.Coche;
import Clases.CocheEnum;
import Clases.Moto;
import Clases.MotoEnum;
import Clases.Persona;
import Clases.Vehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList <Vehiculo> vehiculos;
    public static ArrayList <Persona> personas;
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona();
        vehiculos = new ArrayList<Vehiculo>();
        
        do {
           datosPersona(p);
           
            do {
                tipoVehiculo();
            } while (JOptionPane.showConfirmDialog(null, "Quieres seguir introduciendo vehiculos?" )!=1);
            personas.add(p);
            p.setListavehiculos(vehiculos);
            
            
           /*personas.add(p);*/
           
        } while (JOptionPane.showConfirmDialog(null, "Quieres seguir introduciendo datos?" )!=1);
        
        
        
    }

    private static void datosPersona(Persona p) {
        validarDni(p);
        validarNombre(p);
        validarApellido(p);
        validarDireccion(p);
        validarTelefono(p);
        
    }

    private static void validarDni(Persona p) {
        String dni = JOptionPane.showInputDialog("Introduce el dni");
        p.setDni(dni);
        
    }

    private static void validarNombre(Persona p) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
        p.setNombre(nombre);
    }

    private static void validarApellido(Persona p) {
        String apellido = JOptionPane.showInputDialog("Introduce el apellido");
        p.setApellido(apellido);
    }

    private static void validarDireccion(Persona p) {
        String direccion = JOptionPane.showInputDialog("Introduce el direccion");
        p.setDireccion(direccion);
    }

    private static void validarTelefono(Persona p) {
        String telefono = JOptionPane.showInputDialog("Introduce el telefono");
        p.setTelefono(telefono);
    }

    private static void tipoVehiculo() {
        String vehiculo = JOptionPane.showInputDialog("¿Que tipo de vehiculo quieres añadir?");
        if (vehiculo.equalsIgnoreCase("camion")) {
            añadirCamion();
        }else if (vehiculo.equalsIgnoreCase("coche")) {
            añadirCoche();
        }else if (vehiculo.equalsIgnoreCase("moto")) {
            añadirMoto();
        }
       
    }

    private static void añadirCamion() {
        Camion cam = new Camion();
        String matricula = JOptionPane.showInputDialog("Introduce la matricula");
        cam.setMatricula(matricula);
        String marca = JOptionPane.showInputDialog("Intorduce la marca del camión");
        
        if (marca.equalsIgnoreCase("scania")) {
            cam.setMarca(CamionEnum.SCANIA);
        }else if (marca.equalsIgnoreCase("man")) {
            cam.setMarca(CamionEnum.MAN);
        }else if (marca.equalsIgnoreCase("volvo")) {
            cam.setMarca(CamionEnum.VOLVO);
        }else if (marca.equalsIgnoreCase("mercedes")) {
            cam.setMarca(CamionEnum.MERCEDES);
        }
        vehiculos.add(cam);
        
    }

    private static void añadirCoche() {
        Coche coc = new Coche();
        String matricula = JOptionPane.showInputDialog("Introduce la matricula");
        coc.setMatricula(matricula);
        String marca = JOptionPane.showInputDialog("Introduce la marca del coche");
        if (marca.equalsIgnoreCase("audi")) {
            coc.setMarca(CocheEnum.AUDI);
        }else if (marca.equalsIgnoreCase("bmw")) {
            coc.setMarca(CocheEnum.BMW);
        }else if (marca.equalsIgnoreCase("renault")) {
            coc.setMarca(CocheEnum.RENAULT);
        }else if (marca.equalsIgnoreCase("hyundai")) {
            coc.setMarca(CocheEnum.HYUNDAI);
        }else if (marca.equalsIgnoreCase("citroen")) {
            coc.setMarca(CocheEnum.CITROEN);
        }
        vehiculos.add(coc);
    }

    private static void añadirMoto() {
        Moto m = new Moto();
        String matricula = JOptionPane.showInputDialog("Introduce la matricula");
        m.setMatricula(matricula);
        String marca = JOptionPane.showInputDialog("Introduce la marca de la moto");
        if (marca.equalsIgnoreCase("kawasaki")) {
            m.setMarca(MotoEnum.KAWASAKI);
        }else if (marca.equalsIgnoreCase("ducati")) {
            m.setMarca(MotoEnum.DUCATI);
        }else if (marca.equalsIgnoreCase("harleydavidson")) {
            m.setMarca(MotoEnum.HARLEYDAVIDSON);
        }
        vehiculos.add(m);
    }

    
    
}
