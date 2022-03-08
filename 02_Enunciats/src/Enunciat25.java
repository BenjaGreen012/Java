import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] arrEntrada=new String[5];
        int[][] cont=new int[5][5];
        char[] vocales={'a','e','i','o','u'};
        Scanner tl=new Scanner(System.in);
        for (int i = 0; i < arrEntrada.length; i++) {
            arrEntrada[i]=tl.nextLine();
            for (int j = 0; j < arrEntrada[i].toLowerCase().length(); j++) {
                for (int j2 = 0; j2 < vocales.length; j2++) {
                    if (arrEntrada[i].charAt(j)==vocales[j2]) {
                      cont[i][j2]++;  
                    }
                }
            } 
            System.out.println("A= "+cont[i][0]);
            System.out.println("E= "+cont[i][1]);
            System.out.println("I= "+cont[i][2]);
            System.out.println("O= "+cont[i][3]);
            System.out.println("U= "+cont[i][4]); 
            if ((cont[i][0]>0)&&(cont[i][1]>0)&&(cont[i][2]>0)&&(cont[i][3]>0)&&(cont[i][4]>0)) {
                System.out.println("Esta palabra tiene las 5 vocales simultaniamente: "+arrEntrada[i]);
            }else{
                System.out.println("Esta palabra no tiene las 5 vocales simultaniamente");
            }
        }
        
        tl.close();
    }
}
