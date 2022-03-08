
import java.io.FileWriter;
import java.util.Scanner;

public class Enunciat8 {
    public static Scanner tl = new Scanner(System.in);
    private static final int MIN = 0;
    private static final int MAX = 7;

    private static void comprobarEsquinas(String[][] mapa, int pos1, int pos2, String texto, String textoTocado) {
        if (pos1 == MIN && pos2 == MIN) {
            if (mapa[pos1][pos2 + 1] == "a" && mapa[pos1 + 1][pos2] == "a") {
                System.out.println(texto);
            } else {
                if (mapa[pos1][pos2 + 1] == "v" || mapa[pos1 + 1][pos2] == "v") {
                    System.out.println(textoTocado);
                } else {
                    System.out.println(texto);
                }
            }
        }
        if (pos1 == MIN && pos2 == MAX) {
            if (mapa[pos1][pos2 - 1] == "a" && mapa[pos1 + 1][pos2] == "a") {
                System.out.println(texto);
            } else {
                if (mapa[pos1][pos2 - 1] == "v" || mapa[pos1 + 1][pos2] == "v") {
                    System.out.println(textoTocado);
                } else {
                    System.out.println(texto);
                }
            }
        }
        if (pos1 == MAX && pos2 == MIN) {
            if (mapa[pos1 - 1][pos2] == "a" && mapa[pos1][pos2 + 1] == "a") {
                System.out.println(texto);
            } else {
                if (mapa[pos1 - 1][pos2] == "v" && mapa[pos1][pos2 + 1] == "v") {
                    System.out.println(textoTocado);
                } else {
                    System.out.println(texto);
                }
            }
        }
        if (pos1 == MAX && pos2 == MAX) {
            if (mapa[pos1 - 1][pos2] == "a" && mapa[pos1][pos2 - 1] == "a") {
                System.out.println(texto);
            } else {
                if (mapa[pos1 - 1][pos2] == "v" || mapa[pos1][pos2 - 1] == "v") {
                    System.out.println(textoTocado);
                } else {
                    System.out.println(texto);
                }
            }
        }
    }

    private static void comprobarLaterales(String[][] mapa, int pos1, int pos2, String texto, String textoTocado) {
        if (pos2 == MIN && pos1 < MAX && pos1 > MIN) {
            if (mapa[pos1 - 1][pos2] == "a" && mapa[pos1 + 1][pos2] == "a" && mapa[pos1][pos2 + 1] == "a") {
                System.out.println(texto);
            } else {
                if (mapa[pos1 - 1][pos2] == "v" || mapa[pos1 + 1][pos2] == "v" || mapa[pos1][pos2 + 1] == "v") {
                    System.out.println(textoTocado);
                } else {
                    System.out.println(texto);
                }
            }
        }
        if (pos1 == MIN && pos2 < MAX && pos2 > MIN) {
            if (mapa[pos1 + 1][pos2] == "a" && mapa[pos1][pos2 - 1] == "a" && mapa[pos1][pos2 + 1] == "a") {
                System.out.println(texto);
            } else {
                if (mapa[pos1 + 1][pos2] == "v" || mapa[pos1][pos2 - 1] == "v" || mapa[pos1][pos2 + 1] == "v") {
                    System.out.println(textoTocado);
                } else {
                    System.out.println(texto);
                }
            }
        }
        if (pos1 == MAX && pos2 > MIN && pos2 < MAX) {
            if (mapa[pos1 - 1][pos2] == "a" && mapa[pos1][pos2 - 1] == "a" && mapa[pos1][pos2 + 1] == "a") {
                System.out.println(texto);
            } else {
                if (mapa[pos1 - 1][pos2] == "v" || mapa[pos1][pos2 - 1] == "v" || mapa[pos1][pos2 + 1] == "v") {
                    System.out.println(textoTocado);
                } else {
                    System.out.println(texto);
                }
            }
        }
        if (pos2 == MAX && pos1 < MAX && pos1 > MIN) {
            if (mapa[pos1][pos2 - 1] == "a" && mapa[pos1 - 1][pos2] == "a" && mapa[pos1 + 1][pos2] == "a") {
                System.out.println(texto);
            } else {
                if (mapa[pos1][pos2 - 1] == "v" || mapa[pos1 - 1][pos2] == "v" || mapa[pos1 + 1][pos2] == "v") {
                    System.out.println(textoTocado);
                } else {
                    System.out.println(texto);
                }
            }
        }
    }

