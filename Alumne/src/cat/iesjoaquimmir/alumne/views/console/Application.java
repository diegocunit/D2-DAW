

package cat.iesjoaquimmir.alumne.views.console;
import cat.iesjoaquimmir.alumne.model.businesslayer.entities.Alumne;
import java.util.Scanner;



public class Application {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
   
      System.out.printf("1- Default 2- Alumne tot 3- Alumnenom 4- AlumneDNINOM  ");
        
         int resp = input.nextInt();
         
         switch (resp) {
         case 1:
            Alumnedef();
    break;
         case 2:
             Alumnetot();
    break;
         case 3:
             Alumnenom();
    break;
         case 4:
             AlumneDNINOM();
    break;
        
         }
     }
          private static void Alumnedef(){
 Alumne o1 = new Alumne();
 
 System.out.printf(" %s %n ", o1.getSalutacio());
 
          }
          private static void Alumnetot(){
            Scanner input = new Scanner(System.in);
           System.out.printf("Dime tu nombre: ");
  String nombre = input.next();
  
  System.out.printf("Dime tu dni: ");
  String dni = input.next();
  
  System.out.printf("Dame tu edat: ");
         int edat = input.nextInt();
         
         Alumne o2 = new Alumne(nombre, dni, edat);

   System.out.printf("%n %s %n ", o2.getSalutacio());
          }
          private static void Alumnenom(){
          
           Scanner input = new Scanner(System.in);
           System.out.printf("Dime tu nombre: ");
           String nombre = input.next();
           Alumne o3 = new Alumne(nombre);
           System.out.printf("%n %s %n ", o3.getSalutacio());
                  }
          
          private static void AlumneDNINOM(){
          
           Scanner input = new Scanner(System.in);
           System.out.printf("Dime tu DNI: ");
           String dni = input.next();
           System.out.printf("Dime tu Nombre: ");
           String nombre = input.next();
           Alumne o4 = new Alumne(nombre,dni);
           System.out.printf("%n %s %n ", o4.getSalutacio());
                  }


}

   
      

   





