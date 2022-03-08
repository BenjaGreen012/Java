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
            //TODO: handle exception
        }
        return contenidoFitxer;
    }

    private static int tornaAleatori(int maxim, int min){
        int num=0;
        num=(int)Math.random()*(maxim-min)+min;
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Hello word!");
        // Declaro les variables que faré servir
        int lineasObjectes;
        lineasObjectes=contadorLineas("objectes.txt");
        int lineasFuncions;
        lineasFuncions=contadorLineas("funcions.txt");
        int lineasAdjectius;
        lineasAdjectius=contadorLineas("adjectius.txt");
        System.out.println(lineasAdjectius);
        String lineaDeText="";
        String[] objectes=new String[lineasObjectes];
        String[] funcions=new String[lineasFuncions];
        String[] adjectius=new String[lineasAdjectius];
        int numObjectes;
        int numFuncions;
        int numAdjectius;
        // ================================================
        // Omplo les arrays amb totes les línies del fitxer
        objectes=leerFitxeroEntero("objectes.txt");
        funcions=leerFitxeroEntero("funcions.txt");
        adjectius=leerFitxeroEntero("adjectius.txt");
        // ================================================
        //numAdjectius= askjdhakshjda 
    }
}
