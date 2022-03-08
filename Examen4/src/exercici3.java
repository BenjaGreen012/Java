import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class exercici3 {
    public static Scanner tl = new Scanner(System.in);

    public static int demanarNumero() {
        int num = 0;
        boolean numInco = false;
        do {
            try {
                numInco = false;
                System.out.print("Un numero: ");
                num = tl.nextInt();
            } catch (Exception e) {
                System.out.println("Nomes numeros Ivan!");
                numInco = true;
                tl.nextLine();
            }
        } while (numInco != false);
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String linea;
        String nom = "";
        String cognom = "";
        String nomYCognom;
        int numNom;
        int numCognom;
        int contVueltaNom;
        int contVueltaCognom;
        int maxNoms = 0;
        int maxCognoms = 0;
        int numeroDeNomGenerar = demanarNumero();
        tl.nextLine();
        int cont = 0;
        FileWriter txt = null;
        System.out.println("Nom del fitxer");
        String nomFitxer;
        nomFitxer = tl.nextLine();
        while (cont < numeroDeNomGenerar) {

            try {
                File fitxer = new File("noms.txt");
                Scanner filScanner = new Scanner(fitxer);
                while (filScanner.hasNextLine()) {
                    linea = filScanner.nextLine();
                    maxNoms++;
                }
                filScanner.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
            try {
                File fitxer = new File("cognoms.txt");
                Scanner filScanner = new Scanner(fitxer);
                while (filScanner.hasNextLine()) {
                    linea = filScanner.nextLine();
                    maxCognoms++;
                }
                filScanner.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
            numNom =(int) (Math.random() * (maxNoms));
            numCognom =(int) (Math.random() * (maxCognoms));
            System.out.println(numNom);
            System.out.println(numCognom);
            try {
                contVueltaNom = 0;
                File fitxer = new File("noms.txt");
                Scanner filScanner = new Scanner(fitxer);
                while (filScanner.hasNextLine()) {
                    linea = filScanner.nextLine();
                    if (contVueltaNom == numNom) {
                        nom = linea;
                    }
                    contVueltaNom++;
                }
                filScanner.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
            try {
                contVueltaCognom = 0;
                File fitxer = new File("cognoms.txt");
                Scanner filScanner = new Scanner(fitxer);
                while (filScanner.hasNextLine()) {
                    linea = filScanner.nextLine();
                    if (contVueltaCognom == numCognom) {
                        cognom = linea;
                    }
                    contVueltaCognom++;
                }
                filScanner.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
            nomYCognom = nom + " " + cognom;
            System.out.println(nomYCognom);
            try {
                txt = new FileWriter(nomFitxer, true);
                txt.write(nomYCognom + "\n");
                txt.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
            cont++;

        }

    }
}
