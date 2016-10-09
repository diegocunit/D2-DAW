
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public abstract class General {
    //<editor-fold defaultstate="collapsed" desc="atributs">
     private AlphaColor backgroundcolor;
    private AlphaColor foregroundcolor;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="statics">
    private static int counter=0;
     //<editor-fold defaultstate="collapsed" desc="metodes estatics">
     public static int getCounter(){
     return counter;
     }
    
//</editor-fold>
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="metodes">
     //<editor-fold defaultstate="collapsed" desc="tostring">
    @Override     
     public String toString(){
     return String.format("%n Color de linea: %s %n"
             + "Color de fondo: %s %n"
             
            ,getForegroundColor().toHexString(),getBackgroundColor().toHexString()); 
     }

//</editor-fold>
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    public AlphaColor getBackgroundColor() {
        return backgroundcolor;
    }
     public AlphaColor getForegroundColor(){
     return foregroundcolor;
     }
      private void setBackgroundColor(AlphaColor backgroundcolor){
    if(backgroundcolor == null){
         throw new NullPointerException("No puede ser nulo");
            
    }
        this.backgroundcolor = backgroundcolor;
    }
     private void setForegroundColor(AlphaColor foregroundcolor){
    if(foregroundcolor == null){
         throw new NullPointerException("No puede ser nulo");
            
    }
         this.foregroundcolor = foregroundcolor;
    }
//</editor-fold>
    
      //<editor-fold defaultstate="collapsed" desc="constructors">
     public General(AlphaColor backgroundcolor, AlphaColor foregroundcolor){
    
         this.setBackgroundColor(backgroundcolor);
         this.setForegroundColor(foregroundcolor);
         counter++;
     }
//</editor-fold>
    
}
