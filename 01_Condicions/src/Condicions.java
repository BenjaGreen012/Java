import java.util.Scanner;

public class Condicions {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int num1 =0;
        String nom;
        System.out.println("Hello, World!");
        System.out.print("Pon un nombre porfas: ");
        nom=sc.next();
        System.out.print("Pon un numero porfas: ");
        num1=sc.nextInt();
        if (num1<=100) {
            while (num1<100) {
                System.out.println(nom+", el numero es "+num1+" y no llega a 100"); 
                num1++;
            }
            if (num1==100) {
                System.out.println(nom+", el numero "+num1+" ya es el numero 100");
            }             
        }else {
            System.out.println(nom+", el numero "+num1+" ya supera el numero 100");
        }
    }
}
