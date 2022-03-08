public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! .l.");
        char[] par={'f','g','n','p','r','o','g','r','a','m','a','u','u','g'};
        char[] cad={'p','r','o','g','r','a','m','a'};
        int j=0;
        try {
            for (int i = 0; i < par.length; i++) {
                if (par[i]==cad[j]) {
                    System.out.print(cad[j]);
                    j++;
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(" ");
            System.out.println("Todo OK");
        }
    }
}
