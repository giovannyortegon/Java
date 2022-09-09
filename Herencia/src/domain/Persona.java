
package domain;

public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    public Persona() {
    }
    
    public Persona(String nom, char gen, int ed, String dir) {
        this.nombre = nom;
        this.genero = gen;
        this.edad = ed;
        this.direccion = dir;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public char getGenero() {
        return this.genero;
    }
    
    public void setGenero(char gen) {
        this.genero = gen;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int ed) {
        this.edad = ed;
    }
    
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String dir) {
        this.direccion = dir;
    }
    
    @Override
    public String toString() {
        return " Persona { nombre: " + this.nombre + " genero: " + this.genero + " edad: " + this.edad + " direccion: " + this.direccion + " }" ;
    }
            
}
