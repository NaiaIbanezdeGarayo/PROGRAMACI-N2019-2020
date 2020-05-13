/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.*;
import java.util.ArrayList;

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

    public void bajaAcontecimientos(String nAcontecimiento) throws  Exception {
        String plantilla = "DELETE FROM acontecimientos WHERE nombre=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, nAcontecimiento);
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
    }

    

    public Acontecimiento obtenerDatosUnaFila(String nEvento) throws Exception {
        String plantilla = "SELECT * FROM acontecimientos WHERE nombre = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, nEvento);
        
        ResultSet resultado = ps.executeQuery();
        if (resultado.next())
        {
           Acontecimiento a = new Acontecimiento();
           a.setNombre(resultado.getString("nombre"));
           a.setLugar(resultado.getString("lugar"));
           a.setFecha(resultado.getString("fecha"));
           a.setHoraInicio(resultado.getString("horaInicio"));
           a.setHoraFinal(resultado.getString("horaFinal"));
           a.setAforo(Integer.parseInt(resultado.getString("aforo")));
           return a;
       }
       else
           return null;
    }

    public void actualizar(Acontecimiento a) throws  Exception {
        String plantilla = "UPDATE acontecimientos SET  lugar=?, fecha =?, horaInicio =?, horaFinal =?, aforo =?  WHERE nombre =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1, a.getLugar());
        ps.setString(2, a.getFecha());
        ps.setString(3, a.getHoraInicio());
        ps.setString(4, a.getHoraFinal());
        ps.setInt(5, a.getAforo());
        ps.setString(6, a.getNombre());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }

    public ArrayList<Acontecimiento> obtenerEventos(ArrayList<Acontecimiento> listaEventos) throws Exception {
        String plantilla = "SELECT * FROM acontecimientos;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Acontecimiento a = new Acontecimiento();

                a.setNombre(resultado.getString("nombre"));
                a.setLugar(resultado.getString("lugar"));
                a.setFecha(resultado.getString("fecha"));
                a.setHoraInicio(resultado.getString("horaInicio"));
                a.setHoraFinal(resultado.getString("horaFinal"));
                a.setAforo(Integer.parseInt(resultado.getString("aforo")));


                listaEventos.add(a);
       }
       return listaEventos;
    }

    
}
