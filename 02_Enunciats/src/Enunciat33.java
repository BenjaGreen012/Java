public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numgran=0;
        int nums;
        int posfi=0;
        int posfi1=0;
        int[] cositas={34,123,324,78,45};
        for (int i = 0; i < cositas.length; i++) {
            for (int j = i+1; j < cositas.length; j++) {
                nums=Math.abs(cositas[j]-cositas[i]);
                if (nums>numgran) {
                    numgran=nums;
                    posfi=j;
                    posfi1=i;
                }
            }
            }

        System.out.println("La diferencia maxima es: "+numgran+", son las pocisions "+posfi+" i "+posfi1);
    }
}
