public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arrayA={3,7,13,19};
        int[] arrayB={8,10,12};
        int[] arrayResultat= new int[7];
        int a=0;
        int b=0;
        boolean a2=false;
        boolean b2=false;
        for (int i = 0; i < arrayResultat.length; i++) {
            if (arrayA[a]<arrayB[b]) {
                arrayResultat[i]=arrayA[a];
                if (a<arrayA.length-1) {
                    a++;
                }else{
                    a2=true;
                }
                System.out.println(arrayResultat[i]);
            }else{
                arrayResultat[i]=arrayB[b];
                if (b<arrayB.length-1) {
                    b++;
                }else{
                    b2=true;
                }
                System.out.println(arrayResultat[i]);
            }
            if (b2==true) {
                
            }
        }
        for (int i = 0; i < arrayResultat.length; i++) {
            System.out.print(arrayResultat[i]+" ");
        }
    }
}
