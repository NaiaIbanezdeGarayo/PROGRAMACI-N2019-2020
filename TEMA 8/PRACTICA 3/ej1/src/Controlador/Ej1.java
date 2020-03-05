/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Producto;
import Modelo.Proveedor;
import Vista.Almacen;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author 1gdaw06
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static Almacen valmacen;
    public static ArrayList <Proveedor> listaProveedores;
    public static ArrayList <Producto> listaProductos;
    public static Producto nomProd;
    
    public static void main(String[] args) {
        // TODO code application logic here
        llenarDatos();
        valmacen = new Almacen();
        valmacen.setVisible(true);
        
        
    }
    
    private static void llenarDatos() {
        listaProductos = new ArrayList();
        listaProveedores = new ArrayList();
        
        //Proveedores
        Proveedor pr1 = new Proveedor();
        pr1.setNombre("Felix");
        listaProveedores.add(pr1);
        
        Proveedor pr2 = new Proveedor();
        pr2.setNombre("Amaia");
        listaProveedores.add(pr2);
        
        Proveedor pr3 = new Proveedor();
        pr3.setNombre("Maria");
        listaProveedores.add(pr3);
        
        Proveedor pr4 = new Proveedor();
        pr4.setNombre("Angél");
        listaProveedores.add(pr4);
        
        Proveedor pr5 = new Proveedor();
        pr5.setNombre("Mikel");
        listaProveedores.add(pr5);
        
        
        //Productos
        
        Producto p1 = new Producto();
        p1.setNombre("Manzana");
        p1.setnUnidades(100);
        p1.setPrecioUnitario(3.2);
        p1.setListaProveedores(listaProveedores.get(0));
        p1.setListaProveedores(listaProveedores.get(4));
        listaProductos.add(p1);
        
        Producto p2 = new Producto();
        p2.setNombre("Fresas");
        p2.setnUnidades(162);
        p2.setPrecioUnitario(5.5);
        p2.setListaProveedores(listaProveedores.get(2));
        p2.setListaProveedores(listaProveedores.get(3));
        listaProductos.add(p2);
        
        Producto p3 = new Producto();
        p3.setNombre("Limon");
        p3.setnUnidades(68);
        p3.setPrecioUnitario(2.4);
        p3.setListaProveedores(listaProveedores.get(1));
        p3.setListaProveedores(listaProveedores.get(2));
        listaProductos.add(p3);
        
        Producto p4 = new Producto();
        p4.setNombre("Melon");
        p4.setnUnidades(54);
        p4.setPrecioUnitario(6.7);
        p4.setListaProveedores(listaProveedores.get(0));
        p4.setListaProveedores(listaProveedores.get(3));
        listaProductos.add(p4);
        
        Producto p5 = new Producto();
        p5.setNombre("Sandia");
        p5.setnUnidades(74);
        p5.setPrecioUnitario(7.4);
        p5.setListaProveedores(listaProveedores.get(1));
        p5.setListaProveedores(listaProveedores.get(4));
        listaProductos.add(p5);
        
        Producto p6 = new Producto();
        p6.setNombre("Melocoton");
        p6.setnUnidades(142);
        p6.setPrecioUnitario(2.4);
        p6.setListaProveedores(listaProveedores.get(2));
        p6.setListaProveedores(listaProveedores.get(4));
        listaProductos.add(p6);
        
        Producto p7 = new Producto();
        p7.setNombre("Naranja");
        p7.setnUnidades(200);
        p7.setPrecioUnitario(3.1);
        p7.setListaProveedores(listaProveedores.get(1));
        p7.setListaProveedores(listaProveedores.get(3));
        listaProductos.add(p7);
        
        Producto p8 = new Producto();
        p8.setNombre("Pera");
        p8.setnUnidades(112);
        p8.setPrecioUnitario(2.4);
        p8.setListaProveedores(listaProveedores.get(0));
        p8.setListaProveedores(listaProveedores.get(1));
        listaProductos.add(p8);
        
        
        Producto p9 = new Producto();
        p9.setNombre("Piña");
        p9.setnUnidades(43);
        p9.setPrecioUnitario(5.9);
        p9.setListaProveedores(listaProveedores.get(0));
        p9.setListaProveedores(listaProveedores.get(2));
        listaProductos.add(p9);
        
        Producto p10 = new Producto();
        p10.setNombre("Platano");
        p10.setnUnidades(101);
        p10.setPrecioUnitario(1.7);
        p10.setListaProveedores(listaProveedores.get(3));
        p10.setListaProveedores(listaProveedores.get(4));
        listaProductos.add(p10);
        
    }
    public static JComboBox rellenarComboBox(String tfunidades, JComboBox cProveedores) {
        cProveedores.removeAllItems();
        for (int i = 0; i < listaProveedores.size() ; i++) {
            cProveedores.addItem(nomProd.getListaproveedores().get(i).getNombre());
        }return cProveedores;
    }

    public static boolean comprobarProducto(String tfnombreproducto) {
        
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getNombre().equalsIgnoreCase(tfnombreproducto)) {
                nomProd = listaProductos.get(i);
                return true;
            }
        }return false;
    }
    
    public static boolean comprobarUnidades( String tfunidades ) {
        int unidades = Integer.parseInt(tfunidades);
        
        if (unidades > nomProd.getnUnidades()) {
            return false;
        }
        else
            return true;
        
        
    }

    public static double importeCompra(String tfpreciocompra, String tfunidades) {
        double precioCompra = Double.parseDouble(tfpreciocompra);
        int unidades = Integer.parseInt(tfunidades);
        double media = precioCompra * unidades;
        return media;
    }

    
    
}
