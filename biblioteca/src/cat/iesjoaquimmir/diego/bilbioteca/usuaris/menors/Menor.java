
package cat.iesjoaquimmir.diego.bilbioteca.usuaris.menors;
import cat.iesjoaquimmir.diego.bilbioteca.usuaris.Usuari;
import cat.iesjoaquimmir.diego.bilbioteca.usuaris.adults.Adult;
import java.util.ArrayList;


public class Menor extends Usuari {
    //<editor-fold defaultstate="collapsed" desc="atributs">
      
      private Adult tutor;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
      public Adult getTutor() {
        return tutor;
    }
    private void setTutor(Adult tutor) {
        if(tutor == null){
        throw new NullPointerException("Un menor no pot prescindir de tutor");
        }
        this.tutor = tutor;
    }
     
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
    public Menor(Adult tutor,String nom, String cognom1, String cognom2) {
        super(nom, cognom1, cognom2);
        this.setTutor(tutor);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodes">
      //<editor-fold defaultstate="collapsed" desc="sobrescritura">

    @Override
    protected boolean isPrem() {
       return tutor.isPremium();
    }
    
    
     @Override
     protected boolean isAdulto() {
            return false;
    }
   
//</editor-fold>
//</editor-fold>
  

   
   

    
    
   
}
