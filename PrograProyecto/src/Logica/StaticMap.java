/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import interfaz.prueba1;
import java.awt.Dimension;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import maps.java.StaticMaps;

/**
 *
 * @author USUARIO
 */
public class StaticMap {
    
    private final String URLRoot="http://maps.googleapis.com/maps/api/staticmap";

public Image getStaticMap(int opcion,String centerAddress,int zoom,Dimension size,int scale,StaticMaps.Format format, StaticMaps.Maptype maptype) throws MalformedURLException, UnsupportedEncodingException{
    
    if(opcion == 0){
        URL url=new URL(URLRoot + "?center=" + URLEncoder.encode(centerAddress, "utf-8") + "&zoom=" + zoom +
                "&size=" + size.width + "x" + size.height + "&scale=" + scale+
                "&format=" + format.toString() + "&maptype=" + maptype.toString() + "&markers=" + URLEncoder.encode(centerAddress, "utf-8") + 
                "&markers=color:yellow%7Clabel:3%7C-2.897842,-79.003849&markers=color:yellow%7Clabel:2%7C-2.897520,-79.005308&markers=color:yellow%7Clabel:1%7C-2.898892,-79.006294&markers=color:yellow%7Clabel:4%7C-2.898642,-78.997793&markers=color:yellow%7Clabel:5%7C-2.903423,-79.001659");
        try {
            Image imageReturn;
            imageReturn=ImageIO.read(url);
            return imageReturn;
        } catch (Exception e) {
            return null;
        }
     }
    else if(opcion == 1){
        URL url=new URL(URLRoot + "?center=" + URLEncoder.encode(centerAddress, "utf-8") + "&zoom=" + zoom +
                "&size=" + size.width + "x" + size.height + "&scale=" + scale+
                "&format=" + format.toString() + "&maptype=" + maptype.toString() + "&markers=" + URLEncoder.encode(centerAddress, "utf-8") + 
                "&markers=color:green%7Clabel:1%7C-2.885319,-78.994096&markers=color:green%7Clabel:2%7C-2.898633,-78.998405&markers=color:green%7Clabel:3%7C-2.897468,-79.004346&markers=color:green%7Clabel:4%7C-2.903943,-79.003178&markers=color:green%7Clabel:5%7C-2.911937,-78.990316");
        try {
            Image imageReturn;
            imageReturn=ImageIO.read(url);
            return imageReturn;
        } catch (Exception e) {
            return null;
        }
      }
    if(opcion == 2){
        URL url=new URL(URLRoot + "?center=" + URLEncoder.encode(centerAddress, "utf-8") + "&zoom=" + zoom +
                "&size=" + size.width + "x" + size.height + "&scale=" + scale+
                "&format=" + format.toString() + "&maptype=" + maptype.toString() + "&markers=" + URLEncoder.encode(centerAddress, "utf-8") + 
                "&markers=color:blue%7Clabel:1%7C-2.903006,-79.004595&markers=color:blue%7Clabel:2%7C-2.901977,-79.003906&markers=color:blue%7Clabel:3%7C-2.902693,-79.002293&markers=color:blue%7Clabel:4%7C-2.904991,-78.999183&markers=color:blue%7Clabel:5%7C-2.906082,-78.996836");
        try {
            Image imageReturn;
            imageReturn=ImageIO.read(url);
            return imageReturn;
        } catch (Exception e) {
            return null;
        }
      }
    if(opcion == 3){
        URL url=new URL(URLRoot + "?center=" + URLEncoder.encode(centerAddress, "utf-8") + "&zoom=" + zoom +
                "&size=" + size.width + "x" + size.height + "&scale=" + scale+
                "&format=" + format.toString() + "&maptype=" + maptype.toString() + "&markers=" + URLEncoder.encode(centerAddress, "utf-8") + 
                "&markers=color:purple%7Clabel:1%7C-2.905217,-78.999791&markers=color:purple%7Clabel:2%7C-2.907361,-78.996961&markers=color:purple%7Clabel:3%7C-2.894025,-78.956739&markers=color:purple%7Clabel:4%7C-2.922350,-79.010255&markers=color:purple%7Clabel:5%7C-2.783262,-79.225055");
        try {
            Image imageReturn;
            imageReturn=ImageIO.read(url);
            return imageReturn;
        } catch (Exception e) {
            return null;
        }
      }
    return null;
      }

}