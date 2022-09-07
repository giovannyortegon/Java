
package clases;

public class Persona {
    String name;
    String apellido;

    Persona() {}
    Persona(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }
    
    public void Print() {
        System.out.println("Nombre: " + this.name + " Apellido: " + this.apellido);
    }
}
