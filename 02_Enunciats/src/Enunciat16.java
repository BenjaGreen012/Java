import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int num1;
        int pos;
        int neg;
        int mud;
        num1=tl.nextInt();
        if (num1>0) {
            pos=tl.nextInt();
            while (pos<0) {
                pos=tl.nextInt(); 
            }
            mud=pos%num1;
            if (mud==0) {
                System.out.println("Si");
            }else{
                System.out.println("No");
            }
        }else{
            neg=tl.nextInt();
            while (neg>0) {
                neg=tl.nextInt(); 
            }
            mud=neg%num1;
            if (mud==0) {
                System.out.println("Si");
            }else{
                System.out.println("No");
            }
        }
    }
}
