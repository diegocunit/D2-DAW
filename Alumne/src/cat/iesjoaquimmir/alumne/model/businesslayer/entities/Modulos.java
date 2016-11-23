
package cat.iesjoaquimmir.alumne.model.businesslayer.entities;

import java.util.ArrayList;


public class Modulos {
    //<editor-fold defaultstate="collapsed" desc="atributos">
private String nombremod;
private String descripcion;
private int hores;
//</editor-fold>

 

  

//<editor-fold defaultstate="collapsed" desc="getters/setters">

   public String getDescripcion() {
        return descripcion;
    }

    
    public int getHores() {
        return hores;
    }

    
    public String getNombremod() {
        return nombremod;
    }

    
    public void setDescripcion(String descripcion) {
        if(descripcion == null){
           throw new NullPointerException("La descripcio no puede ser nulo");
        }
         this.descripcion = descripcion;
        }
       
    

    
    public void setHores(int hores) {
        if(hores == 0){
           throw new NullPointerException("Has d'inciar les hores, no puede ser nulo");
        }
         this.hores = hores;
        
    }

    
    public void setNombremod(String nombremod) {
         if(nombremod == null){
           throw new NullPointerException("El nom no puede ser nulo");
        }
        this.nombremod = nombremod;
    }
    
   
  

//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="constructor">
 public Modulos(String nombremod, String descripcion, int hores) {
        this.setNombremod(nombremod);
        this.setDescripcion(descripcion);
        this.setHores(hores);
    }

     
//</editor-fold>

   

   
}