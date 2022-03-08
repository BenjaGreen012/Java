public class activitat4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] a1 = { 1, 2, 3, 4,10 };
        int[] a2 = { 5, 6, 7, 8,12 };
        int[] a3 = { 9, 10, 11, 12, 45 };
        int log = a1.length;
        int[][] matriu = new int[log][3];
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][0] = a1[i];
                matriu[i][1] = a2[i];
                matriu[i][2] = a3[i];
            }
        }
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
