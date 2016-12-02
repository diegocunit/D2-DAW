
package cat.iesjoaquimmir.diego.bilbioteca.usuaris.adults;


import cat.iesjoaquimmir.diego.bilbioteca.usuaris.Usuari;
import java.util.ArrayList;


public class Adult extends Usuari {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String dni;
    private boolean premium;
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
   
    @Override
    protected boolean isAdulto() {
       return true;
    }
  
    public String getDni() {
        return dni;
    }
    
    public boolean isAdult(){
         return true;
     }
    
    private void setDni(String dni) {
         if(dni == null){
        throw new NullPointerException("DNI no pot ser null");
        }
        this.dni = dni;
    }
        
      public void setPremium(boolean premium) {
         
        this.premium = premium;
    }
    public boolean isPremium() {
        return premium;
    }
       
      
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
       public Adult(String dni, boolean premium, String nom, String cognom1, String cognom2) {
        super(nom, cognom1, cognom2);
        this.setDni(dni);
        this.setPremium(premium);
    }
//</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="metodes">
        //<editor-fold defaultstate="collapsed" desc="sobrescritura">
  
    @Override
    protected boolean isPrem() {
        return isPremium();
    }
  
//</editor-fold>

//</editor-fold>



  
      
  

    
  
    
    
}
