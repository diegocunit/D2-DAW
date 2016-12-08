
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
                 menuusuarios();
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
     //<editor-fold defaultstate="collapsed" desc="Menu">
         private static void menuusuarios(){
         
         Scanner input = new Scanner(System.in);
         
          System.out.printf("1- Agregar usuarios 2-  articulo a usuario 4- Quitar articulo");
        
         int resp = input.nextInt();
         
         switch (resp) {
             case 1:
                 agregarusuarios();
                 break;
             case 2:
                 
                 break;
             case 3: 
               /*  cogerarticulo();
                 break;
             case 4:
                 tengoarticulo();
                 break;
             case 5:
                 quitararticulo();
                 break;*/
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
                     puedocoger(usuariPremium);
                 break;
             case 2:
                      Adult usuariNormal = new Adult("498878214M", false, "Paco", "Soler", "Picasso");
                      usuarios.add(usuariNormal);
                      puedocoger(usuariNormal);
                 break;
             case 3: 
                    Adult usuarioPrem = new Adult("47956779p", true, "Diego", "Mejias", "Ruiz");
                    Menor usuariMenorPremium = new Menor(usuarioPrem, "Pedro", "Garcia", "Saez");
                    usuarios.add(usuariMenorPremium);
                    puedocoger(usuariMenorPremium);
                 break;
             case 4:
                  Adult usuarioNorm = new Adult("498878214M", false, "Diego", "Mejias", "Martinez");
                  Menor usuariMenorNormal = new Menor(usuarioNorm, "Paulo", "Lopez", "Moliere");
                  usuarios.add(usuariMenorNormal);
                  puedocoger(usuariMenorNormal);
                 break;
             
         }
         
     }
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="puedocoger">
         private static void puedocoger(Usuari usuario){
            int i;
            int resp = 0;
            
            ArrayList<Article> articles = new ArrayList<>();
            Scanner input = new Scanner(System.in);
        //<editor-fold defaultstate="collapsed" desc="articulos">
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
//</editor-fold>
                System.out.printf("LISTA DE ARTICULOS %n %n %s %n %n", articles.toString());
                System.out.printf("La descripcion del usuario es: %s %n %n",usuario.toString());
        
        do{
            System.out.println("Quieres coger un articulo o salir? 1 o 0");
            resp = input.nextInt();
        
            System.out.printf("Que articulo quieres coger? 1: CD - 2: DVD - 3: Revista - 4: Llibre 0: SALIR %n");
            int opcion = input.nextInt();
           
             switch (opcion) {
             case 1:
                    System.out.printf("La categoria de este articulo es adulta?: %s %n", c1.getCategoria().categoriaAdulta());
                    agafararticle(usuario, c1);
                 break;
             case 2:
                    System.out.printf("La categoria de este articulo es adulta?: %s %n", d1.getCategoria().categoriaAdulta());
                    agafararticle(usuario, d1);
                 break;
             case 3: 
                    System.out.printf("La categoria de este articulo es adulta?: %s %n", r1.getCategoria().categoriaAdulta());
                    agafararticle(usuario, r1);
                 break;
             case 4:
                    System.out.printf("La categoria de este articulo es adulta?: %s %n", ll1.getCategoria().categoriaAdulta());
                    agafararticle(usuario, ll1);
                 break;
           
         }
            
           
        }while(resp != 0);

       
  
        }
         
         
         private static void agafararticle(Usuari usuario, Article a){
         if(usuario.potAgafarArticle(a) && usuario.teArticles(a) == false){
             usuario.agafaArticle(a);
             System.out.printf("Has agregado el articulo a usuario!! %n");
             System.out.printf("Tienes esta lista de articulos: %s %n ", usuario.getArticles());
         }else{
             System.out.printf("No puedes coger este articulo!! %n %n");
         }
             
         }
//</editor-fold>
}
