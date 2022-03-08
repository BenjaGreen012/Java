import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Benjamin Armijo i Ismael De los Reyes
        String[] catego = { "ESMORZAR", "COPAS", "DINAR", "BRENAR", "SOPAR" };
        String linea;
        String mast="";
        String menost="";
        String superior="";
        float precio;
        float mas=0;
        float menos=1000000;
        char lletra;
        float medianaConCopas= 0;
        float medianaSinCopas = 0;
        try {
            File fitxer = new File("file.txt");
            Scanner filScanner = new Scanner(fitxer);
            while (filScanner.hasNextLine()) {
                linea = filScanner.nextLine();
                lletra=linea.charAt(0);
                precio = Float.parseFloat(linea.substring(2));
                medianaConCopas=medianaConCopas+precio;
                if (lletra!='C') {
                    medianaSinCopas=medianaSinCopas+precio;
                }
                if (precio>mas) {
                    mas=precio;
                    for (int i = 0; i < catego.length; i++) {
                        if (catego[i].charAt(0)==lletra) {
                            mast=catego[i];
                        }
                    }
                }
                if (menos>precio) {
                    menos=precio;
                    for (int i = 0; i < catego.length; i++) {
                        if (catego[i].charAt(0)==lletra) {
                            menost=catego[i];
                        }
                    }
                }

            }
            medianaConCopas=medianaConCopas/catego.length;
            medianaSinCopas=medianaSinCopas/catego.length-1;
            if (medianaConCopas<medianaSinCopas) {
                superior="SI";
            }else{
                superior="NO";
            }
            filScanner.close();
            System.out.println(mast+"#"+menost+"#"+superior);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
