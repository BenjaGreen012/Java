package ArmijoBenjaFuncions;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Enunciat1 {
   public static void main(String[] args) {
       Bac.h();
       FileWriter txt=null;
       String linea;
       String[] nums;
       int sum;
        try {
            File fitxer=new File("src\\ArmijoBenjaFuncions\\fitxerEntrada.txt");
            Scanner filScanner=new Scanner(fitxer);
            txt=new FileWriter("fitxerSortida.txt",false);
            while (filScanner.hasNextLine()) {
                sum=0;
                linea=filScanner.nextLine();
                nums=linea.split(",");
                for (int i = 0; i < nums.length; i++) {
                    sum=sum+Integer.parseInt(nums[i]);
                }
                txt.write(nums[0]+","+nums[1]+","+sum+"\n");
            }
            txt.close();
            filScanner.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
   } 
}
