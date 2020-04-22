/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Naia
 */
public class TAcontecimientos {
    private Connection con;
    
    public TAcontecimientos(Connection con){
        this.con = con;
    }
    public void añadirAcontecimientos(Acontecimiento a)throws Exception{
        String plantilla = "INSERT INTO acontecimientos VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, a.getNombre());
        ps.setString(2, a.getLugar());
        ps.setString(3, a.getFecha());
        ps.setString(4, a.getHoraInicio());
        ps.setString(5, a.getHoraFinal());
        ps.setInt(6, a.getAforo());
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1) {
            throw new Exception("El número de filas actualizadas no es uno");
        }
        
    }
}
