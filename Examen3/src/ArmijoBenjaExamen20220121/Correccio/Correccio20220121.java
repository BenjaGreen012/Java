//package ArmijoBenjaExamen20220121;
import java.util.Scanner;

public class Correccio20220121 {

    /** Cal substituir la cadena Bac20220121
     * Per la cadena amb el codi de l'alumne.
     * <InicialsAlumne>20220121
     */

    static Scanner teclat = new Scanner(System.in);

    public static void codiMostrarMissatge() {
        // Provant la funció mostrarMissatge()
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("mostrarMissatge()");
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        String cadenaDeProva = AppCorreccio.repeteixCaracter(' ',
                AppCorreccio.ESPAIS_ABANS)
                + "Això és un text de prova!";
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        Bac20220121.mostrarMissatge(cadenaDeProva);
        AppCorreccio.mostrarCadena("\n");
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }

    public static void codiLlegirEnterTeclat() {
        // Provant la funció llegirEnterTeclat()
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("llegirEnterTeclat()");
        int enterLlegit;
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.mostrarCadena("Entra un nombre: ");
        enterLlegit = Bac20220121.llegirEnterTeclat();
        AppCorreccio.mostrarMissatgeMaco("Has entrat el nombre: " + enterLlegit);
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }

    public static void codiLlegirCaracterTeclat() {
        // Provant la funció llegirCaracterTeclat()
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("llegirCaracterTeclat()");
        char caracterLlegit;
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.mostrarCadena("Entra un caracter: ");
        caracterLlegit = Bac20220121.llegirCaracterTeclat();
        AppCorreccio.mostrarCadena("Has entrat el caràcter: " + caracterLlegit + "\n");
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }

    public static void codiLlegirCadenaDeLletresTeclat() {
        // Provant la funció llegirCadenaDeLletresTeclat()
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("llegirCadenaDeLletresTeclat()");
        String cadenaDeLletres;
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.mostrarCadena("Entra una cadena de caràcters    : ");
        cadenaDeLletres = Bac20220121.llegirCadenaDeLletres();
        AppCorreccio.mostrarCadena("Has entrat la cadena de caràcters: " + cadenaDeLletres + "\n");
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }

    public static void codiEsEnter() {
        // Provant la funció esEnter()
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("esEnter()");
        teclat = new Scanner(System.in);
        char caracterLlegit;
        int enterLlegit = 0;
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        boolean esUnDigit = false;
        do {
            try {
                esUnDigit = false;
                AppCorreccio.mostrarCadena("Entra un enter (del 0 al 9): ");
                enterLlegit = teclat.nextInt(); //  .nextLine().charAt(0);
                if (enterLlegit <= 9 && enterLlegit >= 0) {
                    esUnDigit = true;
                } else {
                    AppCorreccio.mostrarError("Cal que sigui entre 0 i 9!");
                }
            } catch (Exception e) {
                AppCorreccio.mostrarError("Només pots entrar nombres!");
            } finally {
                teclat = new Scanner(System.in);
            }
        } while (esUnDigit == false);
        caracterLlegit = String.valueOf(enterLlegit).charAt(0);
        if (Bac20220121.esEnter(caracterLlegit)) {
            AppCorreccio.mostrarMissatgeMaco("El caràcter " + caracterLlegit + " entrat és un enter!");
        } else {
            AppCorreccio.mostrarMissatgeMaco("El caràcter " + caracterLlegit + " entrat NO és un enter!");
        }
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }

    public static void codiEsLletra() {
        // Provant la funció esLletra()
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("esLletra()");
        teclat = new Scanner(System.in);
        char caracterLlegit;
        boolean esLletra = false;
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.mostrarCadena("Entra un caràcter: ");
        do {
            esLletra = false;
            caracterLlegit = AppCorreccio.llegirLletraTeclat();
            if (Bac20220121.esLletra(caracterLlegit)) {
                esLletra = true;
            }
        } while (esLletra == false);
        AppCorreccio.mostrarMissatgeMaco("Has entrat el caràcter: " + caracterLlegit + "\n");
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }

