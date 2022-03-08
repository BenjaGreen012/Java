import java.io.File;
import java.util.Scanner;

public class ArmijoBenja_Exercici2 {
    public static int contadorLineas(String nomFitxer) {
        int cont = 0;
        try {
            File fitxer = new File(nomFitxer);
            Scanner filScanner = new Scanner(fitxer);
            while (filScanner.hasNextLine()) {
                filScanner.nextLine();
                cont++;
            }
            filScanner.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return cont;
    }

    public static String llegirLineaFitxer(String nomFitxer) {
        File fitxer = new File(nomFitxer);
        Scanner punter = null;
        String linia = "";
        try {
            punter = new Scanner(fitxer);
            linia = punter.nextLine();
            System.out.println(linia);

        } catch (Exception exepcio1) {
            // TODO: handle exception
        }
        return linia;

    }

    private static String[] leerFitxeroEntero(String nomFitxer) {
        int contLinea = contadorLineas(nomFitxer);
        int cont = 0;
        String[] contenidoFitxer = new String[contLinea];
        File fitxer = new File(nomFitxer);
        Scanner punter = null;
        try {
            punter = new Scanner(fitxer);
            while (punter.hasNextLine()) {
                contenidoFitxer[cont] = punter.nextLine();
                cont++;
            }

        } catch (Exception exepcio1) {
            System.out.println("Missatge: " + exepcio1.getMessage());
        }
        return contenidoFitxer;
    }
    public static void main(String[] args) {
        System.out.println("Hello word!");
        int lineasObjectes;
        lineasObjectes=contadorLineas("src\\objectes.txt");
        int lineasFuncions;
        lineasFuncions=contadorLineas("src\\funcions.txt");
        int lineasAdjectius;
        lineasAdjectius=contadorLineas("src\\adjectius.txt");
        String per="per";
        String[] objectes=new String[lineasObjectes];
        String[] funcions=new String[lineasFuncions];
        String[] adjectius=new String[lineasAdjectius];

    }
}
