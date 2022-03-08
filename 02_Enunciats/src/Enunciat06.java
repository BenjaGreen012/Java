import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre" };
        int nummes;
        nummes=tl.nextInt();
        while (nummes<1 || nummes>12) {
            nummes=tl.nextInt();
        }
        System.out.println(mes[nummes-1]);
    }
}
