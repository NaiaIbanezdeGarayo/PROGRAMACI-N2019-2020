/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej22;

import Clases.Artista;
import Clases.Disco;
import Clases.Libro;
import Clases.Obra;
import Clases.Pelicula;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Ej22 {
   
    /**
     */
    public static ArrayList <Artista> artistas;
    public static ArrayList <Obra> obras;
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        do {
            artistas = new ArrayList<Artista>();
            obras = new ArrayList<Obra>();
            do {
               //Artistas
                Artista a = new Artista();
                validarArtistaNombre(a);
                comprovacionRepetido(a); 
                artistas.add(a);
                validarArtistaFechaNacimiento(a);  
               
                a.setObras(obras);
               
            } while (JOptionPane.showConfirmDialog(null, "¿Quieres seguir introduciendo aristas?")== 0);
            //Obras
            do {
                String tipo = JOptionPane.showInputDialog("¿Que tipo de obra quieres introducir?");
            //Libro
            if (tipo.equalsIgnoreCase("libro")) {
                Libro l = new Libro();
                validarNombreLibro(l);
                validarAnoEdicionLibro(l);
                validarEditorialLibro(l);
                validarNumeroPaginas(l);
                l.setArtistas(artistas);
                obras.add(l);
            }
            else if (tipo.equalsIgnoreCase("disco")) { //Disco
                Disco d = new Disco();
                validarNombreDisco(d);
                validarAnoEdicionDisco(d);
                validarDiscografia(d);
                validarNumeroCanciones(d);
                d.setArtistas(artistas);
                obras.add(d);
                
            }else if(tipo.equalsIgnoreCase("pelicula")){ //Pelicula
                Pelicula p = new Pelicula();
                validarNombrePelicula(p);
                validarAnoEdicionPelicula(p);
                validarProductora(p);
                validarDuracion(p);
                p.setArtistas(artistas);
                obras.add(p);
            }
            } while (JOptionPane.showConfirmDialog(null, "¿Quieres seguir introduciendo obras?")== 0);
            
            
            
              
        } while (JOptionPane.showConfirmDialog(null, "¿Seguro que quieres salir?")== 1);
        
        mostrarDatos();
        
    }
    private static void validarArtistaNombre(Artista a) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del artista");
        Pattern pat = Pattern.compile("^([A-z]{2,})+$");
        Matcher mat = pat.matcher(nombre);
        if (mat.matches()) {
            a.setNombre(nombre);
        }else{
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarArtistaNombre(a);
        }
    }

    private static void validarArtistaFechaNacimiento(Artista a) {
        try{
            
            String fechan = JOptionPane.showInputDialog("Introduce la fecha de nacimiento del artista en formato dd/MM/YYYY");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(fechan, formatter);
            a.setFechaNacimiento(fecha); 
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarArtistaFechaNacimiento(a);
        }
        
        
             
    }

    

    private static void validarNombreLibro(Libro l) {
        String titulo = JOptionPane.showInputDialog("Introduce el titulo del libro");
        Pattern pat = Pattern.compile("^([A-z]{2,})+$");
        Matcher mat = pat.matcher(titulo);
        if (mat.matches()) {
           l.setTitulo(titulo);
        }else {
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarNombreLibro(l);
        }
    }

    private static void validarAnoEdicionLibro(Libro l) {
        String anoEdicion = JOptionPane.showInputDialog("Introduce el año de edicion del libro");
        Pattern pat = Pattern.compile("^1[0-9][0-9][0-9]|200[0-9]|201[0-9]|2020");
        Matcher mat = pat.matcher(anoEdicion);
        if (mat.matches()) {
            int edicionAno = Integer.parseInt(anoEdicion);
            l.setAnoEdicion(edicionAno);
        }else {
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarAnoEdicionLibro(l);
        }
    }

    private static void validarEditorialLibro(Libro l) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre de la editorial");
        Pattern pat = Pattern.compile("^([A-z]{2,})+$");
        Matcher mat = pat.matcher(nombre);
        if (mat.matches()) {
            l.setEditorial(nombre);
        }else{
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarEditorialLibro(l);
        }    }

    private static void validarNumeroPaginas(Libro l) {
        String nro = JOptionPane.showInputDialog("Introduce el número de paginas que contiene el libro");
        Pattern pat = Pattern.compile("^[1-9]{2,}$");
        Matcher mat = pat.matcher(nro);
        if (mat.matches()) {
            int paginas = Integer.parseInt(nro);
            l.setNumeroPaginas(paginas);
        }else
        {
           JOptionPane.showMessageDialog(null, "Dato no válido");
           validarNumeroPaginas(l);
        }
    }

    private static void validarNombreDisco(Disco d) {
        String titulo = JOptionPane.showInputDialog("Introduce el titulo del disco");
        Pattern pat = Pattern.compile("^([A-z]{2,})+$");
        Matcher mat = pat.matcher(titulo);
        if (mat.matches()) {
           d.setTitulo(titulo);
        }else {
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarNombreDisco(d);
        }     
    }

    private static void validarAnoEdicionDisco(Disco d) {
        String anoEdicion = JOptionPane.showInputDialog("Introduce el año de edicion del disco");
        Pattern pat = Pattern.compile("^1[0-9][0-9][0-9]|200[0-9]|201[0-9]|2020");
        Matcher mat = pat.matcher(anoEdicion);
        if (mat.matches()) {
            int edicionAno = Integer.parseInt(anoEdicion);
            d.setAnoEdicion(edicionAno);
        }else {
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarAnoEdicionDisco(d);
        }    
    }

    private static void validarDiscografia(Disco d) {
        String titulo = JOptionPane.showInputDialog("Introduce el titulo de la discografica");
        Pattern pat = Pattern.compile("^([A-z]{2,})+$");
        Matcher mat = pat.matcher(titulo);
        if (mat.matches()) {
           d.setDiscografia(titulo);
        }else {
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarDiscografia(d);
        }   
    }

    private static void validarNumeroCanciones(Disco d) {
        String nro = JOptionPane.showInputDialog("Introduce el número de canciones que contiene el disco");
        Pattern pat = Pattern.compile("^[1-9]{2,}$");
        Matcher mat = pat.matcher(nro);
        if (mat.matches()) {
            int canciones = Integer.parseInt(nro);
            d.setNumeroCanciones(canciones);
        }else
        {
           JOptionPane.showMessageDialog(null, "Dato no válido");
           validarNumeroCanciones(d);
        }   
    }

    private static void validarNombrePelicula(Pelicula p) {
        String titulo = JOptionPane.showInputDialog("Introduce el titulo de la pelicula");
        Pattern pat = Pattern.compile("^([A-z]{2,})+$");
        Matcher mat = pat.matcher(titulo);
        if (mat.matches()) {
           p.setTitulo(titulo);
        }else {
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarNombrePelicula(p);
        }    
    }

    private static void validarAnoEdicionPelicula(Pelicula p) {
        String anoEdicion = JOptionPane.showInputDialog("Introduce el año de edicion de la obra");
        Pattern pat = Pattern.compile("^1[0-9][0-9][0-9]|200[0-9]|201[0-9]|2020");
        Matcher mat = pat.matcher(anoEdicion);
        if (mat.matches()) {
            int edicionAno = Integer.parseInt(anoEdicion);
            p.setAnoEdicion(edicionAno);
        }else {
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarAnoEdicionPelicula(p);
            
        }    
    }

    private static void validarProductora(Pelicula p) {
        String titulo = JOptionPane.showInputDialog("Introduce el nombre de la productora");
        Pattern pat = Pattern.compile("^([A-z]{2,})+$");
        Matcher mat = pat.matcher(titulo);
        if (mat.matches()) {
           p.setProductora(titulo);
        }else {
            JOptionPane.showMessageDialog(null, "Dato no válido");
            validarProductora(p);
        }      
    }

    private static void validarDuracion(Pelicula p) {
        String nro = JOptionPane.showInputDialog("Introduce cuantos minutos dura la pelicula");
        Pattern pat = Pattern.compile("^[1-9]{2,}$");
        Matcher mat = pat.matcher(nro);
        if (mat.matches()) {
            int duracion = Integer.parseInt(nro);
            p.setDuracion(duracion);
        }else
        {
           JOptionPane.showMessageDialog(null, "Dato no válido");
           validarDuracion(p);
        }      
    }

    private static void comprovacionRepetido(Artista a) {
        if (artistas.contains(a)) {
           validarArtistaNombre(a); 
        }
            
    }

    private static void mostrarDatos() {
        String texto ="";
            for (int i = 0; i < 10; i++) {
                Libro libro = (Libro) obras.get(i);
                Disco disco = (Disco) obras.get(i);
                Pelicula pelicula = (Pelicula) obras.get(i);
                texto += "OBRAS:\n" + 
                        "LIBROS:\n" + "    " + obras.get(i).getTitulo() + "    " + obras.get(i).getAnoEdicion()
                        + "    " + libro.getEditorial() + "    " + libro.getNumeroPaginas() + "\n" +
                        "DISCOS:\n" + "    " + obras.get(i).getTitulo() + "    " + obras.get(i).getAnoEdicion()
                        + "    " + disco.getDiscografia() + "    " + disco.getNumeroCanciones() + "\n" +
                        "PELICULAS:" + "    " + obras.get(i).getTitulo() + "    " + obras.get(i).getAnoEdicion()
                        + "    " + pelicula.getProductora() + pelicula.getDuracion();
         
        }
         
        JOptionPane.showMessageDialog(null, texto);
        
    }
    
}
