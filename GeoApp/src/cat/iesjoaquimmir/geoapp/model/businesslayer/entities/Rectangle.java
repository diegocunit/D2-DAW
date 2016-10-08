
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Rectangle {
    private double base=1.0;
    private double height=1.0;
   
    
//<editor-fold defaultstate="collapsed" desc="construsctor">
     public Rectangle(double base, double height){
     this.setBase(base);
     this.setHeight(height);
     }
     
     public Rectangle(double base){
     this(base,1.0);
     }
     
    public Rectangle() {
        this(1.0);
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


