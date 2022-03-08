import java.util.Scanner;

public class Enunciat1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double num1;
        double num2;
        double num3;
        Scanner tl=new Scanner (System.in);
        num1=0;
        num2=0;
        System.out.print("Pon un numero porfas: ");
        num1=tl.nextInt();
        System.out.print("Pon un numero porfas: ");
        num2=tl.nextInt();
        tl.close();
        num3=Math.sqrt((Math.pow(num1,2))+Math.pow(num2, 2));
        System.out.println("La hipotenusa es "+num3);
    }
}
