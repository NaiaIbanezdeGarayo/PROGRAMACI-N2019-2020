/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Acontecimiento;
import Modelo.BaseDatos;
import Modelo.TAcontecimientos;
import Vista.Acontecimientos;
import Vista.PaginaPrincipal;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.JavaWsdlMappingType;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */

public class Ej2 {
    private static PaginaPrincipal vpp;
    private static Acontecimiento a;
    private static Acontecimientos va;
    private static BaseDatos bd;
    private static TAcontecimientos ta;
    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            bd = new BaseDatos();
            bd.conectar();
            ta = new TAcontecimientos(bd.getCon());
            vpp = new PaginaPrincipal();
            vpp.setVisible(true); 
        } catch (Exception e) {  
            bd.desconectar();
            System.out.println(e.getMessage());
        }

    }

    public static void ventanaAcontecimientos() {
        vpp.setVisible(false);
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

    public static void abrirVentanaDatos() throws SQLException {
        String nEvento = JOptionPane.showInputDialog("Introduce el nombre del evento para modificar");
        a = ta.obtenerDatosUnaFila(nEvento);
        va = new Acontecimientos();
        va.setVisible(true);
        va.llenarDatosEvento(a.getNombre(),a.getLugar(),a.getFecha(),a.getHoraInicio(),a.getHoraFinal(),a.getAforo());
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
    
}
