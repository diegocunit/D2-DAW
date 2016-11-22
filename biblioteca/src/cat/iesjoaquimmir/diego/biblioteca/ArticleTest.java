
package cat.iesjoaquimmir.diego.biblioteca;

import cat.iesjoaquimmir.diego.biblioteca.articles.Article;
import cat.iesjoaquimmir.diego.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia.CD;
import cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia.DVD;
import cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio.Llibres;
import cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio.Revista;
import java.util.ArrayList;
import java.util.Scanner;





public class ArticleTest {
     public static void main(String[] args) {
        
        int i;
    ArrayList<Article> articles = new ArrayList<>();
    
    //<editor-fold defaultstate="collapsed" desc="cd">
    CD c1 = new CD ("Mis grandes exitos", "Luis Miguel", Categoria.adult, 65, "0490000412");
         articles.add(c1);
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="dvd">
 DVD d1 = new DVD ("Bamby", "Walt diseny", Categoria.infantil, 89, "9005065408");
        articles.add(d1);
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="revista">

    Revista r1 = new Revista ("Patufet", "yo", Categoria.infantil, 87, "80002122s");
        articles.add(r1);
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="llibre">
 Llibres ll1 = new Llibres ("Tina Super Bruixa", "Enid Blyton", Categoria.juvenil, 467, "34524656");
        articles.add(ll1);
//</editor-fold>
    
   
        for(i=0; i<articles.size();i++){
            System.out.printf("%s %n %n", articles.toString());
        }
     }
}
