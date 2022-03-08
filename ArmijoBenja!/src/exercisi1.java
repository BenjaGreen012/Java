import java.util.Scanner;

public class exercisi1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int num;
        int num2;
        int continco=0;
        int tot=0;
        Scanner tl=new Scanner(System.in);
        num=tl.nextInt();
        do {
            num2=tl.nextInt();
            if (num2!=0) {
                tot++;
                if (num2<num) {
                    System.out.println("Numero incorrecte");
                    continco++;
                }else{
                    System.out.println("Numero correcte");
                }
            }
        } while (num2!=0);
        System.out.println("Total numeros intoduits: "+tot);
        System.out.println("Total errors: "+continco);

    }
}
