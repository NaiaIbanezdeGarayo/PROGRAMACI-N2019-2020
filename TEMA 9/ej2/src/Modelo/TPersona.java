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
public class TPersona {
    private Connection con;
    
    public TPersona(Connection con){
        this.con = con;
    }

    public Persona obtenerPorDni(String dni) throws Exception{
        String plantilla = "SELECT * FROM personas WHERE dni = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni);
        
        ResultSet resultado = ps.executeQuery();
        if (resultado.next())
        {
           Persona p = new Persona();
           
           p.setDni(resultado.getString("dni"));
           p.setNombre(resultado.getString("nombre"));
           p.setApellido1(resultado.getString("apellido1"));
           p.setApellido2(resultado.getString("apellido2"));
           p.setTelefono(resultado.getString("telefono"));
           
           return p;
       }
       else
           return null;
    }

    public void altaPersona(Persona p) throws Exception{
        String plantilla = "INSERT INTO personas VALUES (?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getDni());
        ps.setString(2, p.getNombre());
        ps.setString(3, p.getApellido1());
        ps.setString(4, p.getApellido2());
        ps.setString(5, p.getTelefono());
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1) {
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }
    
}
