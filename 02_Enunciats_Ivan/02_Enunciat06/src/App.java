import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int num;
        int mas0=0;
        int menos0=0;
        for(int i=10;i>=1;i--){
            num=tl.nextInt();
            if (num==0) {
                System.out.println("El numero no puede ser el 0");
            }else
                if (num>0) {
                    System.out.println("El numero es positivo");
                }else {
                    System.out.println("El numero es negativo");
            }
        }
    }
}
