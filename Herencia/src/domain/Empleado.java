package domain;

public class Empleado extends Persona {
    private int iDEmpleado;
    private double sueldo;
    private static int contador;
    
    public Empleado() {}
    public Empleado(String nom, char gen, int ed, String dir, double sueldo){
        super(nom, gen, ed, dir);
        this.iDEmpleado = ++Empleado.contador;
        this.sueldo = sueldo;        
    }

    public int getiDEmpleado() {
        return iDEmpleado;
    }

    public void setiDEmpleado(int iDEmpleado) {
        this.iDEmpleado = iDEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Empleado.contador = contador;
    }

    @Override
    public String toString() {
        return "empleado= " + this.iDEmpleado +  " Empleado {" + super.toString() + ", sueldo= " + this.sueldo + '}';
    }
    
    
}
