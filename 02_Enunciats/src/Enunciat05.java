import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int num1;
        int num2;
        num1= tl.nextInt();
        num2=tl.nextInt();
        System.out.println((num1+num2)+" Suma");
        System.out.println((num1-num2)+" Resta");
        System.out.println((num1*num2)+" Multi");
        if (num2!=0) {
            System.out.println((num1/num2)+" Divicio");
        }else{
            System.out.println("Eres tonto y no se puede divir entre 0");
        }
        System.out.println((num1%num2)+" Modul");
    }
}
