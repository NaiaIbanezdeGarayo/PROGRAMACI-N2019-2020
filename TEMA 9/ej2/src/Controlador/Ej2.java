/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Acontecimiento;
import Modelo.BaseDatos;
import Modelo.Persona;
import Modelo.TAcontecimientos;
import Modelo.TAcontecimientosPersona;
import Modelo.TPersona;
import Vista.Acontecimientos;
import Vista.ListadoPersonas;
import Vista.PaginaPrincipal;
import Vista.VistaAcontecimientoPersona;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */

public class Ej2 {
    private static PaginaPrincipal vpp;
    private static Acontecimiento a;
    private static Persona p;
    private static Acontecimientos va;
    private static BaseDatos bd;
    private static TAcontecimientos ta;
    private static TPersona tp;
    private static ArrayList<Acontecimiento> listaEventos; 
    private static VistaAcontecimientoPersona vap;
    private static TAcontecimientosPersona tap;
    private static ListadoPersonas lp;
    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            bd = new BaseDatos();
            bd.conectar();
            ta = new TAcontecimientos(bd.getCon());
            tp = new TPersona(bd.getCon());
            tap = new TAcontecimientosPersona(bd.getCon());
            vpp = new PaginaPrincipal();
            
            vpp.setVisible(true); 
        } catch (Exception e) {  
            bd.desconectar();
            System.out.println(e.getMessage());
        }

    }

    public static void ventanaAcontecimientos() {
        vpp.dispose();
        va = new Acontecimientos();
        va.setVisible(true);
    }

    public static void añadirAcontecimiento(String nombre, String lugar, String fecha, String horainicio, String horafinal, int aforo)  {
        try{
            a = new Acontecimiento(nombre,lugar,fecha,horainicio,horafinal,aforo);
            ta.añadirAcontecimientos(a);
        }
        catch(Exception e){
            System.out.println("No se han podido añadir los acontecimientos");
        }
    }

    public static void cerrarAcontecimientos() {
        va.dispose();
        vpp = new PaginaPrincipal();
        vpp.setVisible(true);
    }

    public static void baja() throws Exception {
        String nAcontecimiento = JOptionPane.showInputDialog("Introduce el nombre del evento que quieras borrar");
        ta.bajaAcontecimientos(nAcontecimiento);
    }

    public static void abrirVentanaDatos(){
        String nEvento = JOptionPane.showInputDialog("Introduce el nombre del evento para modificar");
        try {
            a = ta.obtenerDatosUnaFila(nEvento);
            va = new Acontecimientos();
            va.setVisible(true);
            va.llenarDatosEvento(a.getNombre(),a.getLugar(),a.getFecha(),a.getHoraInicio(),a.getHoraFinal(),a.getAforo());
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public static void modificar(String nombre, String lugar, String fecha, String horaI, String horaF, String aforo) throws Exception {
        
        a.setNombre(nombre);
        a.setLugar(lugar);
        a.setFecha(fecha);
        a.setHoraInicio(horaI);
        a.setHoraFinal(horaF);
        a.setAforo(Integer.parseInt(aforo));
        ta.actualizar(a);
    }

    public static void rellenarComboBox(JComboBox cbNombre){
        try{
            listaEventos = new ArrayList();
            ta.obtenerEventos(listaEventos);
            for (int i = 0; i < listaEventos.size(); i++) {
                cbNombre.insertItemAt(listaEventos.get(i).getNombre(), i);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    public static void abrirVentanaAsistir() {
        vap = new VistaAcontecimientoPersona();
        vap.setVisible(true);
    }

    public static void volverPaginaPrincipal() {
        vap.dispose();
        vpp = new PaginaPrincipal();
        vpp.setVisible(true);
    }

    public static void rellenarDatosAsistencia(String nombreEvento) {
        try {
            a = ta.obtenerDatosUnaFila(nombreEvento);
            vap.llenarDatosAcontecimientos(a.getFecha(),a.getHoraInicio());
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public static boolean comprobarPersona(String dni) {
        try {
            p = tp.obtenerPorDni(dni);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return p != null;
    }

    public static void altaPersona(String dni, String nombre, String ape1, String ape2, String telefono) {
        try{
            p = new Persona(dni, nombre, ape1, ape2, telefono);
            tp.altaPersona(p);  
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    public static void obtenerDatosPersona(String dni) {
        try {
            p = tp.obtenerPorDni(dni);
            vap.rellenarDatosPersona(p.getNombre(),p.getApellido1(),p.getApellido2(),p.getTelefono());
        } catch (Exception e) {
        }
    }

    public static void añadirAsistencia(String dni, String nombre) throws Exception{
        a.setListaPersonas(p);
        tap.alta(p.getDni(),a.getNombre());
    }

    public static void comprobarAforo() {
        
    }

    public static void abrirListado() {
        lp = new ListadoPersonas();
        lp.setVisible(true);
    }

    public static void obtenerPersonasAforo(String nAcontecimiento) throws Exception{
        ArrayList<String> listadoDni = tap.obtenerListado(nAcontecimiento);
        lp.sacarPorPantallaDni(listadoDni);
         
    }

    public static void salirListadoPersonas() {
        lp.dispose();
        vpp = new PaginaPrincipal();
        vpp.setVisible(true);
    }
    
}
