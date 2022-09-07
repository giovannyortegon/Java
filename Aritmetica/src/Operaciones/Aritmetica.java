
package Operaciones;

public class Aritmetica {
    int a;
    int b;
    
    public void suma() {
        int resultado = a + b;
        System.out.println("a: " + a +" + b:"+ b + " = " + resultado );
    }
    
    public int sumaRetorno() {
        int resultado = a + b;
        return resultado;
    }
}
