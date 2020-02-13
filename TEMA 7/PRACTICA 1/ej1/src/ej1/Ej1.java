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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej1 {

    
    public static ArrayList <Vehiculo> vehiculos;
    public static ArrayList <Persona> personas;
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona();
        vehiculos = new ArrayList<>();
        personas = new ArrayList<>();
        do {
           datosPersona(p);
           
            do {
                tipoVehiculo();
                
            } while (JOptionPane.showConfirmDialog(null, "Quieres seguir introduciendo vehiculos?" )!=1);
            personas.add(p);
            p.setListavehiculos(vehiculos);
            
            
           personas.add(p);
           
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
        Pattern pat = Pattern.compile("^[0-9]{8}[ABCDEFGHJKLMNPQRSTWXYZ]$");
        Matcher mat = pat.matcher(dni);
        if (mat.matches()) {
            dniValido(dni,p);
            JOptionPane.showMessageDialog(null, "El dni introducido es correcto");
            p.setDni(dni);
        }else{
            JOptionPane.showMessageDialog(null, "El dni introducido es incorrecto");
            validarDni(p);
        }
        
    }

    private static void validarNombre(Persona p) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
        Pattern pat = Pattern.compile("^([A-z]{2,})+$");
        Matcher mat = pat.matcher(nombre);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El nombre introducido es correcto");
            p.setNombre(nombre);
        }else{
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarNombre(p);
        }
        
    }

    private static void validarApellido(Persona p) {
        String apellido = JOptionPane.showInputDialog("Introduce el apellido");
        Pattern pat = Pattern.compile("^([A-z]{2,})+$");
        Matcher mat = pat.matcher(apellido);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El nombre introducido es correcto");
            p.setApellido(apellido);
        }else{
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarApellido(p);
        }
    }

    private static void validarDireccion(Persona p) {
        String direccion = JOptionPane.showInputDialog("Introduce la dirección");
        
        p.setDireccion(direccion);
    }

    private static void validarTelefono(Persona p) {
        String telefono = JOptionPane.showInputDialog("Introduce el telefono");
        Pattern pat = Pattern.compile("^6|7[0-9]{8}$");
        Matcher mat = pat.matcher(telefono);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null,"Dato válido");
            p.setTelefono(telefono);
        }else{
            JOptionPane.showMessageDialog(null, "Dato inválido");
            validarTelefono(p);
        }
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
        Pattern pat = Pattern.compile("[0-9]{4}[A-Z]{3}");
        Matcher mat = pat.matcher(matricula);
        if (mat.matches()) {
            matriculaValida(matricula);
            JOptionPane.showMessageDialog(null, "Matrícula valida");
            coc.setMatricula(matricula);
        }
        
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

    /*
    
        throw new DniNoValido();
    .stream().find() ?
    //Referencia a cada uno de los objetos que hay en la lista de personas
    */

    private static void dniValido(String dni, Persona p) {
        final String dni2= dni; //constante para poder usarla en la función lamda
        if(personas.stream().anyMatch(persona ->persona.getDni().equals(dni2))){
            JOptionPane.showMessageDialog(null, "Dni no válido");
            validarDni(p);
        }
    }

    private static void datoVehiculo() {
        String matricula = JOptionPane.showInputDialog("Introduce la matricula");
        Pattern pat = Pattern.compile("[0-9]{4}[A-Z]{3}");
        Matcher mat = pat.matcher(matricula);
        if (mat.matches()) {
            matriculaValida(matricula);
            JOptionPane.showMessageDialog(null, "Matrícula valida");
            
        }
        
        
        
          
    }

    private static void matriculaValida(String matricula) {
        final String mat = matricula; //constante para poder usarla en la función lamda
        if(personas.stream().anyMatch(m ->m.getDni().equals(mat))){
            JOptionPane.showMessageDialog(null, "Matrícula no válido");
            datoVehiculo();
        }     
    }
    
}
