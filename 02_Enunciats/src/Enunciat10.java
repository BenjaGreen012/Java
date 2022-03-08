import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        n = sc.nextInt();
        for (int i = 0; i <= n; i++)
        {
            System.out.print(i+"! = ");
            if (i==0)
                System.out.print("1");
            for (int j = i; j > 0; j--)
            {
                if (j!=1)
                    System.out.print(j+" + ");
                else
                    System.out.print(j);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}