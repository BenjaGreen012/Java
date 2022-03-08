import java.util.Scanner;

public class Enunciat3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner (System.in);
        float euros;
        double eurostot;
        double euroskm;
        int kmi;
        int kmf;
        int kmt;
        System.out.print("Euros gastados: ");
        euros=tl.nextInt();
        System.out.print("Km inici: ");
        kmi= tl.nextInt();
        System.out.print("Km final: ");
        kmf= tl.nextInt();
        kmt=kmf-kmi;
        System.out.println("Has echo "+kmt+" Km");
        eurostot=(euros/kmt)*100;
        System.out.println("Cada 100 km tu coche consume "+eurostot+" litros");
        euroskm=eurostot/100;
        System.out.println("Un kilometro te custa "+euroskm);
    }
}
