
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Rectangle extends General {
    private double base=1.0;
    private double height=1.0;
   
    //<editor-fold defaultstate="collapsed" desc="static">
    private static final double height1 = 1.0;
    private static final double base1 = 1.0;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="construsctor">
     public Rectangle(double base, double height,AlphaColor backgroundcolor, AlphaColor foregroundcolor){
         super(backgroundcolor, foregroundcolor);
     this.setBase(base);
     this.setHeight(height);
     }
     public Rectangle(double base, double height){
     this(base,height,null,null);
     }
     
     public Rectangle(double base){
     this(base,height1,null,null);
     }
     
    public Rectangle() {
        this(base1,height1,null,null);
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


