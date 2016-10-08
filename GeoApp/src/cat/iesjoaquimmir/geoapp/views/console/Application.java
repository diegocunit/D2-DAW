

package cat.iesjoaquimmir.geoapp.views.console;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Circle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Sphere;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
import java.util.Scanner;
import java.util.Random;
public class Application {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Cerlce 2- Quadrat 3- Rectangle 4- Esfera 5- ColoreS ");
        
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
         case 5:
             Color();
         }
         
     }
     
        private static void square(){
             Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Sense SC 2- Amb SC ");
        
         int resp = input.nextInt();
         switch(resp){
             case 1:
     Square c1 = new Square(10.0);
           
        
         System.out.printf("El costat de c1: %.2f %n", c1.getSide());
         System.out.printf("El perimetre de c1: %.2f %n", c1.getPerimeter());
         System.out.printf("L'area de c1: %.2f %n", c1.getArea());
     break;
             case 2:
      Square c2 = new Square();
         System.out.printf("El costat de c1: %.2f %n", c2.getSide());
         System.out.printf("El perimetre de c1: %.2f %n", c2.getPerimeter());
         System.out.printf("L'area de c1: %.2f %n", c2.getArea());
     break;
         }
     
    
}
     
     
     private static void circle(){
Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Sense SC 2- Amb SC ");
        
         int resp = input.nextInt();
         switch(resp){
             case 1:
          Circle c2 = new Circle(5.0);
         
             System.out.printf("El Radio de c2: %.2f %n", c2.getRadius());
             System.out.printf("El perimetro de c2: %.2f %n", c2.getPerimeter());
                 
         break;
             case 2:
                 Circle c3 = new Circle();
            System.out.printf("El Radio de c2: %.2f %n", c3.getRadius());
             System.out.printf("El perimetro de c2: %.2f %n", c3.getPerimeter());
                 
         break;
         }
     

}
    
     
     private static void sphere(){
Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Sense SC 2- Amb SC ");
        
         int resp = input.nextInt();
         
          switch(resp){
             case 1:
        Sphere c3 = new Sphere(5.0);

                System.out.printf("El Radio de c3: %.2f %n", c3.getRadio());
                System.out.printf("El volumen de c3: %.2f %n", c3.getVolumen());
                System.out.printf("El area de c3: %.2f %n", c3.getArea());
                break;
          
          case 2:
          
           Sphere c4 = new Sphere();

                System.out.printf("El Radio de c3: %.2f %n", c4.getRadio());
                System.out.printf("El volumen de c3: %.2f %n", c4.getVolumen());
                System.out.printf("El area de c3: %.2f %n", c4.getArea());
                break;
          }
}
     
     
     private static void Rectangle(){
Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Sense SC 2- Amb SC ");
        
         int resp = input.nextInt();
         
          switch(resp){
             case 1:
Rectangle c4 = new Rectangle(10.0,6.0);
 
 
  
  System.out.printf("La base de c4: %.2f %n", c4.getBase());
   System.out.printf("La altura de c4: %.2f %n", c4.getHeight());
  System.out.printf("El area de c4: %.2f %n", c4.getArea());
   System.out.printf("El perimetro de c4: %.2f %n", c4.getPerimetro());
   break;
          
             case 2:
         
          Rectangle c5 = new Rectangle();

  System.out.printf("La base de c5: %.2f %n", c5.getBase());
   System.out.printf("La altura de c5: %.2f %n", c5.getHeight());
  System.out.printf("El area de c5: %.2f %n", c5.getArea());
   System.out.printf("El perimetro de c5: %.2f %n", c5.getPerimetro());
   break;
          }
          
}
     
     
    
  
     
     public static void Color(){
     
         Scanner input = new Scanner(System.in);
     
         System.out.printf("%n 1- co1-colornormal 2- co2-HexString 3- co2-toHexString 4- co3-Random 5- Contador ob 6- co5-ToRGB%n");
        
         int resp = input.nextInt();
         
         switch (resp) {
             
         case 1:
            Color co1 = new Color(125,125,Color.MAX_VALUE);
        System.out.printf("%n co1 red: %d green: %d blue: %d %n", co1.getRed(), co1.getGreen(), co1.getBlue());
    break;
         case 2:
             Color co2 = Color.fromHexString("#FFFFFF");
             System.out.printf("Co2 red %d green: %d blue: %d %n", co2.getRed(), co2.getBlue(), co2.getGreen());
    break;
         case 3:
              Color co3 = new Color (50,80,110);
               System.out.printf("co2 -> %s %n", co3.toHexString());
               System.out.printf("co2 -> %s %n", co3.toHexString(false));
    break;
         case 4:
             Color co4 = Color.getRandom();
        
              System.out.printf("El numero random es: %d %d %d %n", co4.getRed(), co4.getBlue(), co4.getGreen() );
    break;
         case 5:
              System.out.printf("El numero de colors creat son: %d %n", Color.getCounter());
    break;
         case 6:
             Color co5 = new Color (69,50,100);
             System.out.printf("El numero en RGB es: %s %n", co5.toRGBString());
    break;
             
              
  
         }
         
     }
         
         
         
         
         
    
   
       
     
        
 
     
     
  
}



