public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] potencia=new int[10];
        for (int i = 0; i < potencia.length; i++) {
            potencia[i]=(int)Math.pow(2, i);
            System.out.println(potencia[i]);
        }

    }
}
