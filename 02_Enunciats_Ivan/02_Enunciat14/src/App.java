//Fet per Benja i Isma con cariño para el Ivan
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] cant = new int[7];
        int[] pos = new int[7];
        int contador = 0;

        int[] dinero = { 500, 200, 100, 50, 20, 10, 5 };
        int num;
        int guar = 0;
        Scanner tl = new Scanner(System.in);
        do {
            System.out.println("Introdueix un numero multiple de 5");
            num = tl.nextInt();
            if (num % 5 != 0) {
                System.out.println("Error, numero introduit no valid");
            }
        } while (num % 5 != 0);
        System.out.println("Gracies");
        for (int i = 0; i < cant.length; i++) {

            System.out.println("Introdueix la cuantitat de billets de  " + dinero[i] + " que tenim.");

            cant[i] = tl.nextInt();

        }
        System.out.println("===================================================");
        System.out.println("Quantitat de bitllets. ");
        System.out.println("===================================================");
        for (int i = 0; i < cant.length; i++) {
            System.out.println("Tenim " + cant[i] + " de billets de " + dinero[i]);

        }

        while (num != 0) {
                    if (dinero[contador] >= num) {
                        guar = dinero[contador];
                    }
                    if (guar >= dinero[contador]) {
                        if (cant[contador] == 0) {
                        } else {
                            num = num - dinero[contador];
                            // System.out.println("Te doy un billete de " + dinero[contador]);
                            // System.out.println("Y aun quedan " + num);
                            cant[contador] = cant[contador] - 1;
                            pos[contador] = pos[contador] + 1;
                        }
                    }
                    contador++;
                }
            
            for(int i = 0;i<pos.length;i++)
    {
        System.out.println("Hem utilitzat " + pos[i] + " billets de " + dinero[i]);

    }

}}
