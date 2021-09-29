package Operaciones;

public class Aritmetica {

    int a, b;

    //Constructor
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Aritmetica() {
    }
    
    //Metodos

    public void suma() {

        System.out.println("La suma de " + a + "+" + b + " = " + (a + b));
    }

    public int suma2() {
        return a + b;
    }
    
    public int sumaArgs(int a, int b){
        
        this.a = a;
        this.b = b;
        return this.a + this.b;
        
    }
}
