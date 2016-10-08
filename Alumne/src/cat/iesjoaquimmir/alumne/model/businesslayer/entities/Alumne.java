/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumne.model.businesslayer.entities;


public class Alumne {

  
//<editor-fold defaultstate="collapsed" desc="atributs">
private int edat;
private String nombre;
private String dni;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="statics">
 private static final String nombre1="Anonymous";
 private static final String dni1="0000000A";
 private static final int edat1=99;
   
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="getters/setters">
  public String getDni() {
        return dni;
    }

    
    public int getEdat() {
        return edat;
    }

  
    public String getNombre() {
        return nombre;
    }

   
    public void setDni(String dni) {
        this.dni = dni;
    }

   
    public void setEdat(int edat) {
        this.edat = edat;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="constructor">
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
    
    
    public Alumne (){
    this(nombre1);
    }
    
   
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="operadors">
    
      public String getSalutacio() {
        return String.format("Hola soc en %s amb el dni %s i amb %d anys", getNombre(), getDni(), getEdat());
    }
    
//</editor-fold>
    
  
}
