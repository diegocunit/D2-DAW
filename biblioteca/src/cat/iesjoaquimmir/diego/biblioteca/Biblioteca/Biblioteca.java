
package cat.iesjoaquimmir.diego.biblioteca.Biblioteca;

import cat.iesjoaquimmir.diego.biblioteca.BibliotecaTest;
import cat.iesjoaquimmir.diego.biblioteca.articles.Article;
import cat.iesjoaquimmir.diego.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia.CD;
import cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia.DVD;
import cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio.Llibres;
import cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio.Revista;
import cat.iesjoaquimmir.diego.bilbioteca.usuaris.Usuari;
import cat.iesjoaquimmir.diego.bilbioteca.usuaris.adults.Adult;
import cat.iesjoaquimmir.diego.bilbioteca.usuaris.menors.Menor;
import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca {
//<editor-fold defaultstate="collapsed" desc="atributs">
     private ArrayList<Article> articles;
     private ArrayList<Usuari> usuaris;
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="getters/setters">
      public ArrayList<Article> getArticles() {
        return articles;
    }

    private void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

  
    public ArrayList<Usuari> getUsuaris() {
        return usuaris;
    }

   
    private void setUsuaris(ArrayList<Usuari> usuaris) {
        this.usuaris = usuaris;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
    public Biblioteca(ArrayList<Usuari> usuaris, ArrayList<Article> articles) {
        this.setUsuaris(usuaris);
        this.setArticles(articles);
    }
    public Biblioteca(){
        this(new ArrayList<Usuari>(), new ArrayList<Article>());
    }
//</editor-fold>

    public boolean inici() {
       Scanner input = new Scanner(System.in);
     
          System.out.printf("1- Agafar 2- Retornar 3- Mostrar usuaris 4- Mostrar articles 5- Salir: ");
         int resp = input.nextInt();
         
         switch (resp) {
             case 1:
                    System.out.printf("%s %n %n", getUsuaris().toString());
                
                  
                  System.out.printf("Seleccionar usuario: 1- Pepe Carrasco 2- Paco Soler 3- Pedro Garcia 4- Paulo Lopez 5- Salir: ");
                  int usuario = input.nextInt();
                  if(usuario>=0 && usuario<=6){
                  switch(usuario){
                      case 1:
                          agafar(getUsuaris().get(usuario));
                          break;
                      case 2:
                          agafar(getUsuaris().get(usuario));
                          break;
                      case 3:
                          agafar(getUsuaris().get(usuario));
                          break;
                      case 4:
                           agafar(getUsuaris().get(usuario));
                          break;
                      case 5:
                          return false;
                  }
                  }else{
                       System.out.printf("Dime una opcion correcta %n");
                  }
                
              break;
             case 2:
                 System.out.printf("Seleccionar usuario: 1- Pepe Carrasco 2- Paco Soler 3- Pedro Garcia 4- Paulo Lopez 5- Salir: ");
                   usuario = input.nextInt();
                  if(usuario>=0 && usuario<=6){
                  switch(usuario){
                      case 1:
                          retornar(getUsuaris().get(usuario));
                          break;
                      case 2:
                          retornar(getUsuaris().get(usuario));
                          break;
                      case 3:
                          retornar(getUsuaris().get(usuario));
                          break;
                      case 4:
                           retornar(getUsuaris().get(usuario));
                          break;
                      case 5:
                          return false;
                  }
                  }else{
                       System.out.printf("Dime una opcion correcta %n");
                  }
             break;
             case 3:
                 mostrarusu();
             break;
             case 4:
                 mostrararti();
             break;
             case 5:
                 return false;
           
         }
    
         return true;
    }
    
   public boolean agafar(Usuari usuario){
       
   Scanner input = new Scanner(System.in);
   int resp=0;
   int i;
   //<editor-fold defaultstate="collapsed" desc="menu">
   do{
            System.out.println("Quieres coger un articulo o salir? 1 o 0");
            resp = input.nextInt();
                System.out.printf("%s %n %n", getArticles().toString());
                
            System.out.printf("Que articulo quieres coger? 1: CD - 2: DVD - 3: Revista - 4: Llibre 0: SALIR %n");
            int opcion = input.nextInt();
//</editor-fold>
         
             switch (opcion) {
             case 1:
                    if(usuario.potAgafarArticle(getArticles().get(opcion)) && usuario.teArticles(getArticles().get(opcion)) == false){
                          usuario.agafaArticle(getArticles().get(opcion));
                          System.out.printf("Has agregado el articulo a usuario!! %n");
                          return true;
                   }else{
                      System.out.printf("No puedes coger este articulo!! %n %n");

                      return false;
                     }
            
             case 2:
                    if(usuario.potAgafarArticle(getArticles().get(opcion)) && usuario.teArticles(getArticles().get(opcion)) == false){
                          usuario.agafaArticle(getArticles().get(opcion));
                          System.out.printf("Has agregado el articulo a usuario!! %n");
                          return true;
                   }else{
                        System.out.printf("No puedes coger este articulo!! %n %n");

                        return false;
                     }
                
             case 3: 
                   if(usuario.potAgafarArticle(getArticles().get(opcion)) && usuario.teArticles(getArticles().get(opcion)) == false){
                          usuario.agafaArticle(getArticles().get(opcion));
                          System.out.printf("Has agregado el articulo a usuario!! %n");
                          return true;
                   }else{
                            System.out.printf("No puedes coger este articulo!! %n %n");
                            return false;
                     }
                
               case 4:
                   if(usuario.potAgafarArticle(getArticles().get(opcion)) && usuario.teArticles(getArticles().get(opcion)) == false){
                          usuario.agafaArticle(getArticles().get(opcion));
                          System.out.printf("Has agregado el articulo a usuario!! %n");
                           return true;
                   }else{
                      System.out.printf("No puedes coger este articulo!! %n %n");

                      return false;
                     }
                    }
            
           
        }while(resp!=0);
            
       return true;
   }

    private void retornar(Usuari usuario) {
        /*if(usuario.contiene(articles, usuaris)){
            System.out.printf("Estos son los articulos que has seleccionados", getArticles());
        }*/
    }

    private void mostrarusu() {
        int i;
       
            System.out.printf("%s %n %n", getUsuaris().toString());
        
    }

    private void mostrararti() {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.printf("Que articulos quieres ver: 1- Todos 2- Disponibles 3- No disponibles");
         int ver = input.nextInt();
         switch(ver){
             case 1:
                
                    System.out.printf("%s %n %n", getArticles().toString());
                 
         break;
             case 2:
                
               if(!usuaris.contains(articles)){
                   System.out.printf("Estos son los articulos disponibles: %s %n",getArticles().toString());
               }
         break;
             case 3:
                  if(!usuaris.contains(articles)){
                        System.out.printf("Estos son los articulos no disponibles:  %s %n",getArticles().toString());
                     }else{
                        System.out.printf("No hay articulos seleccionados %n");          
                    } 
        break;
                 
       }
    
    }
   
    
}
