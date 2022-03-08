import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int num;
        num=tl.nextInt();
        while (num!=0) {
            num=tl.nextInt();
        }
        System.out.println("El numero es "+num);
    }
}
