
package test;
import dominio.Persona;

public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Catalina");
        System.out.println("Persona" + p1.toString() );
        Persona p2 = new Persona("Nicolas");
        System.out.println("Persona" + p2.toString() );
    }
    
}