    private static void guardadParitdaEnFichero(String[][] mapa1, String[][] mapa2) {
        try {
            FileWriter esc = new FileWriter("partidaGuardada.txt", false);
            esc.write("El mapa del jugador 1");
            esc.write("\n");
            for (int i = 0; i < mapa1.length; i++) {
                for (int j = 0; j < mapa1.length; j++) {
                    esc.write(mapa1[i][j]+" ");
                }
                esc.write("\n");
            }
            esc.write("=========================");
            esc.write("\n");
            esc.write("El mapa del jugador 2");
            esc.write("\n");
            for (int i = 0; i < mapa2.length; i++) {
                for (int j = 0; j < mapa2.length; j++) {
                    esc.write(mapa2[i][j]+" ");
                }
                esc.write("\n");
            }
            esc.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    private static void comprobarCentro(String[][] mapa, int pos1, int pos2, String textTocado, String textoHundido) {
        if (pos1 < MAX && pos1 > MIN && pos2 < MAX && pos2 > MIN) {
            if (mapa[pos1 + 1][pos2] == "a" && mapa[pos1][pos2 + 1] == "a" && mapa[pos1 - 1][pos2] == "a"
                    && mapa[pos1][pos2 - 1] == "a") {
                System.out.println(textoHundido);
            } else {
                if (mapa[pos1 + 1][pos2] == "v" || mapa[pos1][pos2 + 1] == "v" || mapa[pos1 - 1][pos2] == "v"
                        || mapa[pos1][pos2 - 1] == "v") {
                    System.out.println(textTocado);
                } else {
                    System.out.println(textoHundido);
                }
            }
        }
    }

    public static void h() {
        System.out.println("Hello Word!");
    }

    public static int demanarNumero() {
        int num = 0;
        boolean numInco = false;
        do {
            try {
                numInco = false;
                System.out.print("Un numero: ");
                num = tl.nextInt();
            } catch (Exception e) {
                System.out.println("Nomes numeros tonto!");
                numInco = true;
                tl.nextLine();
            }
        } while (numInco != false);
        return num;
    }

    public static void main(String[] args) {
        h();
        final int MIDA = 8;
        String[][] mapa1 = new String[MIDA][MIDA];
        String[][] mapa2 = new String[MIDA][MIDA];
        int pos1Jug1;
        int pos2Jug1;
        int pos1Jug2;
        int pos2Jug2;
        int ju1Pos1;
        int ju1Pos2;
        int ju2Pos1;
        int ju2Pos2;
        int guardarPartida;
        int barcos1 = 5;
        int barcos2 = 5;
        String textoJugado1 = "Jugador 1";
        String textTocado = "Tocado (Ojala tocar a una loli)";
        String textMaxMin = MIN + " a " + MAX;
        String textoAgua = "Agua";
        String textoHundido = "Barco hundido";
        String textoJugador2 = "Jugador 2";
        String Posicion1 = "Posicio 1";
        String Posicion2 = "Posicio 2";
        String barco = "v";
        for (int i = MIN; i < mapa1.length; i++) {
            for (int j = MIN; j < mapa1[i].length; j++) {
                mapa1[i][j] = "a";

                mapa2[i][j] = "a";
            }
        }
        for (int i = MIN; i < barcos1; i++) {
            System.out.println(textoJugado1);
            System.out.println(Posicion1);
            do {
                System.out.println(textMaxMin);
                pos1Jug1 = demanarNumero();
            } while (pos1Jug1 < MIN || pos1Jug1 > MAX);
            System.out.println(Posicion2);
            do {
                System.out.println(textMaxMin);
                pos2Jug1 = demanarNumero();
            } while (pos2Jug1 < MIN || pos2Jug1 > MAX);
            if (mapa1[pos1Jug1][pos2Jug1].equals(barco)) {
                i--;
            } else {
                mapa1[pos1Jug1][pos2Jug1] = barco;
            }
        }
        for (int i = MIN; i < barcos2; i++) {
            System.out.println(textoJugador2);
            System.out.println(Posicion1);
            do {
                System.out.println(textMaxMin);
                pos1Jug2 = demanarNumero();
            } while (pos1Jug2 < MIN || pos1Jug2 > MAX);
            System.out.println(Posicion2);
            do {
                System.out.println(textMaxMin);
                pos2Jug2 = demanarNumero();
            } while (pos2Jug2 < MIN || pos2Jug2 > MAX);
            if (mapa2[pos1Jug2][pos2Jug2].equals(barco)) {
                i--;
            } else {
                mapa2[pos1Jug2][pos2Jug2] = barco;
            }
        }
        System.out.println("====Empieza el juego====");
        while (barcos2 != MIN && barcos1 != MIN) {
            System.out.println(textoJugado1);
            do {
                ju1Pos1 = demanarNumero();
            } while (ju1Pos1 < MIN || ju1Pos1 > MAX);
            do {
                ju1Pos2 = demanarNumero();
            } while (ju1Pos2 < MIN || ju1Pos2 > MAX);
            if (mapa2[ju1Pos1][ju1Pos2].equals(barco)) {
                barcos1 = barcos1 - 1;
                mapa2[ju1Pos1][ju1Pos2] = "t";
                comprobarEsquinas(mapa2, ju1Pos1, ju1Pos2, textoHundido, textTocado);
                comprobarLaterales(mapa2, ju1Pos1, ju1Pos2, textoHundido, textTocado);
                comprobarCentro(mapa2, ju1Pos1, ju1Pos2, textTocado, textoHundido);

            } else {
                System.out.println(textoAgua);
            }
            if (barcos1 == MIN) {
                System.out.println("Ha ganado el jugador 1");
                break;
            }
            System.out.println("=======================");
            System.out.println(textoJugador2);
            do {
                ju2Pos1 = demanarNumero();
            } while (ju2Pos1 < MIN || ju2Pos1 > MAX);
            do {
                ju2Pos2 = demanarNumero();
            } while (ju2Pos2 < MIN || ju2Pos2 > MAX);
            if (mapa1[ju2Pos1][ju2Pos2].equals(barco)) {
                barcos2 = barcos2 - 1;
                mapa1[ju2Pos1][ju2Pos2] = "t";
                comprobarEsquinas(mapa1, ju2Pos1, ju2Pos2, textoHundido, textTocado);
                comprobarLaterales(mapa1, ju2Pos1, ju2Pos2, textoHundido, textTocado);
                comprobarCentro(mapa1, ju2Pos1, ju2Pos2, textTocado, textoHundido);
            } else {
                System.out.println(textoAgua);
            }
            if (barcos2 == MIN) {
                System.out.println("Ha ganado el jugador 2");
                break;
            }
            System.out.println("Guardar partida y salir?");
            do {
                System.out.println("SI (1) y NO (2)");
                guardarPartida=demanarNumero();
            } while (guardarPartida>2&&guardarPartida<1);
            if (guardarPartida==1) {
                guardadParitdaEnFichero(mapa1, mapa2);
                break;
            }
        }
    }
}
