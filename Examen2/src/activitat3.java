public class activitat3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int num = 10;
        int cont = 0;
        int vuelt = 0;
        int n = 0;
        int[] array = new int[55];
        while (num > cont) {
            cont++;
            if (cont > 1) {
                while (cont != vuelt) {
                    vuelt++;
                    array[n] = cont;
                    n++;
                }
                vuelt = 0;
            } else {
                array[n] = cont;
                n++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
