package Operaciones;

public class Test {

    public static void main(String[] args) {

//        Aritmetica arit1 = new Aritmetica();
//        arit1.a = 5;
//        arit1.b = 7;
        Aritmetica arit1 = new Aritmetica(5, 7);
        //1 caso
        arit1.suma();
        //2 caso
        var res = arit1.suma2();
        System.out.println("Resultado caso 2 = " + res);
        //3 caso
        res = arit1.sumaArgs(8, 9);
        System.out.println("Resultado caso 3 = " + res);
        nuevoMetodo();

    }

    public static void nuevoMetodo() {
        System.out.println("En el nuevo metodo");

    }

}
