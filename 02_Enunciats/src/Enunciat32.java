public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numgran=0;
        int nums;
        int[] cositas={34,123,324,78,45};
        for (int i = 0; i < cositas.length; i++) {
            if (i==0) {
                nums=cositas[i]-cositas[1];
            }else{
                nums=cositas[i]-cositas[i-1];
            }if (nums<0) {
                nums=nums*-1;
            }
            if (nums>numgran) {
                numgran=nums;
            }
        }

        System.out.println("La diferencia maxima es: "+numgran);
    }
}
