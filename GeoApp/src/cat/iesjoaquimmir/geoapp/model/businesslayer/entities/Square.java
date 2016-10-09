
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Square extends General {
    private double side;    
    
  

    //<editor-fold defaultstate="collapsed" desc="getterssetters">
     public double getSide() {
        return side;
    }
    
     
    private void setSide(double side) {
        this.side = side;
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
    
    public Square(double side, AlphaColor backgroundcolor, AlphaColor foregroundcolor){
        super(backgroundcolor, foregroundcolor);

        this.setSide(side);
    
    }
    
     public Square(double side) {
        this(side,null,null);
    }      
    public Square(){
    this(1.0);
    }
   
   
  
    
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="tostring">
    @Override
    public String toString() {
        return String.format("El costat d'square: %.2f%n"
                + "Area d'square: %.2f%n"
                + "perimetre d'square: %.2f"
                + "%s"
                
              
            
                ,getSide(),getArea(),getPerimeter(), super.toString() ); 
    }
//</editor-fold>

    
}
