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
        vpp.dispose();
        va = new Acontecimientos();
        va.setVisible(true);
    }

    public static void añadirAcontecimientos(String nombre, String lugar, String fecha, String horainicio, String horafinal, int aforo) throws Exception {
        a = new Acontecimiento(nombre,lugar,fecha,horainicio,horafinal,aforo);
        ta.añadirAcontecimientos(a);
    }

    public static void cerrarAcontecimientos() {
        va.dispose();
        vpp = new PaginaPrincipal();
        vpp.setVisible(true);
    }
    
}
