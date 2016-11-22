
package cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia;

import cat.iesjoaquimmir.diego.biblioteca.articles.Categoria;


public class DVD extends Multimedia {
    //<editor-fold defaultstate="collapsed" desc="atributos">
    private String isan;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
     public String getIsan() {
        return isan;
    }

    
    private void setIsan(String isan) {
        this.isan = isan;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
      public DVD(String titol, String autor, Categoria categoria,int durada, String isan) {
        super(titol, autor, categoria,durada);
        this.setIsan(isan);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodes">
        //<editor-fold defaultstate="collapsed" desc="tostring">
        @Override
    public String toString() {
        return String.format(" %s "
                
                + "Isan: %s",
                super.toString(), getIsan()); 
    
    }
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="interfice">
    @Override
    public void Interfice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>
     
//</editor-fold>

   
    
   

 
   
    
    
}
