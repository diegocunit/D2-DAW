
package cat.iesjoaquimmir.diego.biblioteca;

import cat.iesjoaquimmir.diego.biblioteca.articles.Article;
import cat.iesjoaquimmir.diego.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia.CD;
import cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia.DVD;
import cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio.Llibres;
import cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio.Revista;
import cat.iesjoaquimmir.diego.bilbioteca.usuaris.adults.Adult;
import cat.iesjoaquimmir.diego.bilbioteca.usuaris.menors.Menor;
import cat.iesjoaquimmir.diego.bilbioteca.usuaris.Usuari;
import java.util.ArrayList;
import java.util.Scanner;





public class ArticleTest {
     public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
     
         //<editor-fold defaultstate="collapsed" desc="menu">
          System.out.printf("1- Agregar articulos 2- Agregar usuarios");
        
         int resp = input.nextInt();
         
         switch (resp) {
             case 1:
                 crearatriculos();
             case 2:
                 crearusuarios();
         }
//</editor-fold>
      
         
}
     //<editor-fold defaultstate="collapsed" desc="crear articulos">
     private static void crearatriculos(){
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
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="crearusuarios">
         private static void crearusuarios(){
         
         Scanner input = new Scanner(System.in);
         
          System.out.printf("1- Agregar usuarios 2- Puedocoger? 3- Coger articulo 4- Tengo el articulo? 4- Quitar articulo");
        
         int resp = input.nextInt();
         
         switch (resp) {
             case 1:
                 agregarusuarios();
                 break;
             case 2:
                 puedcoger();
                 break;
             case 3: 
                 cogerarticulo();
                 break;
             case 4:
                 tengoarticulo();
                 break;
             case 5:
                 quitararticulo();
                 break;
         }
         
       
         
          
     }
//</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="agregarusuarios">
         private static void agregarusuarios(){
             Scanner input = new Scanner(System.in);
             
          System.out.printf("1- Adult usuariPremium 2- Adult usuariNormal 3- Menor usuariMenorPremium 4-  Menor usuariMenorNormal");
          
         int resp = input.nextInt();
         ArrayList<Usuari> usuarios = new ArrayList<>();
         switch (resp) {
             case 1:
                     Adult usuariPremium = new Adult("498878974K", true, "Pepe", "Carrasco", "Coronado");
                     usuarios.add(usuariPremium);
                 break;
             case 2:
                 Adult usuariNormal = new Adult("498878214M", false, "Paco", "Soler", "Picasso");
            usuarios.add(usuariNormal);
                 break;
             case 3: 
                  Adult usuarioPrem = new Adult("47956779p", true, "Diego", "Mejias", "Ruiz");
                Menor usuariMenorPremium = new Menor(usuarioPrem, "Pedro", "Garcia", "Saez");
            usuarios.add(usuariMenorPremium);
                 break;
             case 4:
                  Adult usuarioNorm = new Adult("498878214M", false, "Diego", "Mejias", "Martinez");
                 Menor usuariMenorNormal = new Menor(usuarioNorm, "Paulo", "Lopez", "Moliere");
            usuarios.add(usuariMenorNormal);
                 break;
             
         }
     
          
      
      
      
      
      
           
     }
//</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="puedocoger">
         private static void puedocoger(){
             int i;
              Scanner input = new Scanner(System.in);
             ArrayList<Article> articles = new ArrayList<>();
             for(i=0; i<articles.size();i++){
            System.out.printf("%s %n %n", articles.toString());
             }
             System.out.println("Escoge un articulo de los vistos");
                 
           Usuari.potAgafarArticle(d1);
         }
//</editor-fold>
}
