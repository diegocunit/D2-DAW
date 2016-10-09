
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Circle extends General {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private double radius;    
//</editor-fold>
      
//<editor-fold defaultstate="collapsed" desc="constructor">
     public Circle(double radius,AlphaColor backgroundcolor, AlphaColor foregroundcolor) {
         super(backgroundcolor, foregroundcolor);
        this.setRadius(radius);
        
    }
     public Circle(double radius){
     this(radius,null,null);
     }
    public Circle() {
        this(1.0);
    }
     
   
//</editor-fold>
   

    //<editor-fold defaultstate="collapsed" desc="getterssetters">
    public double getRadius() {
        return radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="metodes">
    
    public double getArea(){
        return Math.PI * Math.pow(getRadius(),2);
       
    }
    public double getPerimeter(){
        return 2 * Math.PI * getRadius();
    }
    
//</editor-fold>
    
}
