package Coches;

public class ProgramaCotxe {
    public static void main(String[] args) {
        String marca="BMW";
        String model="A1";
        String color="Gris";
        Cotxe coches=new Cotxe(marca,model,color);
        System.out.println(coches.toString());
    }
}