    static void codiMostrarMissatgeSegonsSaltLinea() {
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("mostrarMissatgeSegonsSaltLinea()");
        teclat = new Scanner(System.in);
        String cadAMostrar = "";
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        System.out.print("Entra una cadena per fer la comprovació: ");
        cadAMostrar = AppCorreccio.llegirCadenaDeLletres();
        AppCorreccio.pausa("Pitja una tecla per veure la candena entrada AMB un salt de linia.");
        System.out.println();
        Bac20220121.mostrarMissatgeSegonsSaltLinea(cadAMostrar, true);
        System.out.print("Aquesta línia apareix després la cadena!\n");
        AppCorreccio.pausa("Pitja una tecla per veure la candena entrada SENSE un salt de linia.");
        System.out.println();
        Bac20220121.mostrarMissatgeSegonsSaltLinea(cadAMostrar, false);
        System.out.print("Aquesta línia apareix després la cadena!\n");
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }

    static void codiTrobaNombre() {
        // Provant la funció trobaNombre(int nombre, int[] array)
        final int MAX = 100;
        boolean acaba = false;
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("trobaNombre()");
        int[] arrayNombres = new int[MAX];
        int nombreLlegit, posicioNombreTrobat, comptador = 0;
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        System.out.print(cadMostraFuncio);
        do {
            System.out.print("Entra un nombre (-1 per acabar!): ");
            nombreLlegit = AppCorreccio.llegirNombreTeclat();
            if ((nombreLlegit == -1) || comptador == MAX) {
                acaba = true;
            }
            arrayNombres[comptador] = nombreLlegit;
            comptador++;
        } while (!(acaba));
        System.out.print("Ara entra el nombre a buscar: ");
        nombreLlegit = teclat.nextInt();
        posicioNombreTrobat = Bac20220121.trobaNombre(nombreLlegit, arrayNombres);
        if (posicioNombreTrobat != -1) {
            System.out.print("El nombre " + nombreLlegit + " s'ha trobat a la posició "
                    + posicioNombreTrobat + " entre tots els nombres que has introduit!");
        } else {
            System.out.print(
                    "El nombre " + nombreLlegit + " NO s'ha trobat entre tots els nombres que has introduit!");
        }
        System.out.println();
        System.out.print(cadMostraFuncio);
    }

    public static void main(String[] args) {
        boolean volSortir = false;

        // operacions[0] <= Titol
        // operacions[1] <= Text escull opcio

        String[] operacions = {
                "Quina funció vols provar?",
                "Entra una opció",
                "mostrarMissatge(String cadena)",
                "llegirEnterTeclat()",
                "llegirCaracterTeclat()",
                "llegirCadenaDeLletresTeclat()",
                "esEnter(char valorLlegit)",
                "esLletra(char valorLlegit)",
                "mostrarMissatgeSegonsSaltLinea(String cadena, boolean salt)",
                "trobaNombre(int nombre, int[] array)",
                "Sortir" };
        do {
            AppCorreccio.netejaConsola();
            switch (AppCorreccio.escullOpcio(operacions)) {
                case 1:
                    codiMostrarMissatge(); // Provant la funció mostrarMissatge()
                    break;
                case 2:
                    codiLlegirEnterTeclat();
                    break;
                case 3:
                    codiLlegirCaracterTeclat();
                    break;
                case 4:
                    codiLlegirCadenaDeLletresTeclat();
                    break;
                case 5:
                    codiEsEnter();
                    break;
                case 6:
                    codiEsLletra();
                    break;
                case 7:
                    codiMostrarMissatgeSegonsSaltLinea();
                    break;
                case 8:
                    codiTrobaNombre();
                    break;
                case 9:
                    volSortir = true;
                    break;
                default:
                    AppCorreccio.mostrarError("Has d'entrar una de les opcions demandes!");
                    break;
            }
            if (!(volSortir)) {
                AppCorreccio.pausa(AppCorreccio.missProvaFuncio("Pitja una tecla per tornar al menú!") + "\n");
                AppCorreccio.netejaConsola();
            }
        } while (!(volSortir));

        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarMissatgeMaco("Que passis un molt bon dia!");
        AppCorreccio.mostrarMissatgeMaco("Fins la propera!!");
        AppCorreccio.pintaBarra();
    }

}
