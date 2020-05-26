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

    public void añadirMultaVehiculo(String id, String idmulta,String lugar,String matricula,LocalDate fecha) throws Exception{
        String plantilla = "INSERT INTO vehiculomulta VALUES (?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, id);
        ps.setString(2, idmulta);
        ps.setString(3, matricula);
        ps.setDate(4, java.sql.Date.valueOf(fecha));
        ps.setString(5, lugar);
        
        
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
                vm.setId(resultado.getInt("id"));
                vm.setId_multa(resultado.getInt("idmulta"));
                vm.setMatricula(resultado.getString("matricula"));
                vm.setFecha(resultado.getDate("fecha").toLocalDate());
                vm.setLugar(resultado.getString("lugar"));
                
                listaVehiculoMulta.add(vm);
        }
       
        return listaVehiculoMulta;
    }

    public VehiculoMulta buscarPorId(String id) throws Exception{
        String plantilla = "SELECT * FROM vehiculomulta WHERE idmulta = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, id);
        
        ResultSet resultado = ps.executeQuery();
        if (resultado.next())
        {
           VehiculoMulta vm = new VehiculoMulta();
           vm.setId(resultado.getInt("id"));
           vm.setId_multa(resultado.getInt("idmulta"));
           vm.setMatricula(resultado.getString("matricula"));
           vm.setFecha(resultado.getDate("fecha").toLocalDate());
           vm.setLugar(resultado.getString("lugar"));
           return vm;
       }
       else
            return null;
    }

    public void baja(String id) throws Exception{
        String plantilla = "DELETE FROM vehiculomulta WHERE idmulta=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, id);
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }

    public ArrayList<Multa> obtenerMaximoPorId() throws Exception{
        ArrayList <Multa> listaMultaId = new ArrayList<>();
        
        String plantilla = "SELECT idmulta , count(*) FROM vehiculomulta GROUP BY idmulta HAVING COUNT(*) = (SELECT MAX(contador) FROM ( SELECT id, COUNT(*) contador FROM vehiculomulta GROUP BY idmulta) a);";   					
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ResultSet resultado = ps.executeQuery();
        
        while (resultado.next()) {  
            
                Multa m = new Multa();
                m.setId(resultado.getInt("idmulta"));
                
                listaMultaId.add(m);
        }
       
        return listaMultaId;
    }

    public ArrayList<Vehiculo> obtenerMaximoMultasMatricula() throws Exception{
        ArrayList <Vehiculo> listaMatriculas = new ArrayList<>();
        
        String plantilla = "SELECT matricula , count(*) FROM vehiculomulta GROUP BY matricula HAVING COUNT(*) = ( SELECT MAX(contador) FROM ( SELECT id, COUNT(*) contador FROM vehiculomulta GROUP BY matricula ) a);";   					
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ResultSet resultado = ps.executeQuery();
        
        while (resultado.next()) {  
            
                Vehiculo v = new Vehiculo();
                v.setMatricula(resultado.getString("matricula"));
                
                listaMatriculas.add(v);
        }
       
        return listaMatriculas;
    }

    
   
}
