package Animeles;

public class Gato extends Animales {
    String nomDelAnimal;
    public Gato(String especieRebuda, String modalidadDeReproducionRebuda, String nomDelAnimalRebut) {
        super(especieRebuda, modalidadDeReproducionRebuda);
        this.nomDelAnimal=nomDelAnimalRebut;
    }
    public String getNomDelAnimal(){
        return nomDelAnimal;
    }
    public void setNomDelAnimal(String nomRebut){
        this.nomDelAnimal=nomRebut;
    }
    public String toString(){
        return this.nomDelAnimal+" "+this.getEspecie()+" "+this.getModalitat();
    }
}
