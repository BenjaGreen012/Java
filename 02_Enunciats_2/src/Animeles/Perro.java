package Animeles;

public class Perro extends Animales{
    int numeroDePatas;
    String nomAnimal;
    public Perro(String especieRebuda, String modalidadDeReproducionRebuda,int numeroDePatasRebut, String nomAnimalrebut) {
        super(especieRebuda, modalidadDeReproducionRebuda);
        this.nomAnimal=nomAnimalrebut;
        this.numeroDePatas=numeroDePatasRebut;
    }
    public int getNumeroDePatas(){
        return numeroDePatas;
    }
    public void setNumeroDePatas(int numRebut){
        this.numeroDePatas=numRebut;
    }
    public String getNomAnimal(){
        return nomAnimal;
    }
    public void setNomAnimal(String nomRebut){
        this.nomAnimal=nomRebut;
    }
    public String toString(){
        return this.nomAnimal+" "+this.numeroDePatas+" "+super.toString();
    }
}
