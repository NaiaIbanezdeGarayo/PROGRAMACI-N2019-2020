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
public class VehiculoBD {
    private Connection con;
    
    public VehiculoBD(Connection con){
        this.con = con;
    }

    public void añadirVehiculo(Vehiculo v) throws Exception{
        String plantilla = "INSERT INTO vehiculo VALUES (?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, v.getMatricula());
        ps.setString(2, v.getColor());
        ps.setString(3, v.getModelo());
        
        
        ps.execute();
        ps.close();
        
    }

    public void baja(String matricula) throws Exception{
        String plantilla = "DELETE FROM vehiculo WHERE matricula=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, matricula);
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }

    public Vehiculo buscarVehiculo(String matricula) throws Exception{
        String plantilla = "SELECT * FROM vehiculo WHERE matricula = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, matricula);
        
        ResultSet resultado = ps.executeQuery();
        if (resultado.next())
        {
           Vehiculo v = new Vehiculo();
           v.setMatricula(resultado.getString("matricula"));
           v.setColor(resultado.getString("color"));
           v.setModelo(resultado.getString("modelo"));
           return v;
       }
       else
           return null;
    }
    
    
}
