
package cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio;
import cat.iesjoaquimmir.diego.biblioteca.articles.Categoria;

public class Llibres extends Publicacio {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String isbn;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
     public String getIsbn() {
        return isbn;
    }

    
    private void setIsbn(String isbn) {
        this.isbn = isbn;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
    public Llibres(String titol, String autor, Categoria categoria, int numpagines,String isbn) {
        super(titol, autor, categoria, numpagines);
        this.setIsbn(isbn);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodes">
    //<editor-fold defaultstate="collapsed" desc="tostring">
     @Override
    public String toString() {
        return String.format(" %s"
                
                + "Isbn: %s %n",
                super.toString(), getIsbn()); 
    
    }
    
//</editor-fold>
//</editor-fold>

   
  
   

   
    
}
