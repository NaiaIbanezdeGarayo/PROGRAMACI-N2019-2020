/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Naia
 */
public class TAcontecimientosPersona {

    private Connection con;
    
    public TAcontecimientosPersona(Connection con){
        this.con = con;
    }
    public void alta(String dni, String nombre) throws Exception{
        String plantilla = "INSERT INTO acontecimientopersona VALUES (?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni);
        ps.setString(2, nombre);
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1) {
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }

    public Acontecimiento obtenerListado(String nAcontecimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
}
