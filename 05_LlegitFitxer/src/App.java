import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String linea;
        try {
            File fitxer=new File("txt.txt");
            Scanner filScanner=new Scanner(fitxer);
            while (filScanner.hasNextLine()) {
                linea=filScanner.nextLine();
                System.out.println(linea);
            }
            filScanner.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
