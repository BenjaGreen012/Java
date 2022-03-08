import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int fi;
        int col;
        try {
            fi=tl.nextInt();
        } catch (Exception e) {
            fi=(int) (Math.random()*100);
        }
        try {
            do {
                System.out.println("Pon el mismo numero de antes "+fi);
                col=tl.nextInt();
            } while (fi!=col);
            
        } catch (Exception e) {
            col=fi;
        }
        int[][] nums=new int[fi][col];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i==j) {
                    nums[i][j]=1;
                }else{
                    nums[i][j]=0;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(" ");
        }
        tl.close();
    }
}
