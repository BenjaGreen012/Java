package ArmijoBenjaFuncions;

import java.io.File;
import java.util.Scanner;

public class Fitxers {
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
        String[] fitxero=leerFitxeroEntero("fitxerEntrada.txt");
        for (int i = 0; i < fitxero.length; i++) {
            System.out.println(fitxero[i]);
        }
    }
}