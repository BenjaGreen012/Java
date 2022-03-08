public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int senar;
        for (int num=100;num>=0;num--){
            senar=num%2;
            if (senar!=0) {
                System.out.println(num);
            }
        }
    }
}
