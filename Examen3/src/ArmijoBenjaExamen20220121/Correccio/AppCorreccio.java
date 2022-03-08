//package ArmijoBenjaExamen20220121;
import java.util.Scanner;

public class AppCorreccio {

    final static int A_MAJUS = 65;
    final static int Z_MAJUS = 90;
    final static int A_MINUS = 97;
    final static int Z_MINUS = 122;
    final static int CODI_0 = 48;
    final static int CODI_9 = 57;

    final static public int MIDA_BARRA = 70;
    final static public int ESPAIS_ABANS = 8;

    static Scanner teclat = new Scanner(System.in);

    public static void netejaConsola() {
        try {
            String sistemaOperatiu = System.getProperty("os.name"); //Check the current operating system
            ProcessBuilder pb;

            if (sistemaOperatiu.contains("Windows")) {
                pb = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                pb = new ProcessBuilder("clear");
            }
            Process iniciaProces = pb.inheritIO().start();
            iniciaProces.waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void pausa(String missatge) {
        System.out.print(missatge);
        try {
            String sistemaOperatiu = System.getProperty("os.name"); //Check the current operating system
            ProcessBuilder pb;
            if (sistemaOperatiu.contains("Windows")) {
                pb = new ProcessBuilder("cmd", "/c", "pause >nul");
            } else {
                pb = new ProcessBuilder("pause >nul");
            }
            Process iniciaProces = pb.inheritIO().start();
            iniciaProces.waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String missProvaFuncio(String nomFuncio) {
        String cadenaATornar = "";

        int guionsAAfegir = (MIDA_BARRA - nomFuncio.length()) / 2;

        if ((((guionsAAfegir * 2) + nomFuncio.length()) + 2) >= MIDA_BARRA) {
            cadenaATornar = repeteixCaracter('-', guionsAAfegir)
                    + " " + nomFuncio + " "
                    + repeteixCaracter('-', guionsAAfegir - 1)
                    + "\n";
        } else {
            cadenaATornar = repeteixCaracter('-', guionsAAfegir)
                    + " " + nomFuncio + " "
                    + repeteixCaracter('-', guionsAAfegir)
                    + "\n";
        }

        return cadenaATornar;

    }

    public static String repeteixCaracter(char caracater, int vegades) {
        String cadenaATornar = "";
        for (int i = 0; i < vegades; i++) {
            cadenaATornar += caracater;
        }
        return cadenaATornar;
    }

    public static void pintaBarra() {
        System.out.print(repeteixCaracter('=', MIDA_BARRA) + "\n");
    }

    public static void pintaBarraPetita() {
        System.out.print(repeteixCaracter('-', MIDA_BARRA) + "\n");
    }

    public static int midaBarra() {
        return MIDA_BARRA;
    }

    public static void mostrarMissatgeMaco(String cadena) {
        // int qtatEspais = (MIDA_BARRA - ESPAIS_ABANS
        //         - cadena.length()) / 2;
        System.out.print(repeteixCaracter(' ', ESPAIS_ABANS)
                + cadena
                + "\n");
    }

    public static void mostrarCadena(String cadena) {
        // int qtatEspais = (MIDA_BARRA - ESPAIS_ABANS
        //         - cadena.length()) / 2;
        System.out.print(cadena);
    }

    static boolean esCodiDUnaLletra(int codiASCII) {
        return ((codiASCII > A_MAJUS && codiASCII < Z_MAJUS) ||
                (codiASCII > A_MINUS && codiASCII < Z_MINUS));
    }

    static boolean esCodiDUnNombre(int codiASCII) {
        return (codiASCII > CODI_0 && codiASCII < CODI_9);
    }

    public static void mostrarError(String cadena) {
        mostrarMissatgeMaco("----------  ERROR!!!  ----------");
        mostrarMissatgeMaco(cadena);
        mostrarMissatgeMaco("Torna a intentar-ho!");
        mostrarMissatgeMaco("--------------------------------");
    }

    static void mostraMenu(String[] llistaAMostrar, boolean ambBarres) {
        pintaBarra();
        mostrarMissatgeMaco(llistaAMostrar[0]);
        pintaBarraPetita();
        teclat = new Scanner(System.in);
        String opcions = "(";
        for (int i = 2; i < llistaAMostrar.length; i++) {
            System.out.println(repeteixCaracter(' ', (ESPAIS_ABANS - 4)) + (i - 1) + " - " + llistaAMostrar[i]);
            opcions += (i - 1);
            if (i < llistaAMostrar.length - 1) {
                opcions += ",";
            }
        }
        opcions += "): ";
        if (ambBarres) {
            pintaBarraPetita();
        }
        String cadena = llistaAMostrar[1] + " ";
        if ((cadena.length() + opcions.length() < midaBarra())) {
            System.out.print(cadena + opcions);
        } else {
            System.out.print(cadena + "\n" + opcions);
        }
    }


    public static boolean esNombre(char valorLlegit) {
        boolean esEnter = false;
        if (AppCorreccio.esCodiDUnNombre(valorLlegit)) {
            esEnter = true;
        }
        return esEnter;
    }


        // Pregunta 8 6a:  esLletra(char valo...	<#NOTA_esLletra#>	0.50
        public static boolean esCaracter(char valorLlegit) {
            boolean esLletra = false;
            if (valorLlegit > 65 && valorLlegit < 90) {
                esLletra = true;
            }
            if (valorLlegit > 97 && valorLlegit < 122) {
                esLletra = true;
            }
            return esLletra;
        }
    

    // Pregunta 5 3a:  llegirCaracterTeclat	<#NOTA_llegirCaracter#>	0.50
    public static char llegirLletraTeclat() {
        char caracterLlegit = '#';
        boolean esCaracter = false;
        teclat = new Scanner(System.in);
        do {
            caracterLlegit = teclat.next().charAt(0);
            // An extra nextLine() to consume the leftover line
            // teclat.nextLine();
            if (AppCorreccio.esCodiDUnaLletra((int) caracterLlegit)) {
                esCaracter = true;
            } else {
                AppCorreccio.mostrarError("Només pots entrar lletres!");
            }
        } while (esCaracter == false);
        teclat.nextLine();
        return caracterLlegit;
    }

   // Pregunta 4 2a:  llegirEnterTeclat	<#NOTA_llegirEnter#>	0.50
   public static int llegirNombreTeclat() {
    teclat = new Scanner(System.in);
    int nombreLlegit = 0;
    boolean esEnter = false;
    do {
        try {
            nombreLlegit = teclat.nextInt();
            esEnter = true;
        } catch (Exception e) {
            AppCorreccio.mostrarError("Només pots entrar nombres!");
            esEnter = false;
        } finally {
            teclat = new Scanner(System.in);
        }
    } while (esEnter == false);
    return nombreLlegit;
}



        // Pregunta 6 4a:  llegirCadenaDeLlet...	<#NOTA_llCadCaracters#>	1.00
        public static String   llegirCadenaDeLletres() {
            teclat = new Scanner(System.in);
            return teclat.nextLine();
        }

    static int escullOpcio(String[] llistaAMostrar) {
        int opcioEscollida = 0;
        boolean esCorrecte, esError;
        netejaConsola();
        do {
            mostraMenu(llistaAMostrar, true);
            esError = false;
            esCorrecte = false;
            try {
                opcioEscollida = teclat.nextInt();
                if (opcioEscollida > llistaAMostrar.length) {
                    esError = true;
                }
                esCorrecte = true;
            } catch (Exception exepcio1) {
                esError = true;
            } finally {
                if (esError) {
                    mostrarError("Has d'entrar una de les opcions demandes!");
                }
            }
        } while (!(esCorrecte));
        return opcioEscollida;
    }

}
