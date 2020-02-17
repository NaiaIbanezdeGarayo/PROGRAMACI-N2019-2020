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
    public static void main(String[] args) {
        // TODO code application logic here
        cv = new compraVenta();
        cv.setVisible(true);
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
        p = new Producto();
        if (nombreProducto.equalsIgnoreCase("jamon")) {
          p.setNombre(tipoProductos.JAMON);  
        }else if (nombreProducto.equalsIgnoreCase("chorizo")) {
            p.setNombre(tipoProductos.CHORIZO);
        }
        else if (nombreProducto.equalsIgnoreCase("queso")) {
            p.setNombre(tipoProductos.QUESO);
        }
        else if (nombreProducto.equalsIgnoreCase("leche")) {
            p.setNombre(tipoProductos.LECHE);         
        }
        else if (nombreProducto.equalsIgnoreCase("galletas")) {
            p.setNombre(tipoProductos.GALLETAS);    
        }
        else if (nombreProducto.equalsIgnoreCase("cereales")) {
            p.setNombre(tipoProductos.CEREALES);    
        }
        else if (nombreProducto.equalsIgnoreCase("filetes")) {
            p.setNombre(tipoProductos.FILETES);    
        }
        
        p.getnUnidades();
    }
            
        
    

    public static void comprarProductos(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
