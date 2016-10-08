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
public class Square {
    private double side;    

    public Square(double side) {
        this.setSide(side);
    }      

    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
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
    
}
