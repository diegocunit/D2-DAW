/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Circle {
    private double radius;    
//<editor-fold defaultstate="collapsed" desc="constructor">
     public Circle(double radius) {
        this.setRadius(radius);
    }

    public Circle() {
        this(1.0);
    }
     
     /**
     * @return the radius
     */
//</editor-fold>
   

    
    public double getRadius() {
        return radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //<editor-fold defaultstate="collapsed" desc="metodes">
    
    public double getArea(){
        return Math.PI * Math.pow(getRadius(),2);
       
    }
    public double getPerimeter(){
        return 2 * Math.PI * getRadius();
    }
    
//</editor-fold>
    
}
