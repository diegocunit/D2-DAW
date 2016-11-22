/*
package cat.iesjoaquimmir.diego.biblioteca;

import cat.iesjoaquimmir.diego.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia.CD;
import cat.iesjoaquimmir.diego.biblioteca.articles.Multimedia.DVD;
import cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio.Llibres;
import cat.iesjoaquimmir.diego.biblioteca.articles.Publicacio.Revista;
import java.util.Scanner;


public class Biblioteca {

  
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       
        
         System.out.printf("Què vols introduir?  1- Revista 2-Llibre 3-DVD 4-CD : ");
         int resp = input.nextInt();
          switch (resp) {
         case 1:
            revista();
    break;
         case 2:
             llibre();
    break;
         case 3:
             dvd();
    break;
         case 4:
             cd();
    break;
          }
     
     
    }
    //<editor-fold defaultstate="collapsed" desc="revista">
    private static void revista() {
         
        Revista r1 = new Revista ("Patufet", "yo", Categoria.infantil, 87, "80002122s");
       System.out.printf("%s %n", r1.toString());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="llibre">
    private static void llibre() {
         
        Llibres ll1 = new Llibres ("Tina Super Bruixa", "Enid Blyton", Categoria.juvenil, 467, "34524656");
        System.out.printf("%s %n", ll1.toString());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="dvd">
      private static void dvd() {
          
        DVD d1 = new DVD ("Bamby", "Walt diseny", Categoria.infantil, 89, "9005065408");
        System.out.printf("%s %n", d1.toString());
      }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="cd">
       private static void cd() {
        CD c1 = new CD ("Mis grandes exitos", "Luis Miguel", Categoria.adult, 65, "0490000412");
       System.out.printf("%s %n", c1.toString());
       }
//</editor-fold>
  
    
}
*/