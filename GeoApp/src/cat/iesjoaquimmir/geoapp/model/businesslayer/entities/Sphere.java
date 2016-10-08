/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

/**
 *
 * @author alumne
 */
public class Sphere {
    private double Radio;    
//<editor-fold defaultstate="collapsed" desc="constructor">
     public Sphere(double Radio) {
        this.setRadio(Radio);
    }
//</editor-fold>
   

  public double getRadio() {
        return Radio;
    }

    /**
     * @param Radio the Volumen to set
     */
    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
  //<editor-fold defaultstate="collapsed" desc="metodes">
    
    public double getArea(){
        return Math.PI * Math.pow(getRadio(),2);
       
    }
    public double getVolumen(){
        return 4 / 3 * Math.PI * getRadio();
    }
    
//</editor-fold>
    
}