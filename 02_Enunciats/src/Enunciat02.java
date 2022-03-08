import java.util.Scanner;

public class Enunciat2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner (System.in);
        String nom;
        int edad;
        System.out.print("Un nombre porfa: ");
        nom= tl.next();
        System.out.print("Un nombre porfa: ");
        edad= tl.nextInt();
        System.out.println("El teu nom es: "+nom+" i tens"+edad+" anys");
    } 
}
