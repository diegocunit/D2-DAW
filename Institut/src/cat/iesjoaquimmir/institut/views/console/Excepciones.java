
package cat.iesjoaquimmir.institut.views.console;


public class Excepciones extends Exception {
    
    
    
    //<editor-fold defaultstate="collapsed" desc="Attributs">
    private int valor;
    private String letras;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    
        //<editor-fold defaultstate="collapsed" desc="getters/setters">
     public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
      public String getLetras() {
        return letras;
    }
    public void setLetras(String letras) {
        this.letras = letras;
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constructor">
    
    public Excepciones (int valor) {
       
         this.setValor(valor);
   
   }
    public Excepciones (String letras) {
        
        this.setLetras(letras);

   }
   
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="operadors">

   
   
   
   
   
   
//</editor-fold>
//</editor-fold>

    


 
   

    

   




   
}
