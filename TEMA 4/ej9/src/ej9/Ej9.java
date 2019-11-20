/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] cProductos = new int [10];
        cProductos[0]= 10;
        cProductos[1]= 23;
        cProductos[2]= 30;
        cProductos[3]= 47;
        cProductos[4]= 55;
        cProductos[5]= 65;
        cProductos[6]= 135;
        cProductos[7]= 256;
        cProductos[8]= 526;
        cProductos[9]= 663;
        int [] cantProductos = new int [10];
        int continuar;
        do{
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del producto" + "\n" +
                                                                        "{10, 23, 30, 47, 55, 65, 135, 256, 526, 663}" ));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad que quieres del producto"));
            for (int i = 0; i < cProductos.length; i++) {
                if (codigo == cProductos[i]) {
                    cantProductos[i]+= cantidad;
                } else {
                }
            }
            continuar = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
        }while (continuar == 0);
        String texto = "";
        
    }
    
}
