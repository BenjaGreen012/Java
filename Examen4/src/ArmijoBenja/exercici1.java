import java.io.File;
import java.util.Scanner;

public class exercici1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String linea;
        int numero;
        int max=0;
        int min=0;
        boolean elPrimerNumero=true;
        try {
            File fitxer=new File("numeros.txt");
            Scanner filScanner=new Scanner(fitxer);
            while (filScanner.hasNextLine()) {
                linea=filScanner.nextLine();
                numero=Integer.parseInt(linea);
                if (numero>max) {
                    max=numero;
                }
                if (elPrimerNumero) {
                    min=numero;
                    elPrimerNumero=false;
                }
                if (numero<min) {
                    min=numero;
                }
            }
            filScanner.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println(max);
        System.out.println(min);
    }
}
