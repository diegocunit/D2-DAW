
package cat.iesjoaquimmir.diego.biblioteca;

import cat.iesjoaquimmir.diego.biblioteca.Biblioteca.Biblioteca;
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


public class BibliotecaTest {
    public static void main(String[] args) {
        ArrayList<Usuari> usuaris = carregaUsuaris();
	ArrayList<Article> articles = carregaArticles();
		
	Biblioteca biblioteca = new Biblioteca(usuaris, articles);
		
	while(biblioteca.inici());    
    }
    
    private static ArrayList<Usuari> carregaUsuaris() {
        Adult usuariPremium = new Adult("498878974K", true, "Pepe", "Carrasco", "Coronado");
	Adult usuariNormal = new Adult("498878214M", false, "Paco", "Soler", "Picasso");
        Menor usuariMenorPremium = new Menor(usuariPremium, "Pedro", "Garcia", "Saez");
	Menor usuariMenorNormal = new Menor(usuariNormal, "Paulo", "Lopez", "Moliere");		
	
        ArrayList<Usuari> usuaris = new ArrayList<Usuari>();
	usuaris.add(usuariPremium);
        usuaris.add(usuariNormal);
        usuaris.add(usuariMenorPremium);
        usuaris.add(usuariMenorNormal);
        
        return usuaris;
    }
	
    private static ArrayList<Article> carregaArticles() {
        
        CD a0 = new CD ("Mis grandes exitos", "Luis Miguel", Categoria.adult, 65, "0490000412");
	DVD a1 = new DVD("Bamby", "Walt Disney",Categoria.infantil,89,"90843089" );
	DVD a2 = new DVD("Crepusculo", "Warner",Categoria.juvenil,129,"480980983");
	Llibres a3 = new Llibres("Ulises", "James Joyce",Categoria.adult,456,"940943322");
	Llibres a4 = new Llibres("Tina Super Bruixa", "Enid Blyton",Categoria.juvenil,456,"342090233" );
	Revista a5 = new Revista("Patufet", "Ed. Infantil",Categoria.infantil , 87,"80002122" );

	ArrayList<Article> articles = new ArrayList<Article>();
	articles.add(a0);
        articles.add(a1);
	articles.add(a2);
        articles.add(a3);
        articles.add(a4);
        articles.add(a5);
	return articles;
    }
    
  
}
