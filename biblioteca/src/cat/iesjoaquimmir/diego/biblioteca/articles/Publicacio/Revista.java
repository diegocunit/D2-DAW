
package cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio;
import cat.iesjoaquimmir.diego.biblioteca.articles.Categoria;


public class Revista extends Publicacio{
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String issn;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    public String getIssn() {
        return issn;
    }

    
    private void setIssn(String issn) {
        this.issn = issn;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
     public Revista(String titol, String autor, Categoria categoria, int numpagines, String issn) {
        super(titol, autor, categoria, numpagines);
        this.setIssn(issn);
        }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodes">
     //<editor-fold defaultstate="collapsed" desc="tostring">
       @Override
    public String toString() {
        return String.format(" %s "
      
                + "Issn: %s",
                super.toString(), getIssn()); 
    
    }
//</editor-fold>
//</editor-fold>
    
    
   
    
    
}
