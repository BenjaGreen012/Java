import java.io.FileWriter;
import java.util.Scanner;

public class App {
    static Scanner tl=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        FileWriter txt=null;
        String frase="";
        int cont;
        try {
            txt=new FileWriter("txt.txt",false);
            cont=1;
            while (!frase.equals("FI")) {
                System.out.println("Una linea "+cont);
                frase=tl.nextLine();
                txt.write(cont+" - "+frase+"\n");
                cont++;
            }
            txt.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error xD");
        }
        System.out.println("FI");
    }
}
