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
    static void rellenarMatriu(int[][] matriuRebuda){
        for (int i = 0; i < matriuRebuda.length; i++) {
            for (int j = 0; j < matriuRebuda[i].length; j++) {
                matriuRebuda[i][j]=(int) (Math.random()*10);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int sumres;
        int[][] nums1=new int [3][2];
        int[][] nums2=new int [3][2];
        int[][] result=new int [3][2];
        rellenarMatriu(nums1);
        rellenarMatriu(nums2);
        System.out.println("1=Suma 2=Resta");
        sumres=tl.nextInt();
        if (sumres==1) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j]=nums1[i][j]+nums2[i][j];
                }
            }
        }else{
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j]=nums1[i][j]-nums2[i][j];
                }
            }
        }
        System.out.println("==========");
        mostraMatriu(nums1);
        System.out.println("==========");
        mostraMatriu(nums2);
        System.out.println("==========");
        mostraMatriu(result);
    }
}
