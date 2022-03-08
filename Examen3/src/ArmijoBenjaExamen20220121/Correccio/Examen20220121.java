//package ArmijoBenjaExamen20220121;

public class Examen20220121 {
    public static void main(String[] args) {
        Bac20220121.hello();
        // int[] array=new int[5];
        // for (int i = 0; i < array.length; i++) {
        //     array[i]=i+1;
        // }
        //String cadena=Bac20220121.tl.nextLine();
        //Bac20220121.mostrarMissatge(cadena);
        //Bac20220121.llegirEnterTeclat();
        // Bac20220121.llegirCaracterTeclat();
        //Bac20220121.llegirCadenaDeLletres();
        //System.out.println(Bac20220121.esEnter(Bac20220121.llegirCaracterTeclat()));
        //System.out.println(Bac20220121.esLletra(Bac20220121.llegirCaracterTeclat()));
        //Bac20220121.mostrarMissatgeSaltLinea(cadena, false);
        //System.out.println(Bac20220121.trobaNombre(10, array));


        





        //Programa Principal
        //Crea un programa on demani un numero i comproba si esta a la taula ascii (0-255), comproba si en una array del 0 al 255 en quina posiso estan els dos numeros entrats
        char num1=Bac20220121.llegirCaracterTeclat();
        int []array= new int[255];
        int pusicio;
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        boolean esLletranum1;
        boolean esNumNum1;
        esLletranum1=Bac20220121.esLletra(num1);
        esNumNum1=Bac20220121.esEnter(num1);
        pusicio=Bac20220121.trobaNombre(num1, array);
        if (esNumNum1==true) {
            System.out.println("El numero introduit es un numero el cual es"+num1);
        }else{
            if (esLletranum1==true) {
                System.out.println("El numero introduit es una lletra la cual es "+num1);
            }else{
                System.out.println("El numero introduit es un carter el cual es "+num1);
            }
        }
        System.out.println("En una array de 255 pusicions el esta en la pusicio "+pusicio);
    }

}
