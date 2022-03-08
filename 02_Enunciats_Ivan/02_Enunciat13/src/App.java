import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int min=1;
        int max=100;
        char letr;
        System.out.println("El numero es mas pequeño de "+max+"?");
        letr= tl.next().toUpperCase().charAt(0);
    }
}
