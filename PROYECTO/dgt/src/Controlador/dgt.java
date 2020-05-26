/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Multa;
import Modelo.MultaBD;
import Modelo.Persona;
import Modelo.PersonaBD;
import Modelo.Reclamacion;
import Modelo.ReclamacionBD;
import Modelo.Vehiculo;
import Modelo.VehiculoBD;
import Modelo.VehiculoMulta;
import Modelo.VehiculoMultaBD;
import Vista.AltaMultas;
import Vista.AñadirTipoMultas;
import Vista.InterfazAdmin;
import Vista.InterfazCliente;
import Vista.ListadoMulta;
import Vista.MultasImpuestas;
import Vista.PaginaInicio;
import Vista.PaginaInicioSesion;
import Vista.PaginaRegistro;
import Vista.QuitarMulta;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class dgt {
    /*Vistas*/
    private static PaginaInicio pi;
    private static PaginaInicioSesion pis;
    private static PaginaRegistro pg;
    private static AltaMultas am;
    private static InterfazAdmin ia;
    private static InterfazCliente ic;
    private static ListadoMulta lm;
    private static QuitarMulta qm;
    private static AñadirTipoMultas atm;
    private static MultasImpuestas mi;
    
    /*Base de datos*/
    private static BaseDatos bd;
    private static MultaBD mbd;
    private static PersonaBD pbd;
    private static VehiculoBD vbd;
    private static VehiculoMultaBD vmbd;
    private static ReclamacionBD rbd;
    
    /*Clases*/
    private static Persona p;
    private static Multa m;
    private static Vehiculo v;
    private static VehiculoMulta vm;
    private static Reclamacion r;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            bd = new BaseDatos();
            bd.conectar();
            mbd = new MultaBD(bd.getCon());
            pbd = new PersonaBD(bd.getCon());
            vbd = new VehiculoBD(bd.getCon());
            vmbd = new VehiculoMultaBD(bd.getCon());
            rbd = new ReclamacionBD(bd.getCon());
            abrirVentanaInicio();
        } catch (Exception e) {
            bd.desconectar();
            System.out.println(e.getMessage());
        }
    }

    public static void salirAPaginaInicio() {
        pis.dispose();
        abrirVentanaInicio();
    }

    public static void abrirPaginaRegistro() {
        cerrarVentanaInicio();
        pg = new PaginaRegistro();
        pg.setLocationRelativeTo(null);
        pg.setVisible(true);
    }

    public static void abrirPaginaInicioSesion() {
        cerrarVentanaInicio();
        pis = new PaginaInicioSesion();
        pis.setLocationRelativeTo(null);
        pis.setVisible(true);
    }

    private static void abrirVentanaInicio() {
        pi = new PaginaInicio();
        pi.setLocationRelativeTo(null);
        pi.setVisible(true);
    }

    private static void cerrarVentanaInicio() {
        pi.dispose();
    }

    public static void salirAPaginaInicioR() {
        pg.dispose();
        abrirVentanaInicio();
    }

    public static void abrirVentanaMultas() {
        ia.dispose();
        am = new AltaMultas();
        am.setLocationRelativeTo(null);
        am.setVisible(true);
    }

    public static void salirAltaMultas() {
        am.dispose();
        abrirMenu();
    }

    public static void abrirInterfazAdmin() {
        pis.dispose();
        abrirMenu();
    }

    public static boolean generarIdAutomatico(int numAleatorio) throws Exception{
        
        if (mbd.comprobarId(numAleatorio)== true) {
            atm.generarId();
            return true;
        }else
            return false;
        
    }

    public static void añadirDatos(String id,String idtipomulta,String lugar,String matricula) throws Exception{

        vmbd.añadirMultaVehiculo(id,idtipomulta,lugar,matricula,LocalDate.now());
    }

    public static void registrarCliente(String nombre, String apellido, String dni, String usuario, String contrasena) throws Exception{
        pbd.comprobarPersona(dni);
        p = new Persona(nombre, apellido, dni, usuario, contrasena);
        pbd.insertarPersona(p);
    }

    public static void comprobarUsuario(String usuario, String contrasena) throws Exception{
        
        String pass = pbd.comprobarUsuario(usuario,contrasena);
        
        if (pass.equalsIgnoreCase(contrasena) ) {
            if (pass.equalsIgnoreCase("admin")) {
                pis.abrirSiguienteVentanaAdmin();
            }else
                pis.abrirSiguienteVentanaCliente();
        }else
            JOptionPane.showMessageDialog(null, "El usuario introducido no existe o esta mal escrito.");
            
    }

    public static void abrirInterfazCliente() {
        pis.dispose();
        ic = new InterfazCliente();
        ic.setLocationRelativeTo(null);
        ic.setVisible(true);
    }

    public static void salirAPaginaInicioC() {
        ic.dispose();
        abrirVentanaInicio();
    }


    public static void salirAPaginaIncioIA() {
        ia.dispose();
        abrirVentanaInicio();
    }

    public static void añadirVehiculo(String matricula, String color, String modelo) throws Exception{
        v = new Vehiculo(matricula, color, modelo);
        vbd.añadirVehiculo(v);
    }

    private static void abrirMenu() {
        ia = new InterfazAdmin();
        ia.setLocationRelativeTo(null);
        ia.setVisible(true);
    }

    public static void bajavehiculo(String matricula) throws Exception{
        vbd.baja(matricula);
    }

    public static void bajaMulta(String id) throws Exception{
        rbd.baja(id);
        vmbd.baja(id);
        mbd.baja(id);
    }

    public static void buscarVehiculo(String matricula) throws Exception{
        v = vbd.buscarVehiculo(matricula);
        if ( v == null ) {
            am.vehiculoNoEncontrado();
        }else
            am.vehiculoEncontrado(v);
    }

    public static void abrirListaMulta() {
        ic.dispose();
        lm = new ListadoMulta();
        lm.setLocationRelativeTo(null);
        lm.setVisible(true);
    }

    public static void buscarVehiculoMulta(String matricula, JComboBox cbid) throws Exception{
        cbid.addItem("-- Elige un id --");
        ArrayList<VehiculoMulta> listaVehiculoMulta = vmbd.buscarListaMultas(matricula);
        
        for (int i = 0; i < listaVehiculoMulta.size(); i++) {
            cbid.insertItemAt(listaVehiculoMulta.get(i).getId_multa(), i);
        }
    }

    public static void obtenerDatosId(String id) throws Exception{
        m = mbd.buscarPorId(id);
        vm = vmbd.buscarPorId(id);
        lm.añadirDatos(m.getTipomulta(),vm.getFecha());
    }

    public static void añadirReclamacion(String id, String matricula, String fecha) throws Exception{
        rbd.añadirDatos(id,matricula,fecha);
    }

    public static boolean comprobarReclamaciones(String matricula, String id) throws Exception{
        if (rbd.comprobarReclamacion(matricula,id) == true) {
            return true;
        }else
            return false;

    }

    public static void salirPaginaInicioC() {
        lm.dispose();
        abrirInterfazCliente();
    }

    public static void obtenerDatosReclamacion(JComboBox cbReclamaciones) throws Exception{
        cbReclamaciones.addItem("-- Elige un id --");
        ArrayList<Reclamacion> listaReclamaciones = rbd.obtenerDatos();
        for (int i = 0; i < listaReclamaciones.size(); i++) {
            cbReclamaciones.insertItemAt(listaReclamaciones.get(i).getIdmulta(), i);
        }
        
    }

    public static void abrirBajaMulta() {
        ia.dispose();
        qm = new QuitarMulta();
        qm.setLocationRelativeTo(null);
        qm.setVisible(true);
    }

    public static void rellenarDatosBaja(String id) throws Exception{
        m = mbd.buscarPorId(id);
        vm = vmbd.buscarPorId(id);
        qm.rellenarDatos(m.getTipomulta(),vm.getMatricula());
    }

    public static void salirPaginaInicioR() {
        qm.dispose();
        ia = new InterfazAdmin();
        ia.setVisible(true);
    }

    public static void abrirVentanaTipoMultas() {
        ia.dispose();
        atm = new AñadirTipoMultas();
        atm.setLocationRelativeTo(null);
        atm.setVisible(true);
    }

    public static void salirAPaginaInicioTM() {
        atm.dispose();
        abrirInterfazAdmin();
    }

    public static void añadirMulta(String tipomulta, String id) throws Exception{
        m = new Multa(tipomulta,Integer.parseInt(id));
        mbd.añadirMulta(m);
    }

    public static void obtenerIdMulta(String tipomulta) throws Exception{
        m = mbd.buscarMulta(tipomulta);
        am.añadirDatosId(String.valueOf(m.getId()));
    }

    public static void rellenarCombo(JComboBox cbTipoMulta) throws Exception{
        try{
            ArrayList<Multa> listaMulta = new ArrayList();
            listaMulta = mbd.buscarTipoMulta();

            for (int i = 0; i < listaMulta.size(); i++) {
                cbTipoMulta.insertItemAt(listaMulta.get(i).getTipomulta(), i);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());}
    }

    public static void abrirVentanaEstadisticaMultasImpuestas() {
        ia.dispose();
        mi = new MultasImpuestas();
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
    }

    public static String rellenarDatosEstadistaMultasImpuestas() throws Exception{
        ArrayList<Multa> listaMultaId = new ArrayList();
        listaMultaId = vmbd.obtenerMaximoPorId();
        String text ="";
        listaMultaId = mbd.obtenerNombrePorId(listaMultaId);
        for (int i = 0; i < listaMultaId.size(); i++) {
            text += listaMultaId.get(i).getTipomulta() +"\n";
        }
        return text; 
    }

    public static String rellenarDatosEstadisticasVehiculo() throws Exception{
        ArrayList<Vehiculo> listaMatriculas = new ArrayList();
        listaMatriculas = vmbd.obtenerMaximoMultasMatricula();
        String text ="";
        for (int i = 0; i < listaMatriculas.size(); i++) {
            text += listaMatriculas.get(i).getMatricula() +"\n";
        }
        return text;
    }

    public static void cerrarVentanaEstadisticas() {
        mi.dispose();
        abrirInterfazAdmin();
    }

}
