import java.io.File;
import java.util.Scanner;

public class exercici2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String personas[];
        String nom;
        String cognom;
        String linea;
        int sumaTot=0;
        float mitjana;
        try {
            File fitxer=new File("alumnes_notes.txt");
            Scanner filScanner=new Scanner(fitxer);
            while (filScanner.hasNextLine()) {
                sumaTot=0;
                linea=filScanner.nextLine();
                personas=linea.split(" ");
                nom=personas[0];
                cognom=personas[1];
                for (int i = 2; i < personas.length; i++) {
                    sumaTot=Integer.parseInt(personas[i])+sumaTot;
                }
                mitjana=sumaTot/(personas.length-2);
                System.out.println(nom+" "+cognom+" "+mitjana);
            }
            filScanner.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
