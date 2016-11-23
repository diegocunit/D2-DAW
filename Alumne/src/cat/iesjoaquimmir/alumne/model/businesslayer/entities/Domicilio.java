
package cat.iesjoaquimmir.alumne.model.businesslayer.entities;


public class Domicilio {
    //<editor-fold defaultstate="collapsed" desc="atributos">
    private String carrer;
    private int numero;
    private int pis;
    private int codipostal;
    private String poblacio;
    private String provincia;
    //<editor-fold defaultstate="collapsed" desc="statics">
    private static final int pis1=0;    
//</editor-fold>
//</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
        
    public String getCarrer() {
        return carrer;
    }

    
    public int getCodipostal() {
        return codipostal;
    }

    
    public int getNumero() {
        return numero;
    }

   
    public int getPis() {
        return pis;
    }

    
    public String getPoblacio() {
        return poblacio;
    }

    
    public String getProvincia() {
        return provincia;
    }

    
    public void setCarrer(String carrer) {
        if(carrer == null){
         throw new NullPointerException("La calle no puede ser nulo");
        }
        
        this.carrer = carrer;
    }

  
    public void setCodipostal(int codipostal) {
         if(codipostal == 0){
         throw new NullPointerException("El codi postal no puede ser nulo");
        }
        this.codipostal = codipostal;
    }

    
    public void setNumero(int numero) {
         if(numero == 0){
         throw new NullPointerException("El numero no puede ser nulo");
        }
        this.numero = numero;
    }

    
    public void setPis(int pis) {
        this.pis = pis;
    }

    public void setPoblacio(String poblacio) {
         if(poblacio == null){
         throw new NullPointerException("La poblacio no puede ser nulo");
        }
        this.poblacio = poblacio;
    }

    
    public void setProvincia(String provincia) {
         if(provincia == null){
         throw new NullPointerException("La provincia no puede ser nulo");
        }
        this.provincia = provincia;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
    public Domicilio(String carrer, int numero, int pis, int codipostal, String poblacio, String provincia){
     this.setCarrer(carrer);
     this.setNumero(numero);
     this.setPis(pis);
     this.setCodipostal(codipostal);
     this.setPoblacio(poblacio);
     this.setProvincia(provincia);
    }
     public Domicilio(String carrer, int numero,  int codipostal, String poblacio, String provincia){
     this.setCarrer(carrer);
     this.setNumero(numero);
     this.setPis(pis1);
     this.setCodipostal(codipostal);
     this.setPoblacio(poblacio);
     this.setProvincia(provincia);
    }
     
     
    
    
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="operadors">
     public String getDomiciliotio(){
    return String.format("Mi domicilio es: '%s' , '%d' , '%d' , '%d' , '%s' , '%s' ", getCarrer(), getNumero(), getPis(), getCodipostal(), getPoblacio(), getProvincia());
      }
//</editor-fold>
    
}
