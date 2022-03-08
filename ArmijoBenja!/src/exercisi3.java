import java.util.Scanner;

public class exercisi3 {
    public static void main(String[] args) throws Exception {
        int num;
        int cont=0;
        int vuelt=0;
        Scanner tl=new Scanner(System.in);
        num=tl.nextInt();
        while (num>cont) {
            cont++;
            if (cont>1) {
             while (cont!=vuelt) {
                 System.out.print(cont);
                 vuelt++;
             }
             System.out.println("");
             vuelt=0;  
            }else{
                System.out.println(cont);
            }
        }
    }
}