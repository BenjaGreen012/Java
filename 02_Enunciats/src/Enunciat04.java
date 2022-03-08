import java.util.Scanner;

public class Enunciat4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        final float ret=18;
        int quantitat;
        float inters;
        int mesos;
        float ineteres;
        System.out.print("Quantitat: ");
        quantitat = tl.nextInt();
        System.out.print("Interès bancari: ");
        inters=tl.nextInt();
        System.out.print("Mesos: ");
        mesos=tl.nextInt();
        ineteres=quantitat*(inters/100/12)*mesos;
        System.out.println("Interès generat "+ineteres);
        ineteres=ineteres-(ineteres*ret)/100;
        System.out.println("Interès generat amb retreccions "+ineteres);
    }
}
