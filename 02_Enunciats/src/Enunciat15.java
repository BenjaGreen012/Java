import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int num1;
        int pos;
        int neg;
        num1=tl.nextInt();
        if (num1>0) {
            pos=tl.nextInt();
            while (pos<0) {
                pos=tl.nextInt(); 
            }
            System.out.println(Math.pow(num1, pos));
        }else{
            neg=tl.nextInt();
            while (neg>0) {
                neg=tl.nextInt(); 
            }
            System.out.println(Math.pow(num1, neg));
        }
    }
}
