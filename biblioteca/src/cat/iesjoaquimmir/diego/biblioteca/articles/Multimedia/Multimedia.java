
package cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia;
import cat.iesjoaquimmir.diego.biblioteca.articles.Article;
import cat.iesjoaquimmir.diego.biblioteca.articles.Article.InArticle;
import cat.iesjoaquimmir.diego.biblioteca.articles.Categoria;
public abstract class Multimedia extends Article implements InArticle{
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private int durada;
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    public int getDurada() {
        return durada;
    }

    private void setDurada(int durada) {
         if(durada == 0){
         throw new NullPointerException("La duracion no puede ser nulo");
        }
        this.durada = durada;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
     public Multimedia(String titol, String autor, Categoria categoria, int durada) {
        super(titol, autor, categoria);
        this.setDurada(durada);
    }
    
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="metodes">
     
    //<editor-fold defaultstate="collapsed" desc="tostring">
          @Override
          public String toString() {
              return String.format("%s"
                      + "La durada: %d %n", super.toString(), getDurada()); 
          }
          
//</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="interfice">
          @Override
    public abstract void Interfice();

   
//</editor-fold>
    
//</editor-fold>

    
}
