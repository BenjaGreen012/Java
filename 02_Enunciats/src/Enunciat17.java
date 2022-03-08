import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        int a=50;
        int b=70;
        int c=80;
        int d=190;
        int hec;
        double tot=0;
        hec=tl.nextInt();
        String es;
        es=tl.next();
        if (es=="a") {
            tot=a*hec;
        }
        if (es=="b") {
            tot=b*hec;
        }
        if (es=="c") {
            tot=c*hec;
        }
        if (es=="d") {
            tot=d*hec;
        }
        if (hec>100) {
            tot=tot*0.05;
        }
        if (tot>1000) {
            tot=tot-(tot*0.1);
        }
        System.out.println(tot);
    }
}
