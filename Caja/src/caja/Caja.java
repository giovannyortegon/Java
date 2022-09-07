
package caja;

public class Caja {
   int alto;
   int ancho;
   int profundo;
   
   public Caja() {
       System.out.println("Inicializando constructor vacio!.");
   }
   
   public Caja(int al, int an, int pro) {
       this.alto = al;
       this.ancho = an;
       this.profundo = pro;
   }
   public void CalcularValumen() {
       int result = this.alto * this.ancho * this.profundo;
       System.out.println("result = " + result);
   }
}
