import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] nums=new int[5];
        int[] numor=new int[5];
        int numpet;
        int numgran;
        Scanner tl=new Scanner(System.in);
        numpet=tl.nextInt();
        System.out.println("-----");
        numgran=tl.nextInt();
        System.out.println("--FIN--");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=(int) (Math.random()*100);
            System.out.println(nums[i]);
            System.out.println("----");
        }
        System.out.println("--FIN--");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<numgran) {
                numor[i]=0;
            }
            if (nums[i]>numpet) {
                numor[i]=1;
            }
            System.out.println(numor[i]);
            System.out.println("--------");
        }
    }
}
