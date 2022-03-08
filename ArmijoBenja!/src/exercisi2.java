import java.util.Scanner;

public class exercisi2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int num;
        Scanner tl=new Scanner(System.in);
        num=tl.nextInt();
        if (num<0) {
            System.out.print("*");
        }else{
            if (num==0) {
                System.out.print("No es mostra cap *");
            }else{
                while (num!=0) {
                    System.out.print("*");
                    num--;
                }
            }
        }
    }
}
