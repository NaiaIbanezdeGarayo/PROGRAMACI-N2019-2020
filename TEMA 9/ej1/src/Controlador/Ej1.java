/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Persona;
import Modelo.TPersonas;
import Vista.MenuPrincipal;
import Vista.VistaPersona;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ej1 {

    private static MenuPrincipal mp;
    private static VistaPersona vp;
    private static BaseDatos bd;
    private static TPersonas tp;
    private static Persona p;
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            bd = new BaseDatos();
            bd.conectar();
            vp = new VistaPersona();
            tp = new TPersonas(bd.getCon());
            
            mp = new MenuPrincipal();
            mp.setVisible(true);
        }catch(Exception e){
            bd.desconectar();
            System.out.println(e.getMessage());
        }
        
    }

    public static void registrarpersona() {
        vp.setVisible(true);
        mp.dispose();
    }

    public static void consultarunapersona() throws Exception {
        try {
            String bpersona = JOptionPane.showInputDialog("Introduce el nombre de la persona que quieres buscar");
            p = tp.seleccionarUnaPersona(bpersona);  
            vp.setVisible(true);
            vp.llenarDatos(p.getNombre(),p.getEdad(),p.getProfesion(),p.getTelefono());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La persona que quieres buscar no existe");
            
        }
         
    }

    public static void consultarpersonas() throws SQLException {
        p = tp.seleccionarPersonas();
        vp.setVisible(true);
        vp.llenarDatosPersonas(p.getNombre(),p.getEdad(),p.getProfesion(),p.getTelefono());
    }


    public static void inserccion(String nombre, int edad, String profesion, String telefono) throws Exception {
        p = new Persona(nombre, edad, profesion, telefono);
        tp.insertar(p);
    }

    

    public static void cerrarVentana() {
        vp.dispose();
        mp.setVisible(true);
    }

    
    
    
}
