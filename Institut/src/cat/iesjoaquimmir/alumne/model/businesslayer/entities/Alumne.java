
package cat.iesjoaquimmir.alumne.model.businesslayer.entities;
import java.util.ArrayList;

public class Alumne {

  
//<editor-fold defaultstate="collapsed" desc="atributs">
private int edat;
private String nombre;
private String dni;
private String primercognom;
private String segoncognom;
private Domicilio domicilio;
private String telefono;
private ArrayList<String> telefon = new ArrayList<String>();
private ArrayList<Modulos> modulos = new ArrayList<Modulos>();

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="statics">
 private static final String nombre1="Anonymous";
 private static final String dni1="0000000A";
 private static final int edat1=99;

    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="getters/setters">
    
 
 

    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(){
    this.telefono = telefono;
    }
    //<editor-fold defaultstate="collapsed" desc="edat">
      public int getEdat() {
        return edat;
    }
   
    public void setEdat(int edat) {
        this.edat = edat;
    }
//</editor-fold>
  

    //<editor-fold defaultstate="collapsed" desc="nombrecompleto">
     public String getDni() {
        return dni;
    }
     public void setDni(String dni) {
        
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }

     public String getPrimercognom() {
        return primercognom;
    }

   
    public String getSegoncognom() {
        return segoncognom;
    }
    public void setNombre(String nombre) {
        if(nombre == null){
         throw new NullPointerException("El nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }
    public void setPrimercognom(String primercognom) {
         if(primercognom == null){
         throw new NullPointerException("El apellido1 no puede ser nulo");
        }
        this.primercognom = primercognom;
    }
    
    public void setSegoncognom(String segoncognom) {
         if(segoncognom == null){
         throw new NullPointerException("El apellido2 no puede ser nulo");
        }
        this.segoncognom = segoncognom;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="arraylisttelefon">
    public ArrayList<String> getTelefon() {
        return telefon;
    }
       public void setTelefon(ArrayList telefon) {
         if(null == telefon){
         throw new NullPointerException("El telf no puede ser nulo");
        }
        this.telefon = telefon;
    }
    
//</editor-fold>
    
       //<editor-fold defaultstate="collapsed" desc="domicilio">
       public Domicilio getDomicilio(){
    return domicilio;
    }
    public void setDomicilio(Domicilio domicilio){
        this.domicilio = domicilio;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="modulos">
     public ArrayList<Modulos> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulos> modulos) {
        this.modulos = modulos;
    } 
   
//</editor-fold>
   
 
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="constructor">
    
    public Alumne(String nombre,String primercognom,String segoncognom,int edat, String dni, ArrayList telefon, Domicilio domicilio){
        this.setNombre(nombre);
        this.setPrimercognom(primercognom);
        this.setSegoncognom(segoncognom);
        this.setEdat(edat);
        this.setDni(dni);
        this.setTelefon(telefon);
        this.setDomicilio(domicilio);
    } 
     public Alumne(String nombre, String cognom1, String cognom2, int edat, String dni, String telefono, Domicilio dom1) {
      this.setNombre(nombre);
        this.setPrimercognom(primercognom);
        this.setSegoncognom(segoncognom);
        this.setEdat(edat);
        this.setDni(dni);
        this.setTelefon(telefon);
        this.setDomicilio(domicilio);
    }
    public Alumne(String nombre,String primercognom, String segoncognom){
        this.setNombre(nombre);
      
        this.setPrimercognom(primercognom);
          this.setSegoncognom(segoncognom);
    } 
   
    public Alumne(String nombre, String dni, int edat){
       
    this.setNombre(nombre);
    this.setDni(dni);
    this.setEdat(edat);
   
    }
    
    public Alumne (String nombre, String dni){
    
    this(nombre, dni, edat1);
    }
    
 
    public Alumne (String nombre){ 
    this(nombre,dni1);
    }
        
    public Alumne(ArrayList<String> telefon) {
       this.setTelefon(telefon);
    }

 /*public Alumne(ArrayList<Modulos> modulos) {
       this.setModulos(modulos);
       
    }*/
    
    public Alumne (){
    this(nombre1);
    }
    

    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="operadors">
    //<editor-fold defaultstate="collapsed" desc="salutacio">
      public String getSalutacio() {
        return String.format("Hola soc en %s amb el dni %s i amb %d anys", getNombre(), getDni(), getEdat());
    }
//</editor-fold>
    
      //<editor-fold defaultstate="collapsed" desc="mayoredat">
      /* public int getCompro(){
      if(getEdat() <= 18){
          return String.format("Tienes %d por eso eres menor de edat", getEdat());
      }else{
          return String.format("Tienes %d por eso eres mayor de edat", getEdat());
      }
      }*/
//</editor-fold>
      //<editor-fold defaultstate="collapsed" desc="nombrecompleto">
      public String getNombrecompleto(){
          return String.format("Soy %s %s %s , encantado", getNombre(), getPrimercognom(), getSegoncognom());
      }
//</editor-fold>
      
     
    
//</editor-fold>

   

   
    
    

    
   
    
  
}
