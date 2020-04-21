/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.PipedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Naia
 */
public class TPersonas {
    private Connection con;
    
    public TPersonas(Connection con){
        this.con = con;
    }
    public void insertar(Persona p)throws Exception{
        String plantilla = "INSERT INTO tpersonas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setInt(2, p.getEdad());
        ps.setString(3, p.getProfesion());
        ps.setString(4, p.getTelefono());
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1) {
            throw new Exception("El número de filas actualizadas no es uno");
        }
        
    }
    public Persona seleccionarUnaPersona(String nombre)throws Exception{
        String plantilla = "SELECT * FROM tpersonas WHERE nombre = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, nombre);
        
        ResultSet resultado = ps.executeQuery();
        if (resultado.next())
        {
           Persona p = new Persona();
           p.setNombre(resultado.getString("nombre"));
           p.setEdad(Integer.parseInt(resultado.getString("edad")));
           p.setProfesion(resultado.getString("profesion"));
           p.setTelefono(resultado.getString("telefono"));
           return p;
       }
       else
           return null;
    }

    public Persona seleccionarPersonas() throws SQLException {
      String plantilla = "select * from tpersonas;";
      PreparedStatement ps = con.prepareStatement(plantilla);
       
      ResultSet resultado = ps.executeQuery();
       while(resultado.next())
       {
                Persona p = new Persona();
                
                p.setNombre(resultado.getString("nombre"));
                p.setEdad(Integer.parseInt(resultado.getString("edad")));
                p.setProfesion(resultado.getString("profesion"));
                p.setTelefono(resultado.getString("telefono"));
       }
       return p;
    }
    
}
