
package cat.iesjoaquimmir.diego.biblioteca.articles;


public abstract class Article {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String titol;
    private  String autor;
    private Categoria categoria;
   
   
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
     
    public String getAutor() {
        return autor;
    }

    
    public Categoria getCategoria() {
        return categoria;
    }

    
    public String getTitol() {
        return titol;
    }

    
   
    private void setAutor(String autor) {
         if(autor == null){
         throw new NullPointerException("El autor no puede ser nulo");
        }
       
        this.autor = autor;
    }

    
    private void setCategoria(Categoria categoria) {
         if(categoria == null){
         throw new NullPointerException("La categoria no puede ser nulo");
        }
        this.categoria = categoria;
    }

    
    
    private void setTitol(String titol) {
         if(titol == null){
         throw new NullPointerException("El titol no puede ser nulo");
        }
        this.titol = titol;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodes">
    //<editor-fold defaultstate="collapsed" desc="tostring">
    @Override
    public String toString() {
        return String.format("%n El titulo: %s  %n"
                + "El autor:  %s  %n"
                + "La categoria: %s  %n"
                , getTitol(), getAutor(), getCategoria() );
        
    }
//</editor-fold>
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="interficie">
    public interface InArticle{
        String Missatge ="%n EDICIO ESPECIAL %n";
        
        public abstract void Interfice();

}
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
    public Article(String titol, String autor, Categoria categoria){
        this.setTitol(titol);
        this.setAutor(autor);
        this.setCategoria(categoria);
        
      
    }
//</editor-fold>
    
}
