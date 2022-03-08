package ArmijoBenjaFuncions;

import java.util.Scanner;

public class Bac{
    public static Scanner tl = new Scanner(System.in);
    public static void h(){
        System.out.println("Hello Word!");
    }
    public static int demanarNumero() {
        int num=0;
        boolean numInco=false;
        do {
            try {
                numInco=false;
                System.out.print("Un numero: ");
                num=tl.nextInt();
            } catch (Exception e) {
                System.out.println("Nomes numeros tonto!");
                numInco=true;
                tl.nextLine();
            }
        } while (numInco!=false);
        return num;
    }
    public static void rellenarMatriu(int[][] matriuRebuda, int max, int min) {
        for (int i = 0; i < matriuRebuda.length; i++) {
            for (int j = 0; j < matriuRebuda[i].length; j++) {
                matriuRebuda[i][j]=(int) (Math.random() * (max - min) + min);
            }
        }
    }
}
