import java.util.Scanner;

public class activitat5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl = new Scanner(System.in);
        int m;
        int n;
        System.out.print("Files ");
        m = tl.nextInt();
        System.out.print("Columnes ");
        n = tl.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] == array[j][i]) {

                }
            }
            System.out.println(" ");
        }
        tl.close();
    }
}
