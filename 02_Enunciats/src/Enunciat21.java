import java.sql.Array;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numeroAleatori;
        int conpa=0;
        int consen=0;
        int parsen;
        int[] parrels={0,0,0,0,0};
        int[] senars={0,0,0,0,0};
        while (conpa<5&&consen<5) {
            numeroAleatori = (int)(Math.random()*100);
            parsen=numeroAleatori%2;
            if (parsen==0){
                if(conpa<5){
                    parrels[conpa]=numeroAleatori;
                    conpa++;
                }
            }else{
                if(consen<5){
                    senars[consen]=numeroAleatori;
                    consen++;
                }
            }
        }
        for (int i = 0; i < senars.length; i++) {
            System.out.println("Senars "+senars[i]);
            System.out.println("Parells "+parrels[i]);
        }
    }
}
