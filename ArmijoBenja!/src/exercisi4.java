import java.util.Scanner;

public class exercisi4 {
    public static void main(String[] args) throws Exception {
        int num;
        int num2;
        int parell;
        int contpar=0;
        Scanner tl=new Scanner(System.in);
        System.out.println("Numero uno");
        num=tl.nextInt();
        System.out.println("Numero dos");
        num2=tl.nextInt();
        if (num2<num) {
            System.out.println("Error");
        }else{
            while (num2>num) {
                num++;
                parell=num%2;
                if (parell==0) {
                    contpar++;
                }
            }
            System.out.println("El nombre de parrells son "+contpar);
        }
    }
}
