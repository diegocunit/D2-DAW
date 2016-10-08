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
public class Rectangle {
    private double base;
    private double height;
//<editor-fold defaultstate="collapsed" desc="construsctor">
     public Rectangle(double base, double height) {
        this.setBase(base);
        this.setHeight(height);
    }
//</editor-fold>
   
     
 //<editor-fold defaultstate="collapsed" desc="base">
     public double getBase() {
      return base;
      }
     public void setBase(double base){
     
     this.base = base;
     }
     //</editor-fold>

 //<editor-fold defaultstate="collapsed" desc="height">
    
     public double getHeight() {
      return height;
      }
     public void setHeight(double height){
     
     this.height = height;
     }
     
     
//</editor-fold>
  //<editor-fold defaultstate="collapsed" desc="metodes">
    
    public double getPerimetro(){
        return Math.pow(getBase(),2) * Math.pow(getHeight(),2);
       
    }
    public double getArea(){
        return getBase() * getHeight();
    }
    
//</editor-fold>

    
    
}    


