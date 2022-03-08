import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;   
public class App {
    static Scanner tl = new Scanner(System.in);
    static String[] palabras = { "SALTAR", "MENJAR", "VIURE" };
    static String[][] conjugacioVerbs = {
            { "jo salto#tu saltes#ell salta#nosaltres saltem#vosaltres salteu#ells salten",
                    "jo he saltat#tu has saltat#ell ha saltat#nosaltres hem saltat#vosaltres heu saltat#ells han saltat",
                    "jo saltaré#tu saltaràs#ell saltarà#nosaltres saltarem#vosaltres saltareu#ells saltaran" },
            { "jo menjo#tu menges#ell menja#nosaltres mengem#vosaltres mengeu#ells mengen",
                    "jo he menjat#tu has menjat#ell ha menjat#nosaltres hem menjat#vosaltres heu menjat#ells han menjat",
                    "jo menjaré#tu menjaràs#ell menjarà#nosaltres menjarem#vosaltres menjareu#ells menjaran" },
            { "jo visc#tu vius#ell viu#nosaltres vivim#vosaltres viviu#ells viuen",
                    "jo he viscut#tu has viscut#ell ha viscut#nosaltres hem viscut#vosaltres heu viscut#ells han viscut",
                    "jo viuré#tu viuràs#ell viurà#nosaltres viurem#vosaltres viureu#ells viuran" }
    };

    static int verb(String[] array, int i) {
        int numero = 0;

        switch (array[i]) {
            case "SALTAR":

                numero = 0;
                break;
            case "MENJAR":

                numero = 1;
                break;
            case "VIURE":

                numero = 2;
                break;
        }
        return numero;
    }

    static String separar(String[][] array, int numero1, int numero2) {
        String linea="";
        String text;
        text = conjugacioVerbs[numero1][numero2];
        String cadena2 = text;
        String[] cal = cadena2.split("#");
        for (int j = 0; j < cal.length; j++) {
            linea=cal[j];
        }
        return linea;
    }

    static String conjugacion(String[] array, int i, int numero1) {
        String linea="";
        switch (array[i]) {
            case "A":

                linea=separar(conjugacioVerbs, numero1, 0);

                break;
            case "P":

               linea=separar(conjugacioVerbs, numero1, 1);

                break;
            case "F":

                linea=separar(conjugacioVerbs, numero1, 2);

                break;
            case "T":

                break;

        }
        return linea;
    }

    public static void main(String[] args) throws Exception {
        String txt;
        int numero = 0;
        FileWriter fileout = null;
        String frase = "";
        //int cont;
        try {
            File fichero = new File("filein.txt");
            Scanner sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                txt = sc.nextLine();
                String cadena = txt.toUpperCase();
                String[] parts = cadena.split(" ");
               // cont = 1;
                fileout=new FileWriter("fileout.txt",false);
                for (int i = 0; i < parts.length; i++) {
                    switch (i) {
                        case 0:
                            numero = verb(parts, i);
                            break;
                        case 1:
                            frase=conjugacion(parts, i, numero);
                            System.out.println(frase);
                            break;
                    }
                    //cont++;
                }
            }
            fileout.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}