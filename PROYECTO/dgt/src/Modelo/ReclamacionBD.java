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
public class ReclamacionBD {
    private Connection con;
    
    public ReclamacionBD(Connection con){
        this.con = con;
    }

    public void añadirDatos(String id, String matricula, String fecha) throws Exception{
        String plantilla = "INSERT INTO reclamacion VALUES (?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, id);
        ps.setDate(2, java.sql.Date.valueOf(fecha));
        ps.setString(3, matricula);
        
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1) {
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }

    public boolean comprobarReclamacion(String matricula, String idmulta) throws Exception{
        String plantilla = "SELECT * FROM reclamacion WHERE idmulta = ? AND matricula = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, Integer.parseInt(idmulta));
        ps.setString(2, matricula);
        
        ResultSet resultado = ps.executeQuery();
        if (resultado.next())
        {
           return true;
        }else
            return false;
    }

    public ArrayList<Reclamacion> obtenerDatos() throws Exception{
        ArrayList<Reclamacion> listaReclamaciones = new ArrayList();
        
        String plantilla = "SELECT * FROM reclamacion;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();
        
        while(resultado.next())
        {
                Reclamacion r = new Reclamacion();

                r.setIdmulta(resultado.getInt("idmulta"));
                r.setFecha(resultado.getDate("fecha").toLocalDate());
                r.setMatricula(resultado.getString("matricula"));
                
                listaReclamaciones.add(r);
        }
       return listaReclamaciones;
    }
    
}
