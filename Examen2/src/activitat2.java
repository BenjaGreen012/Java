import java.util.Scanner;

public class activitat2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl = new Scanner(System.in);
        int quantitat;
        int valor;
        int incremet;
        System.out.print("Quantitat ");
        quantitat = tl.nextInt();
        System.out.print("Valor ");
        valor = tl.nextInt();
        System.out.print("Increment ");
        incremet = tl.nextInt();
        int[] array = new int[quantitat];
        for (int i = 0; i < array.length; i++) {
            array[0] = valor;
            if (i > 0) {
                array[i] = array[i - 1] + incremet;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(+array[i] + " ");
        }
        tl.close();
    }
}
