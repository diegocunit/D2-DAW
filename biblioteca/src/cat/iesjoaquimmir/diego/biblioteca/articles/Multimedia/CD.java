
package cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia;

import cat.iesjoaquimmir.diego.biblioteca.articles.Categoria;


public class CD extends Multimedia {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String ismn;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
     public String getIsmn() {
        return ismn;
    }

    
    private void setIsmn(String ismn) {
        this.ismn = ismn;
    }
//</editor-fold>   
    //<editor-fold defaultstate="collapsed" desc="metodes">
    
        //<editor-fold defaultstate="collapsed" desc="tostring">
      @Override
    public String toString() {
        return String.format(" %s "
                
                + "Ismn: %s",
                super.toString(), getIsmn()); 
    }
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="interfice">
    @Override
    public void Interfice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
     public CD(String titol, String autor, Categoria categoria,int durada, String ismn) {
        super(titol, autor, categoria,durada);
        
        this.setIsmn(ismn);
    }
//</editor-fold>
   
   
   
}
