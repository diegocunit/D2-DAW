
package cat.iesjoaquimmir.diego.biblioteca.articles;

public enum Categoria {
    
     infantil("infantil", false),
     juvenil("juvenil", false),
     adult("adulto", true);
     
     private final String mensaje;
     private final boolean adulto;
     
     Categoria (String mensaje, boolean adulto){
         this.mensaje = mensaje;
         this.adulto = adulto;
        
     }
     public String getMensaje(){
         return mensaje;
     }
     public boolean categoriaAdulta(){
         return adulto;
     }
}
