package ArmijoBenjaFuncions;

import java.io.FileWriter;

public class Enunciat3 {
    public static void main(String[] args) {
        Bac.h();
        FileWriter txt=null;
        int num1=Bac.demanarNumero();
        int num2=Bac.demanarNumero();
        int[][] mat=new int[num1][num2];
        Bac.rellenarMatriu(mat, 9, 1);
        try {
            txt=new FileWriter("matriuLinial.txt",false);
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    txt.write(mat[i][j]+"");
                }
                txt.write("\n");
            }
            txt.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
