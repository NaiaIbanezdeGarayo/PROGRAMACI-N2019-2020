/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gdaw06
 */
public class Cliente extends Persona{
   private String telefonoDeContacto;

    public Cliente(String telefonoDeContacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefonoDeContacto = telefonoDeContacto;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }
   
}
