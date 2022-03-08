import java.io.File;
import java.util.Scanner;

public class ArmijoBenja_20220304 {
    public static Scanner tl = new Scanner(System.in);

    public static int llegeixEnterArray(String cadenaAMostrar, String[] arrayValors) {
        int enterARetornar = 1;
        int numMax = arrayValors.length - 1;
        int numMin = 0;
        String[] missatges = { "els possibles valors són ", "Entra una opció: ", "ERROR! El valor entrat",
                "Torna a intentar-ho!", "està fora de rang,", "NO és un enter," };
        boolean numInco = false;
        do {
            try {
                numInco = false;
                do {
                    System.out.println(cadenaAMostrar);
                    System.out.println(missatges[0]);
                    for (int i = 0; i < arrayValors.length; i++) {
                        System.out.println(i + " - " + arrayValors[i]);
                    }
                    System.out.print(missatges[1]);
                    enterARetornar = tl.nextInt();
                    if (enterARetornar > numMax && enterARetornar < numMin) {
                        System.out.println(missatges[2] + " " + missatges[4] + " " + missatges[3]);
                    }
                } while (enterARetornar > numMax || enterARetornar < numMin);
            } catch (Exception e) {
                System.out.println(missatges[2] + " " + missatges[5] + " " + missatges[3]);
                numInco = true;
                tl.nextLine();
            }
        } while (numInco != false);
        return enterARetornar;
    }

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
            // TODO: handle exception
        }
        return contenidoFitxer;
    }

    public static void main(String[] args) {
        String missDemIdioma = "Escull un idioma";
        String missDemDiaSet = "Entra un dia de la setmana";
        int idiomaEscollit = 0;
        int diaSetDemanat = 0;
        String[] arrayIdiomes = { "català", "castellà", "anglès" };
        idiomaEscollit = llegeixEnterArray(missDemIdioma, arrayIdiomes);
        // El teu codi va aquí.
        String missDemCurtLlarg = "Escull curt o llarg";
        int lineasDies = contadorLineas("catala.txt");
        int curtOLlarg;
        String[] dias = new String[lineasDies];
        String[] curtLlarg = { "Curt", "Llarg" };
        String[] diaSet;
        switch (idiomaEscollit) {
            case 0:
                dias = leerFitxeroEntero("catala.txt");
                diaSetDemanat = llegeixEnterArray(missDemDiaSet, dias);
                curtOLlarg = llegeixEnterArray(missDemCurtLlarg, curtLlarg);
                switch (curtOLlarg) {
                    case 1:
                        diaSet = dias[diaSetDemanat].split(",");
                        System.out.println(diaSet[0]);
                        break;
                    case 2:
                        diaSet = dias[diaSetDemanat].split(",");
                        System.out.println(diaSet[1]);
                        break;

                    default:
                        break;
                }
                break;
            case 1:
                dias = leerFitxeroEntero("castella.txt");
                diaSetDemanat = llegeixEnterArray(missDemDiaSet, dias);
                curtOLlarg = llegeixEnterArray(missDemCurtLlarg, curtLlarg);
                switch (curtOLlarg) {
                    case 1:
                        diaSet = dias[diaSetDemanat].split(",");
                        System.out.println(diaSet[0]);
                        break;
                    case 2:
                        diaSet = dias[diaSetDemanat].split(",");
                        System.out.println(diaSet[1]);
                        break;

                    default:
                        break;
                }
                break;
            case 2:
                dias = leerFitxeroEntero("angles.txt");
                diaSetDemanat = llegeixEnterArray(missDemDiaSet, dias);
                curtOLlarg = llegeixEnterArray(missDemCurtLlarg, curtLlarg);
                switch (curtOLlarg) {
                    case 1:
                        diaSet = dias[diaSetDemanat].split(",");
                        System.out.println(diaSet[0]);
                        break;
                    case 2:
                        diaSet = dias[diaSetDemanat].split(",");
                        System.out.println(diaSet[1]);
                        break;

                    default:
                        break;
                }
                break;

            default:
                break;
        }
    }

}