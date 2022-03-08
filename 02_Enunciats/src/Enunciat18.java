import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        final int MAS18=18;
        int contH=0, conttot=0, contM=0;
        int edad=1;
        Scanner tl=new Scanner(System.in);
        char gen;
        while (edad!=0) {
            System.out.println("Edad?");
            edad= tl.nextInt();
            conttot++;
            if (edad>=MAS18) {
                System.out.println("H o M?");
                gen=tl.next().toUpperCase().charAt(0);
                while (gen!='H'&& gen!='M') {  
                    System.out.println("No");
                    System.out.println("Pon otro");
                    gen=tl.next().charAt(0);                   
                }
                if (gen=='H') {
                    contH++;
                }else{
                    contM++;
                }
            }
        }
        System.out.println("Adios");
    }
}
