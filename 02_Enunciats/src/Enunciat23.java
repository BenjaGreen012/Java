import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] cadena = new String[5];
        int[] longi=new int [5];
        Scanner tl=new Scanner(System.in);
        for (int i = 0; i < cadena.length; i++) {
            cadena[i]=tl.nextLine();
            System.out.println("Cadena= "+cadena[i]);
        }
        for (int i = 0; i < longi.length; i++) {
            longi[i]=cadena[i].length();
            System.out.println(longi[i]);
        }
    }
}
