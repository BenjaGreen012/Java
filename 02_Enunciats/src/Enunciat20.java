import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numeroAleatori;
        int numero;
        int cont=0;
        numeroAleatori = (int)(Math.random()*100);
        System.out.println("Introdueix número entre 0 i 100");
        Scanner tl = new Scanner(System.in);
        System.out.println(numeroAleatori);
        try {
            do {
            numero = tl.nextInt();
            System.out.println("El número llegit és " + numero);
            if (numero!=numeroAleatori) {
                if (numero>numeroAleatori) {
                    System.out.println("El numero es mes petit");
                }else{
                    System.out.println("El numero es mes gran");
                }
            }
            cont++;
            } while (numero!=numeroAleatori);
            System.out.println("Has acertat el numero!!!, que era "+numeroAleatori+" o has aconseguit en "+cont+" intents");
        }catch(InputMismatchException e) {
            System.out.println("Error lectura dada numèrica");
        }   
    }
}
