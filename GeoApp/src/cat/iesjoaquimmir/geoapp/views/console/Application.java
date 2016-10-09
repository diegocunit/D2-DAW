

package cat.iesjoaquimmir.geoapp.views.console;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Circle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Sphere;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.General;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.AlphaColor;
import java.util.Scanner;
import java.util.Random;
public class Application {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Quadrat 2- Cerlce 3-Rectangle  4-Esfera 5- ColoreS 6- ALPHA COLOR ");
        
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
     break;
         case 6:
             alfa();
             
         }
         
     }
     
        private static void square(){
             Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Sense SC 2- Amb SC 3- BGCOLOR y Alpha ");
        
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
             case 3:
//<editor-fold defaultstate="collapsed" desc="crearcolores">
                 System.out.printf("Dame el alpha:");
                 int valalph = input.nextInt();
        AlphaColor co1 = new AlphaColor(valalph,Color.MAX_VALUE,Color.MAX_VALUE,Color.MAX_VALUE);
        AlphaColor co2 = new AlphaColor (Color.MIN_VALUE,Color.MIN_VALUE,Color.MIN_VALUE);;

//</editor-fold>
            
                 
         System.out.printf("Dame el side: ");
        
         int tamaño = input.nextInt();
                 
      Square c3 = new Square(tamaño,co1,co2);
      
         System.out.printf("El costat de c3: %.2f %n", c3.getSide());
         System.out.printf("El perimetre de c3: %.2f %n", c3.getPerimeter());
         System.out.printf("L'area de c3: %.2f %n", c3.getArea());
         System.out.printf("L'area de c3: %.2f %n", c3.getArea());
         System.out.printf("El color de BGCOLOR ES: %s %n ", c3.getBackgroundColor().toHexString());
         System.out.printf("El color de FGCOLOR ES: %d %d %d %n ", c3.getForegroundColor().getBlue(), c3.getForegroundColor().getGreen(), c3.getForegroundColor().getBlue());
         System.out.printf("El alpha es: %.2f %n ", co1.getAlpha());
         System.out.printf("%n Con String: %n %s ", c3.toString());
         break;
         
        
                 
         }
         
         
     
    
}
     
     
     private static void circle(){
Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Sense SC 2- Amb SC  3-BGCOLOR i Alpha");
        
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
             case 3:
              //<editor-fold defaultstate="collapsed" desc="crearcolores">
        AlphaColor co1 = new AlphaColor(Color.MAX_VALUE,Color.MAX_VALUE,Color.MAX_VALUE);
        AlphaColor co2 = new AlphaColor(Color.MIN_VALUE,Color.MIN_VALUE,Color.MIN_VALUE);;

//</editor-fold>
               System.out.printf("Dame el radio: ");
               
         int radio = input.nextInt();
             
        
         
      Circle c4 = new Circle(radio,co1,co2);
      
         System.out.printf("El costat de c4: %.2f %n", c4.getRadius());
         System.out.printf("El perimetre de c4: %.2f %n", c4.getPerimeter());
         System.out.printf("L'area de c4: %.2f %n", c4.getArea());
         System.out.printf("L'area de c4: %.2f %n", c4.getArea());
         System.out.printf("El color de BGCOLOR ES: %s %n ", c4.getBackgroundColor().toHexString());
         System.out.printf("El color de FGCOLOR ES: %d %d %d %n ", c4.getForegroundColor().getBlue(), c4.getForegroundColor().getGreen(), c4.getForegroundColor().getBlue());
                 
          break;
         }
     

}
    
     
     private static void sphere(){
Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Sense SC 2- Amb SC 3-BGCOLOR i Alpha ");
        
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
          case 3:
              //<editor-fold defaultstate="collapsed" desc="crearcolores">
        AlphaColor co1 = new AlphaColor(Color.MAX_VALUE,Color.MAX_VALUE,Color.MAX_VALUE);
        Color co2 = Color.fromHexString("#FFFFFF");

//</editor-fold>
         Sphere c5 = new Sphere();

                System.out.printf("El Radio de c3: %.2f %n", c5.getRadio());
                System.out.printf("El volumen de c3: %.2f %n", c5.getVolumen());
                System.out.printf("El area de c3: %.2f %n", c5.getArea());
                System.out.printf("El color de BGCOLOR ES: %s %n ", c5.getBackgroundColor().toHexString());
                System.out.printf("El color de FGCOLOR ES: %d %d %d %n ", c5.getForegroundColor().getBlue(), c5.getForegroundColor().getGreen(), c5.getForegroundColor().getBlue());
                
                break;
          }
}
     
     
     private static void Rectangle(){
Scanner input = new Scanner(System.in);
     
         System.out.printf("1- Sense SC 2- Amb SC 3-BGCOLOR ");
        
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
       case 3:
            Rectangle c6 = new Rectangle();
              //<editor-fold defaultstate="collapsed" desc="crearcolores">
        AlphaColor co1 = new AlphaColor(1.0,Color.MAX_VALUE,Color.MAX_VALUE,Color.MAX_VALUE);
        Color co2 = Color.fromHexString("#FFFFFF");

//</editor-fold>
        
         System.out.printf("La base de c5: %.2f %n", c6.getBase());
   System.out.printf("La altura de c5: %.2f %n", c6.getHeight());
  System.out.printf("El area de c5: %.2f %n", c6.getArea());
   System.out.printf("El perimetro de c5: %.2f %n", c6.getPerimetro());
   System.out.printf("El color de BGCOLOR ES: %s %n ", c6.getBackgroundColor().toHexString());
         System.out.printf("El color de FGCOLOR ES: %d %d %d %n ", c6.getForegroundColor().getBlue(), c6.getForegroundColor().getGreen(), c6.getForegroundColor().getBlue());
                
        break;
          }
          
}
     
     
    
  
     
     public static void Color(){
     
         Scanner input = new Scanner(System.in);
     
         System.out.printf("%n 1- co1-colornormal 2- co2-HexString 3- co2-toHexString 4- co3-Random 5- Contador ob 6- co5-ToRGB%n");
        
         int resp = input.nextInt();
         
         switch (resp) {
             
         case 1:
            AlphaColor co1 = new AlphaColor(1.0,125,125,Color.MAX_VALUE);
        System.out.printf("%n co1 red: %d green: %d blue: %d %n", co1.getRed(), co1.getGreen(), co1.getBlue());
        System.out.printf("El AlphaColor es: %s %n",co1.toRGBString());
        
    break;
         case 2:
             /*AlphaColor co2 = new AlphaColor.fromHexString("#FFFFFF");
             System.out.printf("Co2 red %d green: %d blue: %d %n", co2.getRed(), co2.getBlue(), co2.getGreen());
             System.out.printf("El AlphaColor es: %s %n",co2.toRGBString());*/
    break;
         case 3:
              AlphaColor co3 = new AlphaColor (1,50,80,110);
               System.out.printf("co2 -> %s %n", co3.toHexString());
               System.out.printf("co2 -> %s %n", co3.toHexString(false));
    break;
         case 4:
             Color co4 = Color.getRandom();
        
              System.out.printf("El numero random es: %d %d %d %n", co4.getRed(), co4.getBlue(), co4.getGreen() );
    break;
         case 5:
              System.out.printf("El numero de colors creat son: %d %n", AlphaColor.getCounter());
    break;
         case 6:
             AlphaColor co5 = new AlphaColor(0.8,69,50,100);
             System.out.printf("El numero en RGB es: %s %n", co5.toRGBString());
    break;
             
              
  
         }
         
     }
         
         
          
         
    
   private static void alfa(){
       
     
          Scanner input = new Scanner(System.in);
     
         System.out.printf("- Dime la opacidad ");
        
         int opacidad = input.nextInt();
         
         AlphaColor alp = new AlphaColor (opacidad,Color.MAX_VALUE,Color.MAX_VALUE,Color.MAX_VALUE);
            System.out.printf("El numero es: %d %d %d %n", alp.getRed(), alp.getBlue(), alp.getGreen() );
             System.out.printf("El numero en RGB es: %s %n", alp.toRGBString());
             System.out.printf("El numero en Hex string %s %n", alp.toHexString());
             System.out.printf("El numero en Hex string %s %n", alp.toHexString(false));
             System.out.printf("La opacidad es: %.2f %n", alp.getAlpha());
             System.out.printf("El numero de objetos es: %d %n", alp.getCounter());
    
   }
       
     
        
 
     
     
  
}



