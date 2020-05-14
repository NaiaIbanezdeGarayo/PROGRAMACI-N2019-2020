/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

    public ArrayList obtenerListado(String nAcontecimiento) throws Exception{
        String plantilla = "SELECT dni FROM acontecimientopersona WHERE nombre = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, nAcontecimiento);
        
        ResultSet resultado = ps.executeQuery();
        ArrayList <String> listadoDni = new ArrayList<>();
        while (resultado.next())
        {
           listadoDni.add(resultado.getString("dni"));
        }
       
           return listadoDni;
    }

    

    
    
}
