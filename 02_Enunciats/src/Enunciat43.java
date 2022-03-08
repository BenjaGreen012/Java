public class App {
    static void decoraMatriu(int[][] matriuRebuda) {
        int columnes = matriuRebuda.length;
        for (int i = 0; i < matriuRebuda.length; i++) {
            for (int j = 0; j < matriuRebuda[i].length; j++) {
                if (matriuRebuda[i][j] < -9) {
                    System.out.print("|" + matriuRebuda[i][j]);
                } else {
                    if (matriuRebuda[i][j] < 0) {
                        System.out.print("| " + matriuRebuda[i][j]);
                    } else {
                        if (matriuRebuda[i][j] < 10) {
                            System.out.print("|  " + matriuRebuda[i][j]);
                        } else {
                            System.out.print("|" + matriuRebuda[i][j]);
                        }
                    }
                }
                System.out.println("|");
                pitaLineas(columnes);
            }
        }
    }

    static void pitaLineas(int columnes) {
        int cont = 0;
        do {
            System.out.print("+---");
            cont++;
        } while (cont < columnes);
        System.out.println("+");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    }
}
