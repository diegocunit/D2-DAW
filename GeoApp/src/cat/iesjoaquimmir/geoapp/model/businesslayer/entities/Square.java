/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Square {
    private double side;    

    public Square(double side) {
        this.setSide(1.0);
    }      

 
    public double getSide() {
        return side;
    }

   
    public void setSide(double side) {
        this.side = side;
    }
    //<editor-fold defaultstate="collapsed" desc="metodes">
    
    public double getArea(){
        return Math.pow(getSide(),2);
       
    }
    public double getPerimeter(){
        return getSide() * 4;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
    public Square(){
    this(1.0);
     
    }
//</editor-fold>
}
