

package cat.iesjoaquimmir.alumne.views.console;
import cat.iesjoaquimmir.alumne.model.businesslayer.entities.Alumne;
import cat.iesjoaquimmir.alumne.model.businesslayer.entities.Domicilio;
import cat.iesjoaquimmir.alumne.model.businesslayer.entities.Modulos;
import java.util.Scanner;
import java.util.ArrayList;


public class Application {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     //<editor-fold defaultstate="collapsed" desc="MENU">
       System.out.printf("1- Default 2- Alumne tot 3- Alumnenom 4- AlumneDNINOM 5-AlumneNombrecompleto 6-Damedomicilio 7-dimesieresmayor 8-listastelf 9-listasmods ");
        
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
         case 5:
             AlumneNombrecompleto();
        break;
         case 6:
             Damedomicilio();
             break;
         case 7:
             Dimesieresmayor();
             break;
         case 8:
             damelista();
             break;
         case 9:
             damemodulos();
             break;
         }
//</editor-fold>
    
     }
     //<editor-fold defaultstate="collapsed" desc="Alumnedefault">
     private static void Alumnedef(){
            Alumne o1 = new Alumne();
            System.out.printf(" %s %n ", o1.getSalutacio());
 
          }
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="Alumnetot">
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
//</editor-fold>
      //<editor-fold defaultstate="collapsed" desc="Alumnenom">
       private static void Alumnenom(){
          
           Scanner input = new Scanner(System.in);
           System.out.printf("Dime tu nombre: ");
           String nombre = input.next();
           Alumne o3 = new Alumne(nombre);
           System.out.printf("%n %s %n ", o3.getSalutacio());
                  }
          
//</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="AlumneDNINOM">
       private static void AlumneDNINOM(){
          
           Scanner input = new Scanner(System.in);
           System.out.printf("Dime tu DNI: ");
           String dni = input.next();
           System.out.printf("Dime tu Nombre: ");
           String nombre = input.next();
           Alumne o4 = new Alumne(nombre,dni);
           System.out.printf("%n %s %n ", o4.getSalutacio());
                  }
//</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="nombrecompletoalumne">
       private static void AlumneNombrecompleto(){
          Scanner input = new Scanner(System.in);
    
                System.out.printf("Dime tu nombre:  ");
                     String nombre = input.next();
                 System.out.printf("Dime tu primer apellido:  ");
                    String cognom1 = input.next();
                 System.out.printf("Dime tu segundo apellido:  ");
                     String cognom2 = input.next();
                
            Alumne d1 = new Alumne(nombre,cognom1,cognom2);
               System.out.printf("%s %n", d1.getNombrecompleto());
          }
//</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="damedomicilio">
           private static void Damedomicilio(){
          Scanner input = new Scanner(System.in);
                  System.out.printf("Dime tu nombre:  ");
                     String nombre = input.next();
                 System.out.printf("Dime tu primer apellido:  ");
                    String cognom1 = input.next();
                 System.out.printf("Dime tu segundo apellido:  ");
                     String cognom2 = input.next();
                System.out.printf("Dime tu edad: ");
                    int edat = input.nextInt();
                System.out.printf("Dime tu dni: ");
                    String dni = input.next();
                System.out.printf("dime tu telefono: ");
                    String telefono = input.next();
                 System.out.printf("Dime tu calle:  ");
                    String calle = input.next();
                 System.out.printf("Dime el numero:");
                     int numero = input.nextInt();
                 System.out.printf("Dime tu piso:  ");
                     int pis = input.nextInt();
                 System.out.printf("Dime tu codigopostal:  ");
                     int codipostal = input.nextInt();
                 System.out.printf("Dime tu poblacion:  ");
                   String poblacion = input.next();
                System.out.printf("Dime tu provincia:  ");
                   String provincia = input.next();
                     
            Domicilio dom1 = new Domicilio(calle,numero,pis,codipostal,poblacion,provincia);
            Alumne al1 = new Alumne(nombre,cognom1,cognom2,edat,dni,telefono,dom1);
               System.out.printf("%s %n %s %n", al1.getNombrecompleto(), dom1.getDomiciliotio());
          }
//</editor-fold>
          
           //<editor-fold defaultstate="collapsed" desc="mayoredatomenor">
            private static void Dimesieresmayor(){
          Scanner input = new Scanner(System.in);
    
                System.out.printf("Dime tu nombre:  ");
                     String nombre = input.next();
                 System.out.printf("Dime tu edat : ");
                    int edat = input.nextInt();
                 
                
          /*  Alumne d5 = new Alumne(nombre,edat);
               System.out.printf("%s %s %n", d5.getNombre(), d5.getCompro());*/
          }
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="ARRAYS">
             private static void damelista(){
                ArrayList<String> telefon = new ArrayList<>();
                
                 Scanner input = new Scanner(System.in);
                 int numerotelef;
               
                 int i;
                 Alumne al10 = new Alumne(telefon);
                 System.out.printf("Quantos telefonos tienes?  ");
                 numerotelef = input.nextInt();
                    
                 for(i=1; i<=numerotelef; i++){
                    System.out.printf("Dime tu telefono %d %n: ", i);
                    telefon.add(input.next());
                 }
                 al10.setTelefon(telefon);
                 
                    System.out.printf("Tus telefonos son: %s %n", al10.getTelefon());
 }
             
             
                  private static void damemodulos(){
                       Scanner input = new Scanner(System.in);
                   int numeromod;
                 int i;
                 Alumne al11 = new Alumne();
                 System.out.printf("A quantos modulos te has matriculado?  ");
                 numeromod = input.nextInt();
                 ArrayList<Modulos> modulos = new ArrayList<Modulos>();
                
                 for(i=1; i<=numeromod; i++){
                    System.out.printf("Dime el nombre del modulo %d: ", i);
                    String nombremod = input.next();
                    System.out.printf("Dime la descripcion del modulo %d: ", i);
                    String descripcion = input.next();
                    System.out.printf("Dime la durada del modulo %d: ", i);
                    int hores = input.nextInt();
                    Modulos m1 = new Modulos(nombremod,descripcion,hores);
                    System.out.printf("%n Modulo : %s %s %d Guardado %n", m1.getNombremod(), m1.getDescripcion(), m1.getHores());
                    modulos.add(m1);
                 }
                al11.setModulos(modulos);
                 System.out.printf("Tus modulos son: %s", al11.getModulos());
                  }
//</editor-fold>

          
          

}

   
      

   





