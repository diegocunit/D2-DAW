
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
   
    
     

    
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes">
    //<editor-fold defaultstate="collapsed" desc="Mètodes estatics">
    //<editor-fold defaultstate="collapsed" desc="operadors">
     //<editor-fold defaultstate="collapsed" desc="counter">
    public static int getCounter(){
        return counter;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="FromHexstring">

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
     
   
    //<editor-fold defaultstate="collapsed" desc="tohexstring">
        public String toHexString(boolean upper){
    
    return String.format(upper ? "#%02X%02X%02X" : "#%02x%02x%02x", getRed(),getGreen() ,getBlue());
    }
//</editor-fold> 
        
     //<editor-fold defaultstate="collapsed" desc="random">
    public static Color getRandom() {
        Random rnd = new Random();
        return new Color (rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="torgbstring">
         public String toRGBString(boolean upper){
    return String.format(upper ? "RGB: %d" : "rgb: %d", getRed(),getGreen() ,getBlue());
        }
//</editor-fold>
   
     //</editor-fold>
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="constructor">
   
    public Color(int red, int green,int blue){
       counter++;
    this.setRed(red);
    this.setGreen(green);
    this.setBlue(blue);
    
    }
    public String toHexString(){
    
        return toHexString(true);
    }
    public String toRGBString(){
        return toRGBString(true);
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
