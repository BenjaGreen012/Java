public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[][] matrius=new int[11][11];
        for (int i = 1; i < matrius.length; i++) {
            for (int j = 1; j < matrius.length; j++) {
                matrius[i][j]=j;
            }
        }
        for (int i = 1; i < matrius.length; i++) {
            for (int j = 1; j < matrius.length; j++) {
                System.out.print(" "+matrius[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
