/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss;
import Vista.VistaFeed;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Naia
 */
public class RssReader {

    private static VistaFeed vp;
    public static void main(String[] args) {
        vp = new VistaFeed();
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
    }
    public static String readRSS(String DirUrl){
        try {
            URL rssUrl = new URL(DirUrl);
            BufferedReader in = new BufferedReader(new InputStreamReader(rssUrl.openStream()));
            String sourceCode = "";
            String line;
            while ((line = in.readLine())!= null) {                
                if (line.contains("<tittle>")) {
                    int firstPos = line.indexOf("<tittle>");
                    String temp = line.substring(firstPos);
                    temp = temp.replace("<tittle>", "");
                    int lastPos = temp.indexOf("<tittle>");
                    temp = temp.substring(0, lastPos);
                    sourceCode += temp + "\n";
                }
 
            }
        
            in.close();
            return sourceCode;
        } 
        catch (MalformedURLException ue) {
            System.out.println("Malformed URL");
        }
        catch (IOException ioe){
            System.out.println("Something went wrong reading then contents");
        }
        return null;
    }
    
}
