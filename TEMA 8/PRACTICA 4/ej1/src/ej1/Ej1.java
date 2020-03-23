/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import Modelo.Cliente;
import Modelo.Cuenta;
import Modelo.Movimiento;
import Vistas.login;
import Vistas.vInicio;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Naia
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static vInicio vi;
    public static login l;
    public static Cliente cl;
    public static Cuenta c;
    public static Movimiento m;
    public static ArrayList <Cliente> listaClientes;
    
    public static void main(String[] args) {
        // TODO code application logic here
        generarDatos();
        vi = new vInicio();
        vi.setVisible(true);
        
    }

    private static void generarDatos() {
        listaClientes = new ArrayList();
        
        cl = new Cliente("11111111A","Maria Lopez","012345");
        
        ArrayList <Cuenta> listaCuentas = new ArrayList();
        
        //PRIMERA CUENTA DE MARIA
        Cuenta c = new Cuenta("11111111");
        
        Movimiento m = new Movimiento(LocalDate.now(),"Ingreso",500f);
        c.setMovimiento(m);
        m = new Movimiento(LocalDate.now(), "Reintegro cajero", -50f);
        c.setMovimiento(m);
        m = new Movimiento(LocalDate.now(), "Pago recibo", -15f);
        c.setMovimiento(m);
        listaCuentas.add(c);
        
        
        //SEGUNDA CUENTA DE MARIA
        c = new Cuenta("22222222");
        
        m = new Movimiento(LocalDate.now(), "Ingreso", 780f);
        c.setMovimiento(m);
        m = new Movimiento(LocalDate.now(), "Pago recibo luz", -200f);
        c.setMovimiento(m);
        m = new Movimiento(LocalDate.now(), "Ingreso cajero", 1000f);
        c.setMovimiento(m);
        
        listaCuentas.add(c);
        
        cl.setListaCuentas(listaCuentas);
        listaClientes.add(cl);
        
        
        
        
        
        
    }

    public static void abrirLogin() {
        vi.dispose();
        l = new login();
        l.setVisible(true);
    }
    
}
