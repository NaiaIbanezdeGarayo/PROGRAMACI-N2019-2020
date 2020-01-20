/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej21;

import Clases.Alumno;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static Alumno a ;
    public static void main(String[] args) {
        // TODO code application logic here
        
        a = new Alumno();
        //codigo
        validarCodigo();
        //nombre
        validarNombre();
        //domicilio
        validarDomicilio();
        //telefono
        validarTelefono();
        //edad
        validarEdad();
        //sexo
        validarSexo();
        //fNac
        validarFecha();
        //emailPersonal
        validarEmailP();
        //emailCentro
        validarEmailC();
        //paginaWeb
        validarPw();
        //curso
        validarCurso();
        //estado civil
        validarEstado();
    }

    private static void validarCodigo() {
        String cod = JOptionPane.showInputDialog("Introduce el codigo de alumno");
        Pattern pat = Pattern.compile("^[0-9]{5}$");
        Matcher mat = pat.matcher(cod);
        
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "Dato válido");
            a.setCodigo(cod);
        }else
        {
            JOptionPane.showMessageDialog(null, "Dato inválido");
            validarCodigo();
        }
        
    }

    private static void validarNombre() {
        String nom = JOptionPane.showInputDialog("Introduce el nombre del alumno");
        Pattern pat = Pattern.compile("^(([A-z]{2,})\\s)+$");
        Matcher mat = pat.matcher(nom);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null,"Dato válido");
            a.setNombre(nom);
        }else{
            JOptionPane.showMessageDialog(null, "Dato inválido");
            validarNombre();
        }
    }

    private static void validarDomicilio() {
        String dom = JOptionPane.showInputDialog("Introduce el domicilio del alumno");
        Pattern pat = Pattern.compile("^[A-Z][A-Za-z0-9-º]+$");
        Matcher mat = pat.matcher(dom);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null,"Dato válido");
            a.setDomicilio(dom);
        }else{
            JOptionPane.showMessageDialog(null, "Dato inválido");
            validarDomicilio();
        }
    }

    private static void validarTelefono() {
        String tel = JOptionPane.showInputDialog("Introduce el teléfono del alumno");
        Pattern pat = Pattern.compile("^6|7[0-9]{8}$");
        Matcher mat = pat.matcher(tel);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null,"Dato válido");
            a.setTelefono(tel);
        }else{
            JOptionPane.showMessageDialog(null, "Dato inválido");
            validarTelefono();
        }
    }

    private static void validarEdad() {
        String edad = JOptionPane.showInputDialog("Introduce la edad");
        Pattern pat = Pattern.compile("^[0-9]{1,2}$");
        Matcher mat = pat.matcher(edad);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null,"Dato válido");
            a.setEdad(edad);
        }else{
            JOptionPane.showMessageDialog(null, "Dato inválido");
            validarEdad();
        }
        
    }

    private static void validarSexo() {
        String sexo = JOptionPane.showInputDialog("Introduce el sexo");
        Pattern pat = Pattern.compile("^[MHO]$");
        Matcher mat = pat.matcher(sexo);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null,"Dato válido");
            a.setSexo(sexo);
        }else{
            JOptionPane.showMessageDialog(null, "Dato inválido");
            validarSexo();
        }
    }

    private static void validarFecha() {
        String fecha = JOptionPane.showInputDialog("Introduce una fecha con el formato dd/mm/aaaa");
        Pattern pat = Pattern.compile("^[0-9]|[1-2][0-9]|3[01]/[0-9]|1[0-2]/1[0-9][0-9][0-9]|200[0-9]|201[0-9]|2020");
        Matcher mat = pat.matcher(fecha);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "fecha válida");
            a.setfNacimiento(fecha);
        }else{
            JOptionPane.showMessageDialog(null, "fecha no válida");
            validarFecha();
        }
    }

    private static void validarEmailP() {
        String email = JOptionPane.showInputDialog("Introduce un email");
        Pattern pat = Pattern.compile("^[A-Za-z0-9.-_]+@[A-Za-z.-_]+.[a-z]+");
        Matcher mat = pat.matcher(email);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, mat);
            a.setEmailPersonal(email);
        }else{
            JOptionPane.showMessageDialog(null, "fecha no válida");
            validarEmailP();
        } 
    }

    private static void validarEmailC() {
        String email = JOptionPane.showInputDialog("Introduce un email");
        Pattern pat = Pattern.compile("^[A-Za-z0-9.-_]+@ikasle.egibide.org");
        Matcher mat = pat.matcher(email);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, mat);
            a.setEmailPersonal(email);
        }else{
            JOptionPane.showMessageDialog(null, "fecha no válida");
            validarEmailC();
        } 
    }

    private static void validarPw() {
        String pw = JOptionPane.showInputDialog("Introduce una pagina web");
        Pattern pat = Pattern.compile("^(www.[a-z]+.[a-z])|\\s");
        Matcher mat = pat.matcher(pw);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, mat);
            a.setPaginaWeb(pw);
        }else{
            JOptionPane.showMessageDialog(null, "fecha no válida");
            validarPw();
        } 
    }

    private static void validarCurso() {
        String email = JOptionPane.showInputDialog("Introduce un email");
        Pattern pat = Pattern.compile("^11[1-4][A-L][ABD]|12[1-2][A-L][ABD]|13[1-2][A-Z]{3}[ABD]|14[1-2][A-Z]{3}[ABD]");
        Matcher mat = pat.matcher(email);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, mat);
            a.setEmailPersonal(email);
        }else{
            JOptionPane.showMessageDialog(null, "fecha no válida");
            validarEmailP();
        } 
    }

    private static void validarEstado() {
        String estado = JOptionPane.showInputDialog("Introduce el estado civil");
        Pattern pat = Pattern.compile("^[casado|casada|soltero|soltera]$");
        Matcher mat = pat.matcher(estado);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, mat);
            a.setEstadoCivil(estado);
        }else{
            JOptionPane.showMessageDialog(null, "fecha no válida");
            validarEstado();
        } 
    }

}
