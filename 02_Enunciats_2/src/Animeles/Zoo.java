package Animeles;

public class Zoo {
    public static void main(String[] args) {
        Perro perro=new Perro("Canina", "Sexualmente", 4, "Perro");
        Gato gato=new Gato("Felidae", "Sexualmente", "Gato");
        System.out.println(gato.toString());
        System.out.println(perro.toString());
    }
}
