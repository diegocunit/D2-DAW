/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Square {
    private double side;    
    
    private Color backgroundcolor;
    private Color foregroundcolor;
    
   
    
    
    

    //<editor-fold defaultstate="collapsed" desc="getterssetters">
     public double getSide() {
        return side;
    }
     public Color getBackgroundColor(){
     return backgroundcolor;
     }
     public Color getForegroundColor(){
     return foregroundcolor;
     }
     
     
    private void setSide(double side) {
        this.side = side;
    }
    
    private void setBackgroundColor(Color backgroundcolor){
    if(backgroundcolor == null){
         throw new NullPointerException("No puede ser nulo");
            
    }
        this.backgroundcolor = backgroundcolor;
    }
     private void setForegroundColor(Color foregroundcolor){
    if(foregroundcolor == null){
         throw new NullPointerException("No puede ser nulo");
            
    }
         this.foregroundcolor = foregroundcolor;
    }
    
    
//</editor-fold>
   
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
    public Square(double side) {
        this.setSide(1.0);
    }      
    public Square(double side, Color foregroundcolor, Color backgroundcolor){
        this.setSide(side);
        this.setForegroundColor(foregroundcolor);
        this.setBackgroundColor(backgroundcolor);
    }
    public Square(double side, Color foregroundcolor){
    this.setSide(side);
    this.setForegroundColor(foregroundcolor);
    this.setBackgroundColor(new Color(Color.MAX_VALUE ,Color.MAX_VALUE,Color.MAX_VALUE));
    }
    public Square(Color backgroundcolor){
    this.setSide(side);
    this.setBackgroundColor(backgroundcolor);
    this.setBackgroundColor(new Color (Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE));
    }
    
    
//</editor-fold>
}
