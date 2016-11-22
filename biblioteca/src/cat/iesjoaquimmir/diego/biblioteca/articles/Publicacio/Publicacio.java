
package cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio;

import cat.iesjoaquimmir.diego.biblioteca.articles.Article;
import cat.iesjoaquimmir.diego.biblioteca.articles.Categoria;

public abstract class Publicacio extends Article {
     //<editor-fold defaultstate="collapsed" desc="atributs">
     private int numpagines;
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="getters/setters">
      
    public int getNumpagines() {
        return numpagines;
    }

    
    private void setNumpagines(int numpagines) {
         if(numpagines == 0){
         throw new NullPointerException("El numero de paginas no puede ser nulo");
        }
        this.numpagines = numpagines;
    }
   
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="constructor">
    public Publicacio(String titol, String autor, Categoria categoria,int numpagines){
        super(titol,autor,categoria);
        this.setNumpagines(numpagines);
    }
    
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="metodes">
    //<editor-fold defaultstate="collapsed" desc="tostring">
    @Override
    public String toString() {
        return String.format("%s "
                + "Nº pag: %d %n" ,super.toString(),getNumpagines());
    }
//</editor-fold>
//</editor-fold>

    
   
   
}
