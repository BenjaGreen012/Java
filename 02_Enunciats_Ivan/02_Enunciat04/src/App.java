import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int num1;
        num1=tl.nextInt();
        for (int num=1;num<=num1;num++){
            System.out.println(num);
        }
    }
}
