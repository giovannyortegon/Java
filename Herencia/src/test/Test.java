package test;
import domain.Persona;
import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 'M', 23, "Av 23");
        System.out.println("Persona 1 = " + p1.toString());
        
        
        Empleado e0 = new Empleado();
        Empleado e1 = new Empleado("Juliana", 'F', 20, "Cl 32", 4200);
        System.out.println("e1 = " + e1.toString());
        Empleado e2 = new Empleado("Julia", 'F', 21, "Cl 32", 3200);
        System.out.println("e2 = " + e2.toString());
        Empleado e3 = new Empleado("Juan", 45.678);
        System.out.println("e3 = " + e3.toString());
        
        var fecha = new Date();
        Cliente c1 = new Cliente("Maria", 'F', 34, "Trans 13", fecha, true);
        System.out.println("c1 = " + c1.toString());
        
        
        
    }
}
