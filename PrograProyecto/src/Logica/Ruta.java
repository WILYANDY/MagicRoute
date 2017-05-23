/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author USUARIO
 */
public class Ruta {
    private String direccion = "";
    private Archivo a = new Archivo();
      
    //System.out.println(s1);

    public Ruta(String direccion) {
    this.direccion = direccion;
    }
    
    
    private String ma[][] = new String [25][2];
    
    public String[][] matrizRutas()
            
    {
        String s1 = a.leerTxt(getDireccion());
        int l = 0, i = 0, s = 0;
        for (int k = 0; k < s1.length(); k++) {
            if (s1.charAt(k) == ',') {
               ma[i][0] = s1.substring(l, k);
                l = k + 1;
                i++;
            }
            if (s1.charAt(k) == '|') {
                ma[s][1] = s1.substring(l, k);
                l = k + 1;
                s++;
            }
        }
        return ma;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the a
     */
    
 
}
