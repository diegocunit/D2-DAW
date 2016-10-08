
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;
import java.util.Random;


public class Color {

 
 //<editor-fold defaultstate="collapsed" desc="atributs">
     private int red;
    private int green;
     private int blue;
     private Random rnd = new Random();
   
    public static final int MAX_VALUE=255;
    public static final int MIN_VALUE=0;
    private static int counter=0;
    private static int seed=50;
    
     
//</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes">
    //<editor-fold defaultstate="collapsed" desc="Mètodes estatics">
    //<editor-fold defaultstate="collapsed" desc="operadors">
     //<editor-fold defaultstate="collapsed" desc="counter">
    public static int getCounter(){
        return counter;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="string">

     public static Color fromHexString(String color){
    //<editor-fold defaultstate="collapsed" desc="control">
         if (color == null){
            throw new NullPointerException("Es obligatori indicar una "+"cadena de text");
    }
         
          if (!color.matches("^#[0-9A-Fa-f]{6}$")){
            throw new IllegalArgumentException(
                   String.format("El text %s no te format hexadecimal", color));
    }
//</editor-fold>
    
    return new Color(Integer.parseInt(color.substring(1,3), 16),
    Integer.parseInt(color.substring(3, 5), 16),
    Integer.parseInt(color.substring(5, 7), 16));
    
    }
//</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="torgb">
       public String toRGBString(){
    throw new UnsupportedOperationException("Not yet implemented");
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="tohexstring">
        public String toHexString(boolean upper){
    
    return toHexString(true);
    }
//</editor-fold> 
        /*public Random(long seed){
        rnd.setSeed(seed);
     }*/
     
//</editor-fold>
   
     
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
   
    public Color(int red, int green,int blue){
       counter++;
    this.setRed(red);
    this.setGreen(green);
    this.setBlue(blue);
    
    }
    
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="getters/setters">
    
     public int getRed() {
        return red;
    }
     
     public int getGreen() {
        return green;
    }
     
    public int getBlue() {
        return blue;
    }
    
       public static int getSeed() {
        return seed;
    }
       public Random getRnd() {
        return rnd;
    }

   
 public void setSeed(long seed) {
        seed = (seed ^ 0x5DEECE66DL) & ((1L << 48) -1);
    }
  

    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }
 
 
 
 
    public void setRed(int red) {
        if (red < 0 || red > 255){
            throw new IllegalArgumentException(
            String.format("valor %d no válido para el color R" , red)
            );
        }
            this.red = red;
        
    }

    
    public void setGreen(int green) {
        if (green < 0 || green > 255){
            throw new IllegalArgumentException(
            String.format("valor %d no válido para el color G" , green)
            );
        }
        
        this.green = green;
    }

    
    public void setBlue(int blue) {
         if (blue < 0 || blue > 255){
            throw new IllegalArgumentException(
            String.format("valor %d no válido para el color B" , blue)
            );
        }
        
        this.blue = blue;
    }
    
    
    
    
//</editor-fold>
    
//</editor-fold>

   

    
}
