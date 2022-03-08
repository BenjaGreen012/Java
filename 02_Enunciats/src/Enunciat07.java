import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        Scanner tl=new Scanner(System.in);
        String[] mes = { "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge" };
        int numsem;
        numsem=tl.nextInt();
        while (numsem<1 || numsem>7) {
            numsem=tl.nextInt();
        }
        System.out.println(mes[numsem-1]);
    }
}
