package ArmijoBenjaFuncions;

public class Enunciat6 {
    public static void main(String[] args) {
        int matriu[][]=new int[3][3];
        int matriu1[][]=new int[3][3];
        int matriu2[][]=new int[6][3];
        int cont1=0;
        int cont2=0;
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=(int)(Math.random()*10);
                matriu1[j][i]=matriu[i][j];
                System.out.print(matriu[i][j]);
            }
            System.out.println("");
        }
        System.out.println("==================");
        for (int i = 0; i < matriu2.length; i++) {
            if (i%2==0) {
                matriu2[i]=matriu[cont1];
                cont1=cont1+1;
            }else{
                matriu2[i]=matriu1[cont2];
                cont2=cont2+1;
            }
            
        }
        for (int i = 0; i < matriu2.length; i++) {
            for (int j = 0; j < matriu2[i].length; j++) {
                System.out.print(matriu2[i][j]);
            }
            System.out.println("");
        }
    }
}
