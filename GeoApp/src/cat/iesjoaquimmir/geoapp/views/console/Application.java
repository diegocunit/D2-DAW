/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.views.console;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Circle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Sphere;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Rectangle;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Application {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Cerlce 2- Quadrat 3- Rectangle 4- Esfera ");
        
         int resp = input.nextInt();
         
         switch (resp) {
         case 1:
            square();
    break;
         case 2:
             circle();
    break;
         case 3:
             Rectangle();
    break;
         case 4:
             sphere();
    break;
         }
         
     }

     private static void square(){
     Square c1 = new Square(10.0);
           
        
         System.out.printf("El costat de c1: %.2f %n", c1.getSide());
         System.out.printf("El perimetre de c1: %.2f %n", c1.getPerimeter());
         System.out.printf("L'area de c1: %.2f %n", c1.getArea());
     
     
     
     
}
     
     
     private static void circle(){

Circle c2 = new Circle(5.0);

  
  
  System.out.printf("El Radio de c2: %.2f %n", c2.getRadius());
   System.out.printf("El perimetro de c2: %.2f %n", c2.getPerimeter());
}
    
     
     private static void sphere(){

Sphere c3 = new Sphere(5.0);


  
  System.out.printf("El Radio de c3: %.2f %n", c3.getRadio());
  System.out.printf("El volumen de c3: %.2f %n", c3.getVolumen());
  System.out.printf("El area de c3: %.2f %n", c3.getArea());
}
     
     
     private static void Rectangle(){

Rectangle c4 = new Rectangle(10.0,6.0);
 
 
  
  System.out.printf("La base de c4: %.2f %n", c4.getBase());
   System.out.printf("La altura de c4: %.2f %n", c4.getHeight());
  System.out.printf("El area de c4: %.2f %n", c4.getArea());
   System.out.printf("El perimetro de c4: %.2f %n", c4.getPerimetro());
}
}



