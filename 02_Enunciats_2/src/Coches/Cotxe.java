package Coches;

import java.util.Random;

public class Cotxe {
    private String marca;
    private String model;
    private String color;
    private String matricula;

    // ===Constructors===
    public Cotxe() {
        this.model = "";
        this.color = "";
        this.marca = "";
        matrucular();
    }

    public Cotxe(String marcaRebuda, String modelRebut, String colorRebut) {
        this.marca = marcaRebuda;
        this.model = modelRebut;
        this.color = colorRebut;
        matrucular();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marcaRebuda) {
        this.marca = marcaRebuda;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String modelRebut) {
        this.model = modelRebut;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colorRebut) {
        this.color = colorRebut;
    }

    public String getMatricula() {
        return matricula;
    }

    public void matrucular() {

        char[] array = { 'B', 'C','D', 'F', 'G', 'H', 'J', 'K', 'L','M', 'N', 'P', 'R', 'S', 'T', 'V','W', 'X', 'Y', 'Z' };
        String matriculaGenerada = "";
        for (int i = 0; i < 7; i++) {
            Random rnd = new Random();
            int ale = (int) (rnd.nextDouble() * array.length);
            int ale2 = (int) (rnd.nextDouble() * 10);
            if (i > 3) {
                matriculaGenerada += array[ale];
            } else {
                matriculaGenerada += ale2;
            }
        }
        this.matricula=matriculaGenerada;
    }

    @Override
    public String toString() {
        return "Cotxe [color=" + color + ", marca=" + marca + ", matricula=" + matricula + ", model=" + model + "]";
    }
    
}
