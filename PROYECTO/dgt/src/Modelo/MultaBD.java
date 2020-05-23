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
public class MultaBD {
    private Connection con;
    
    public MultaBD(Connection con){
        this.con = con;
    }

    public boolean comprobarId(int numAleatorio) throws Exception{
        String plantilla = "SELECT id FROM multa WHERE id = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, numAleatorio);
        ResultSet resultado = ps.executeQuery();
        
        if (resultado.next())
        {
           return true;
        }else
            return false;
        
           
    }

    public void añadirMulta(Multa m) throws Exception{
        String plantilla = "INSERT INTO multa VALUES (?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, m.getTipomulta());
        ps.setString(2, m.getLugar());
        ps.setInt(3, m.getId());
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1) {
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }

    public void baja(String id) throws Exception{
        String plantilla = "DELETE FROM multa WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, id);
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }

    public Multa buscarPorId(String id) throws Exception{
        String plantilla = "SELECT * FROM multa WHERE id = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, id);
        
        ResultSet resultado = ps.executeQuery();
        if (resultado.next())
        {
           Multa m = new Multa();
           m.setId(resultado.getInt("id"));
           m.setTipomulta(resultado.getString("tipomulta"));
           m.setLugar(resultado.getString("lugar"));
           return m;
       }
       else
        return null;
    }
    
}
