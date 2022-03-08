import java.util.Scanner;

public class activitat1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl = new Scanner(System.in);
        int[] array = new int[1000];
        int n;
        int cont = 0;
        n = tl.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99);
        }
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                cont++;
                if (cont == 1) {
                    System.out.println("El numero " + n + " si que esta en la array i ha sortit " + cont + " vegada");
                }
                System.out.println("El numero " + n + " si que esta en la array i ha sortit " + cont + " vegadas");
            }
        }
        if (cont == 0) {
            System.out.println("No existeix el numero en la array");
        }
        tl.close();
    }
}
