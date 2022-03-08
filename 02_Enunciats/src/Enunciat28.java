import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int valorn;
        int valork;
        int cont=0;
        valorn=tl.nextInt();
        valork=tl.nextInt();
        int[] nums=new int [valorn];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=(int) (Math.random()*100);
            if (nums[i]%valork==0) {
                cont++;
                System.out.println("El numero es multiple de "+valork+" en total hi han "+cont+". El numero es: "+nums[i]);
            }else{
                System.out.println("Este numero no es multiple");
            }

        }
    }
}
