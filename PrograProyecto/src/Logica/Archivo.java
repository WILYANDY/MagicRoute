/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.io.*;
/**
 *
 * @author USUARIO
 */
public class Archivo {
  public String leerTxt(String direccion){
          String texto = "";
       // String vectorLatitud[] = new String[5];
         // String vectorLongitud[] = new String[5];
                  try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            int i=0;
            while((bfRead = bf.readLine()) != null){ 
              temp = temp+ bfRead;
            }
            
            texto = temp;
            
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
       return texto;
        }
}
