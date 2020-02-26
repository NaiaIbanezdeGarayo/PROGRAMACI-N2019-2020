/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Modelo.Producto;
import Modelo.tipoProductos;
import Vista.compraVenta;
import Vista.vCompras;
import Vista.vVentas;
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
    private static Producto p;
    private static compraVenta cv;
    private static vVentas vv;
    private static vCompras vc;
    private static ArrayList<Producto> listaproductos;
    public static void main(String[] args) {
        // TODO code application logic here
        cv = new compraVenta();
        cv.setVisible(true);
        añadirProductos();
    }

    public static void abrirVentanaCompra() {
        cv.dispose();
        vc = new vCompras();
        vc.setVisible(true);
    }

    public static void abrirVentanaVentas() {
        cv.dispose();
        vv = new vVentas();
        vv.setVisible(true);
    }

    public static void salirVentanaVentas() {
        vv.dispose();
        cv.setVisible(true);
    }

    public static void salirVentanaCompras() {
        vc.dispose();
        cv.setVisible(true);
    }

    public static void venderProducto(String nombreProducto, int unidades, double importe) {
         for(Producto p: listaproductos) {
            int UnidadesTotales = Integer.parseInt(p.getnUnidades());
            int UnidadesRestantes = unidades;
            if(p.getNombre().equals(nombreProducto)){
                if(UnidadesRestantes < UnidadesTotales){
                    UnidadesTotales = UnidadesTotales - unidades;
                    p.setnUnidades(Integer.toS);
                    JOptionPane.showMessageDialog(null, "Producto vendido satisfactoriamente");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No quedan tantas unidades");
                }
            }
        }
    }
            
        
    

    public static void comprarProductos(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void añadirProductos() {
        listaproductos = new ArrayList();
        
        //CHORIZO
        Producto p1 = new Producto();
        p1.setNombre(tipoProductos.CHORIZO);
        p1.setnUnidades(5);
        p1.setPrecioUnitario(10);
        
        listaproductos.add(p1);
        
        //JAMON
        Producto p2 = new Producto();
        p2.setNombre(tipoProductos.JAMON);
        p2.setnUnidades(3);
        p2.setPrecioUnitario(50);
        
        listaproductos.add(p2);
        
        //QUESO
        Producto p3 = new Producto();
        p3.setNombre(tipoProductos.QUESO);
        p3.setnUnidades(10);
        p3.setPrecioUnitario(5.50);
        
        listaproductos.add(p3);
        
        //LECHE
        Producto p4 = new Producto();
        p4.setNombre(tipoProductos.LECHE);
        p4.setnUnidades(12);
        p4.setPrecioUnitario(2.60);
        
        listaproductos.add(p4);
        
        //GALLETAS
        Producto p5 = new Producto();
        p5.setNombre(tipoProductos.GALLETAS);
        p5.setnUnidades(15);
        p5.setPrecioUnitario(4);
        
        listaproductos.add(p5);
        
        //CEREALES
        Producto p6 = new Producto();
        p6.setNombre(tipoProductos.CEREALES);
        p6.setnUnidades(4);
        p6.setPrecioUnitario(3.50);
        
        listaproductos.add(p6);
        
        //FILETES
        Producto p7 = new Producto();
        p7.setNombre(tipoProductos.FILETES);
        p7.setnUnidades(30);
        p7.setPrecioUnitario(2);
        
        listaproductos.add(p7);
              
    }
    
}
