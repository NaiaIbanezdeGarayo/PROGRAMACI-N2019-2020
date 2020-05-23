/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Naia
 */
public class VehiculoMultaBD {
    private Connection con;
    
    public VehiculoMultaBD(Connection con){
        this.con = con;
    }

    public void añadirMultaVehiculo(String matricula, String id, LocalDate fecha) throws Exception{
        String plantilla = "INSERT INTO vehiculomulta VALUES (?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, id);
        ps.setString(2, matricula);
        ps.setDate(3, java.sql.Date.valueOf(fecha));
        
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1) {
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }

    public ArrayList<VehiculoMulta> buscarListaMultas(String matricula) throws Exception{
        ArrayList <VehiculoMulta> listaVehiculoMulta = new ArrayList<>();
        
        String plantilla = "SELECT * FROM vehiculomulta WHERE matricula = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, matricula);
        
        ResultSet resultado = ps.executeQuery();
        
        while (resultado.next()) {  
            
                VehiculoMulta vm = new VehiculoMulta();
                vm.setId_multa(resultado.getInt("id_multa"));
                vm.setMatricula(resultado.getString("matricula"));
                vm.setFecha(resultado.getDate("fecha").toLocalDate());
                
                listaVehiculoMulta.add(vm);
        }
       
        return listaVehiculoMulta;
    }

    public VehiculoMulta buscarPorId(String id) throws Exception{
        String plantilla = "SELECT * FROM vehiculomulta WHERE id_multa = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, id);
        
        ResultSet resultado = ps.executeQuery();
        if (resultado.next())
        {
           VehiculoMulta vm = new VehiculoMulta();
           vm.setId_multa(resultado.getInt("id_multa"));
           vm.setMatricula(resultado.getString("matricula"));
           vm.setFecha(resultado.getDate("fecha").toLocalDate());
           return vm;
       }
       else
            return null;
    }

    
    
}
