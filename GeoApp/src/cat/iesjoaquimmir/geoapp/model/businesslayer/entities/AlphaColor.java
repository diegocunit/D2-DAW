
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

public class AlphaColor extends Color{
    //<editor-fold defaultstate="collapsed" desc="atributs">
     private double alpha;   
    
//</editor-fold>
     
     //<editor-fold defaultstate="collapsed" desc="statics">
     private static final double MAX_ALPH=1;
     private static final double MIN_ALPH=0;
      private static int counter=0;
   
//</editor-fold>

     //<editor-fold defaultstate="collapsed" desc="getterssetters">
     public double getAlpha() {
        return alpha;
    }

    
    public void setAlpha(double alpha) {
        if(alpha >= 0.0 && alpha <=1.0  ){
        
            this.alpha = alpha;
        }else{
            throw new IllegalArgumentException("El parametro que me has pasado no es válido, pasame 0 u 1");
        }
    }
    

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="counter">
    public static int getCounter(){
        return counter;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
    public AlphaColor(double alpha, int red,int green,int blue){
        super(red, green, blue);
        this.setAlpha(alpha);
        counter++;
      }
    public AlphaColor(int red, int green, int blue){
        this(MAX_ALPH,red,green,blue);
    }
    
    public AlphaColor (double alpha){
        this(alpha,0,0,0);
        }
    public AlphaColor(){
    this(MIN_ALPH,0,0,0);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="sobreescritura">
    
   @Override
    public String toHexString(boolean upper) {
        return String.format("%s i alpha: %.2f", super.toHexString(upper),getAlpha());
    }

    @Override
    public String toHexString() {
        return String.format("%s i alpha: %.2f", super.toHexString(true),getAlpha()); 
    }
    

    @Override
    public String toRGBString(boolean upper) {
        return String.format("%s ", super.toRGBString(upper)); 
        
    }

    public String toRGBString() {
        return String.format("%s %.2f",super.toRGBString(true),getAlpha());
    }
 
  

//</editor-fold>

    
    
    
    
}
