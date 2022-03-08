//package ArmijoBenjaExamen20220121;

import java.util.Scanner;

public class Bac20220121 {
    public static Scanner tl=new Scanner(System.in);
    public static void hello(){
        System.out.println("Hello word!");
    }
    public static void mostrarMissatge(String cadena){
        System.out.println(cadena);
    }
    public static int llegirEnterTeclat() {
        int num=0;
        boolean numInco=false;
        do {
            try {
                numInco=false;
                System.out.print("Un numero: ");
                num=tl.nextInt();
            } catch (Exception e) {
                System.out.println("Nomes pots posar numeros");
                numInco=true;
                tl.nextLine();
            }
        } while (numInco!=false);
        return num;
    }
    public static char llegirCaracterTeclat(){
        int num;
        num=llegirEnterTeclat();
        char caracter=(char)num;
        return caracter;
    }
    public static String llegirCadenaDeLletres(){
        String cadena=tl.nextLine();
        return cadena;
    }
    public static boolean esEnter(char valorLlegit){
        boolean esEnter=false;
        if (valorLlegit>48&&valorLlegit<57) {
            esEnter=true;
        }
        return esEnter;
    }
    public static boolean esLletra(char valorLlegit){
        boolean esLletra=false;
        if (valorLlegit>65&&valorLlegit<90) {
            esLletra=true;
        }
        if (valorLlegit>97&&valorLlegit<122) {
            esLletra=true;
        }
        return esLletra;
    }
    public static void mostrarMissatgeSegonsSaltLinea(String cadena,boolean salt){
        if (salt==true) {
            System.out.println(cadena);
        }else{
            System.out.print(cadena);
        }
    }
    public static int trobaNombre(int num, int[] array){
        int pocisio=-1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num) {
                pocisio=i;
            }
        }
        
        return pocisio;
    }

}