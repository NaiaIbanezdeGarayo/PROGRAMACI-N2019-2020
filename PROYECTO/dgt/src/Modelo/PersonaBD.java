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
public class PersonaBD {
    private Connection con;
    
    public PersonaBD(Connection con){
        this.con = con;
    }

    public void insertarPersona(Persona p) throws Exception{
        String plantilla = "INSERT INTO persona VALUES (?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setString(2, p.getApellido());
        ps.setString(3, p.getDni());
        ps.setString(4, p.getUsuario());
        ps.setString(5, p.getContrasena());
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1) {
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }

    public boolean comprobarPersona(String dni) throws Exception{
        String plantilla = "SELECT id FROM multa WHERE id = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni);
        ResultSet resultado = ps.executeQuery();
        
        if (resultado.next())
        {
           return true;
        }else
            return false;
    }

    public String comprobarUsuario(String usuario, String contrasena) throws Exception{
        String plantilla = "SELECT contrasena FROM persona WHERE usuario = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, usuario);
       
        ResultSet resultado = ps.executeQuery();
        String c  = "";
        if (resultado.next())
        {
            c = resultado.getString(1);
           return c;
        }else
            return c;
    }
    
}
