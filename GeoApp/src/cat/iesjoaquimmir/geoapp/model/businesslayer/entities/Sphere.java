/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Sphere extends General {
    private double Radio;    
    //<editor-fold defaultstate="collapsed" desc="statics">
    private final static double Radio1 = 1.0;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="constructor">
     
     public Sphere(double Radio, AlphaColor backgroundcolor, AlphaColor foregroundcolor){
        super(backgroundcolor, foregroundcolor);
        this.setRadio(Radio);
    
    }
      public Sphere(double Radio) {

        this(Radio,null,null);
    }
      public Sphere(){
      this(Radio1,null,null);
              }
//</editor-fold>

   
   
//<editor-fold defaultstate="collapsed" desc="getterssetters">
    
  public double getRadio() {
        return Radio;
    }

    
    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
//</editor-fold>
  //<editor-fold defaultstate="collapsed" desc="metodes">
    
    public double getArea(){
        return Math.PI * Math.pow(getRadio(),2);
       
    }
    public double getVolumen(){
        return 4 / 3 * Math.PI * getRadio();
    }
    
//</editor-fold>
    
}