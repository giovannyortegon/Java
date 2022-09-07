package Operaciones;

public class Test {
    public static void main(String[] args) {

        Aritmetica op = new Aritmetica();
        
        op.a = 1;
        op.b = 2;
        
        op.suma();
        
        int resultado = op.sumaRetorno();
        
        System.out.println("resultado = " + resultado);
        
    }
}
