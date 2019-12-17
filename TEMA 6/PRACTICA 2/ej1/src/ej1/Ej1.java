/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import Clases.Estudio;
import Clases.Pelicula;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula();
        Estudio e1 = new Estudio();
        Estudio e2 = new Estudio();
        ArrayList <Estudio> estudio = new ArrayList();
        
        e1.setNombre("estudio1");
        e2.setNombre("estudio2");
       
        p1.setTitulo("pelicula1");
        p1.setAño("2014");
        p1.setDuracion(120);
        p1.setTipo("Acción");
       
        p1.setEstudio(estudio);
        p1.getEstudio().add(e1);
        System.out.println(p1.getEstudio().get(0));
        p1.getEstudio().add(e2);
        
        p2.setTitulo("pelicula2");
        p2.setAño("2019");
        p2.setDuracion(114);
        p2.setTipo("Drama");
        
        
        
    }
    
}
