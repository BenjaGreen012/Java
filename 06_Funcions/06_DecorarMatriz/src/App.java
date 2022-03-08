import java.util.Scanner;

public class App {
    static Scanner tl = new Scanner(System.in);
    static void pitalineas(int columnes){
        int cont=0;
        do {
            System.out.print("+---");
            cont++;
        } while (cont<columnes);
        System.out.println("+");
    }
    
    static void decoraMatriu(int[][] matriuRebuda){
        int columnes=matriuRebuda.length;
        for (int i = 0; i < matriuRebuda.length; i++) {
            for (int j = 0; j < matriuRebuda[i].length; j++) {
                if (matriuRebuda[i][j]<0) {
                    System.out.print("| "+matriuRebuda[i][j]);
                }else{
                    if (matriuRebuda[i][j]<10) {
                        System.out.print("|  "+matriuRebuda[i][j]);
                    }else{
                        System.out.print("|"+matriuRebuda[i][j]);
                    }
                }
            }
            System.out.println("|");
            pitalineas(columnes);
        }
    }
    
    static int demanarNumero() {
        int num=0;
        boolean numInco=false;
        do {
            try {
                numInco=false;
                System.out.println("Un numero:");
                num=tl.nextInt();
            } catch (Exception e) {
                System.out.println("Nomes numeros tonto!");
                numInco=true;
                tl.nextLine();
            }
        } while (numInco!=false);
        return num;
    }
    
    static void rellenarMatriu(int[][] matriuRebuda, int max, int min) {
        for (int i = 0; i < matriuRebuda.length; i++) {
            int num=(int) (Math.random() * (max - min) + min);
            for (int j = 0; j < matriuRebuda[i].length; j++) {
                if (existeixArray(matriuRebuda, num)) {
                    j--;
                }else{
                    matriuRebuda[i][j]=num;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }
}
