import java.util.Scanner;

public class App {

    static void mostraMatriu(int[][] matriuRebuda) {
        // FOR per mostrar array
        for (int i = 0; i < matriuRebuda.length; i++) {
            for (int j = 0; j < matriuRebuda[i].length; j++) {
                if (matriuRebuda[i][j] < 10) {
                    System.out.print(" " + matriuRebuda[i][j] + " ");
                } else {
                    System.out.print(matriuRebuda[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int matriu[][] = new int[3][2];
        int matriuTras[][] = new int[2][3];

        // for per introduir dades
        for (int i = 0; i < matriu.length; i++) { // for per recorrer les files
            for (int j = 0; j < matriu[i].length; j++) { // for per recorrer les columnes
                matriu[i][j] = (int) (Math.random()*100
                );
            }
            System.out.println();
        }

        // for per procesar les dades
        for (int i = 0; i < matriu.length; i++) { // for per recorrer les files
            for (int j = 0; j < matriu[i].length; j++) { // for per recorrer les columnes
                matriuTras[j][i] = matriu[i][j];
            }
        }

        mostraMatriu(matriu);
        System.out.println();
        mostraMatriu(matriuTras);
    }

}