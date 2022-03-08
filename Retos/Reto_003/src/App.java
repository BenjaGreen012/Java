import java.io.File;
import java.util.Scanner;

public class App {
    public static String llegirLinea(String nomFitxer) {
        String linea = " ";
        try {
            File fitxer = new File(nomFitxer);
            Scanner filScanner = new Scanner(fitxer);
            linea = filScanner.nextLine();
            filScanner.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

        return linea;
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

    public static int arrayGrande(String[] array1, String[] array2) {
        int num1 = array1.length;
        int num2 = array2.length;
        int grande = 0;
        if (num1 > num2) {
            grande = num1;
        } else {
            grande = num2;
        }
        return grande;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String linea;
        int vesex;
        String siONo;
        String ingred;
        int cont = 1;
        int arrayGrande;
        String[] menuSi = new String[10];
        String[] menuNo = new String[10];
        String[] noGuta = new String[10];
        try {

            File fitxer = new File("src\\filein.txt");
            Scanner filScanner = new Scanner(fitxer);
            linea = filScanner.nextLine();
            vesex = Integer.parseInt(linea);
            System.out.println(vesex);
            while (cont <= vesex) {
                linea = filScanner.nextLine();
                ingred = linea.substring(4);
                siONo = linea.substring(0, 2);
                if (siONo.equals("SI")) {
                    menuSi = ingred.split(" ");
                    System.out.println("SI");
                    for (int i = 0; i < menuSi.length; i++) {
                        System.out.print(menuSi[i] + " ");
                    }
                    System.out.println(" ");
                }
                if (siONo.equals("NO")) {
                    menuNo = ingred.split(" ");
                    System.out.println("NO");
                    for (int i = 0; i < menuNo.length; i++) {
                        System.out.print(menuNo[i] + " ");
                    }
                    System.out.println(" ");
                }
                if (cont>1) {
                    arrayGrande=arrayGrande(menuNo, menuSi);
                    for (int i = 0; i < arrayGrande; i++) {
                        for (int j = 0; j < arrayGrande; j++) {
                            if (menuSi[i].equals(menuNo[j])) {
                                menuSi[i]="";
                                menuNo[j]="";
                            }
                        }
                    }
                }
                cont++;
            }
            filScanner.close();
        } catch (

        Exception e) {
        }
        try {
            for (int i = 0; i < noGuta.length; i++) {
                noGuta[i]=menuNo[i]; 
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
