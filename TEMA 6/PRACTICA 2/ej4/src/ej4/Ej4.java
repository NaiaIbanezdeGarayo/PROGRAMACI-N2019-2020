/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import Clases.Asiento;
import Clases.Avion;
import Clases.Ciudad;
import Clases.Pasajero;
import Clases.Piloto;
import Clases.Vuelo;

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
        crearObjetos();
        
        
    }
    
    private static void crearObjetos() {
        Vuelo v1 = new Vuelo(111,"12:00","17:30","Madrid","Belgica",null,null,"comercial");
        Vuelo v2 = new Vuelo(222,"7:36","12:20","Bilbao","Frankfurt",null,null,"comercial");
        Avion a1 = new Avion("Lufthansa","A1L1",320,null);
        Avion a2 = new Avion("Ryanair","A2R1",320,null);
        Piloto p1 = new Piloto("P1","Antonio","Gomez",1234);
        Piloto p2 = new Piloto("P2","Jose","Garcia",4321);
        Asiento as1 = new Asiento(25,true,null);
        Asiento as2 = new Asiento(84,false,null);
        Pasajero pas1 = new Pasajero(null,"Maria","Ape","Mujer",43);
        Pasajero pas2 = new Pasajero(null,"Andoni","Ape2","Hombre",18);
        Ciudad c1 = new Ciudad("1212","Madrid");
        Ciudad c2 = new Ciudad("1313","Belgica");
        Ciudad c3 = new Ciudad("1414","Bilbao");
        Ciudad c4 = new Ciudad("1515","Frankfurt");
        
        
    }
    
    
    
    
}
