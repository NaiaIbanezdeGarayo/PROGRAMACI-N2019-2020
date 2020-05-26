/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;



import java.util.ArrayList;


/**
 *
 * @author Naia
 */
public class Multa {
    
    private String tipomulta;
    private int id;
    private ArrayList<Vehiculo> listaVehiculos;

    public Multa() {
        listaVehiculos = new ArrayList();
    }

    public Multa(String tipomulta, int id) {
        this.id = id;
        this.tipomulta = tipomulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipomulta() {
        return tipomulta;
    }

    public void setTipomulta(String tipomulta) {
        this.tipomulta = tipomulta;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(Vehiculo v) {
        this.listaVehiculos.add(v);
    }
    
    public void setAsistentes(ArrayList<Vehiculo> vehiculos)
    {
        this.listaVehiculos = vehiculos;
    }
        
}
