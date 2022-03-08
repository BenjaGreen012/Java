import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Programa registar sous Dona,Homa, detectar si hi ha diferencia. Demana N=Empleados, per persona G(H(0) o M(1)) i Sou (Tot en una matriu). Mostra sou mitg
        int n;
        int muj=0;
        int hom=0;
        double sm=0;
        double sh=0;
        Scanner tl=new Scanner(System.in);
        System.out.println("Cuantos? ");
        n=tl.nextInt();
        double[][] sou=new double[n][2];
        for (int i = 0; i < sou.length; i++) {
            System.out.println("H(0) o M(1)");
            sou[i][0]=tl.nextInt();
            System.out.println("Sou? ");
            sou[i][1]=tl.nextDouble();
        }
        for (int i = 0; i < sou.length; i++) {
            if (sou[i][0]==1) {
                muj++;
                sm=sm+sou[i][1];
            }
            if (sou[i][0]==0) {
                hom++;
                sh=sh+sou[i][1];
            }
        }
        System.out.println("Media hombres= "+(sh/hom));
        System.out.println("Media mujeres= "+(sm/muj));
    }
}
