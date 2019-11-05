/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] meses = new String [12];
        meses [0] = "Enero";
        meses [1] = "Febrero";
        meses [2] = "Marzo";
        meses [3] = "Abril";
        meses [4] = "Mayo";
        meses [5] = "Junio";
        meses [6] = "Julio";
        meses [7] = "Agosto";
        meses [8] = "Septiembre";
        meses [9] = "Octubre";
        meses [10] = "Noviembre";
        meses [11] = "Diciembre";
        
        try{
            String mesPalabra = JOptionPane.showInputDialog("Introduce un mes en letra");
            comparar(meses, mesPalabra);
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Escribe algo");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private static void comparar(String[] meses, String mesPalabra) {
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equalsIgnoreCase(mesPalabra)) {
                mensajeBienEscrito();
            }
            
           
        
    }
    
}

    private static void mensajeBienEscrito() {
        JOptionPane.showMessageDialog(null, "El mes introducido esta bien escrito");
        
        System.exit(0);
    }

    
}
