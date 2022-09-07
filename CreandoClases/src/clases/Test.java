package clases;

public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Giovanny", "Ortegon");
        Persona p2 = new Persona();
        
        p2.name = "Adriana";
        p2.apellido = "Ortegon";
        
        System.out.println("p1: " + p1);
        p1.Print();
        System.out.println("p2: " + p2);
        p2.Print();
    }
}
