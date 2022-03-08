public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[][] multi=new int[10][10];
        for (int i = 1; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                multi[i][j]=(i+1)*(j+1);
            }
        }
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.print("|"+(i+1)+" x "+(j+1)+" = "+multi[i][j]+"|");
            }
            System.out.println("");
        }
    }
}
