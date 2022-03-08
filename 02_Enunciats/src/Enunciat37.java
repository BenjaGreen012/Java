import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int gran=0;
        int[][] nums=new int[3][3];
        int[][] aux=new int [3][3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=(int) (Math.random()*100);
                if (nums[i][j]>gran) {
                    gran=nums[i][j];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(gran);
    }
}
