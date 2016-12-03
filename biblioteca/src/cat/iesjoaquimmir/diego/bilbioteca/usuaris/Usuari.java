
package cat.iesjoaquimmir.diego.bilbioteca.usuaris;
import cat.iesjoaquimmir.diego.biblioteca.articles.Article;
import cat.iesjoaquimmir.diego.bilbioteca.usuaris.adults.Adult;

import java.util.ArrayList;


public abstract class Usuari  {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String nom;
    private String cognom1;
    private String cognom2;
    private ArrayList<Article> articles = new ArrayList<>();
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
       public String getCognom1() {
        return cognom1;
    }

    
    public String getCognom2() {
        return cognom2;
    }

   
    public String getNom() {
        return nom;
    }
  public ArrayList<Article> getArticles() {
        return articles;
    }
  
    private void setCognom1(String cognom1) {
        if(cognom1 == null){
        throw new NullPointerException("Cognom1 no pot ser null");
        }
        this.cognom1 = cognom1;
    }

    
    private void setCognom2(String cognom2) {
        if(cognom2 == null){
        throw new NullPointerException("Cognom2 no pot ser null");
        }
        this.cognom2 = cognom2;
    }

   
    private void setNom(String nom) {
        if(nom == null){
        throw new NullPointerException("nom no pot ser null");
        }
        this.nom = nom;
    }
   
    private void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }
    
//</editor-fold>
   //<editor-fold defaultstate="collapsed" desc="constructor">
    public Usuari(String nom, String cognom1, String cognom2, ArrayList<Article> articles ){
        this.setNom(nom);
        this.setCognom1(cognom1);
        this.setCognom2(cognom2);
        this.setArticles(articles);
    }
    public Usuari(String nom, String cognom1, String cognom2 ){
        this.setNom(nom);
        this.setCognom1(cognom1);
        this.setCognom2(cognom2);
      
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodes">
        //<editor-fold defaultstate="collapsed" desc="potagafar">
         public boolean potAgafarArticle(Article a){
    ///////////////////////// Si es adulto ////////////////////////////
             if(isAdulto() == true){
        //////////// Es premium //////////////
                 if(isPrem() == true ){
                   //////// no ha cogido el maximo
                        if(articles.size()<4){
                            return true;
                   /////// ya no tiene articulos disponibles a coger
                        }else{
                            return false;
                        }
        /////////// Si no es premium ///////////
                }else{
                   ///////// Si no ha cogido el maximo
                        if(articles.size()<2){
                            return true;
                   //////// si ya ha cogido el maximo
                        }else{
                            return false;
                        }
                 }
    ///////////////////////////// Si es menor ////////////////////////////////
             }else{
        ///////// Si tutor es premium //////////
                    if(isPrem() == true ){  

                    ///////// no ha cogido el maximo
                        if(articles.size()<4){
                              ////// Si es categoria adulta
                                if(a.getCategoria().categoriaAdulta() == true ){
                                    return false;
                                ////// Si la categoria no es adulta
                                }else{
                                    return true;
                                }
                    //////// Si ha cogido el maximo
                        }else{
                              return false;
                        }

       ///////// Si tutor no es premium /////////////
                    }else{
                        // si no ha cogido el maximo
                        if(articles.size()<2){
                            // si es categoria adulta
                            if(a.getCategoria().categoriaAdulta() == true){
                                    return false;
                            // si no es categoria adulta
                             }else{
                                    return true;
                             }
                        // si ha cogido el maximo
                        }else{
                             return false;
                        }

                    }

             }

         }
    //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="tearticle">
              public boolean teArticles(Article a){
                  /// si articulo a esta dentro del array de articles
                    if(articles.contains(a)){
                        return true;
                  /// si articulo no esta 
                    }else{
                        return false;
                    }
              }
    //</editor-fold>
                //<editor-fold defaultstate="collapsed" desc="agafaarticle">
                      public void agafaArticle(Article a){
                          // Miramos si este usuario tiene o no el articulo en la arraylist
                          if(teArticles(a) == false){
                                articles.add(a);
                          }else{
                                System.out.println("Este articulo ya lo has cogido");
                          }
                      }

                 //</editor-fold>
                      //<editor-fold defaultstate="collapsed" desc="retornaarticle">
                       public void retornaArticle(Article a){
                           // Miramos si la array contiene el articulo i lo sacamos de la lista
                          if(articles.contains(a)){
                              articles.remove(a);
                          }
                      }
                      //</editor-fold>
                       //<editor-fold defaultstate="collapsed" desc="tostring">
                       public String toString(){
                           return String.format(" con nombre: %s %s %s %n"
                                   + "Los articulos seleccionados: %s %n" , getNom(), getCognom1(), getCognom2(), getArticles()
                           );
                       }
//</editor-fold>
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="firma">
    protected abstract boolean isPrem();
    protected abstract boolean isAdulto();
//</editor-fold>

    

    

  
   
 
}
