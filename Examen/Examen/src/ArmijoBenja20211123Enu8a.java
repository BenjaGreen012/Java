import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class ArmijoBenja20211123Enu8a {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int cont = 0;
        int index;
        String mayusomins;
        char mayus = 65;
        char mins = 97;
        char[] arrMinuscules = new char[26];
        char[] arrMajuscules = new char[26];
        char[] palabra = new char[1000];
        Scanner tl = new Scanner(System.in);
        Scanner lt = new Scanner(System.in);
        // Entro las dades de "A" a la "Z" i de "a" a la "z"
        for (int i = 0; i < arrMajuscules.length; i++) {
            arrMajuscules[i] = mayus;
            mayus++;
            arrMinuscules[i] = mins;
            mins++;
        }
        //Introduccio de las lletres a la array palabra
        do {
            System.out.println("Entra l'index del caracter que vols escriure (A:1, Z:26, -1 per acabar): ");
            index = tl.nextInt();
            if (index == -1) {
                System.out.println("Ara surtiras");
                break;
            } else {
                while (index>26) {
                    System.out.println("Error! El valor ha d'estar entre 1 i 26 o -1 per acabar");
                    index = tl.nextInt();
                }
                System.out.println("Vols que el caracter sigui majuscules (M) o minuscules (m)");
                mayusomins = lt.nextLine();
                if (mayusomins.equals("M")) {
                    palabra[cont] = arrMajuscules[index - 1];
                }else{
                    palabra[cont]=arrMinuscules[index-1];
                }
                System.out.println(palabra[cont]);
                cont++;
                System.out.println(cont);
            }
        } while (cont<palabra.length);
        //Mostrar la array palabra que conte totes les lletras demanadas amb un for
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i]);
        }
        tl.close();
        lt.close();
    }
}
