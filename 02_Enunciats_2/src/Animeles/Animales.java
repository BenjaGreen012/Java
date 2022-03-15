package Animeles;

public class Animales{
    private String especie;
    private String modalidadDeReproducion;
    // ===Constructors===
    public Animales(String especieRebuda, String modalidadDeReproducionRebuda){
        this.especie=especieRebuda;
        this.modalidadDeReproducion=modalidadDeReproducionRebuda;
    }
    // ===Geters===
    public String getEspecie(){
        return especie;
    }
    public String getModalitat(){
        return modalidadDeReproducion;
    }
    // ===Seters===
    public void setEspcie(String especieRebuda){
        this.especie=especieRebuda;
    }
    public void setModalidadDeReproducion(String modalidadDeReproducionRebuda){
        this.modalidadDeReproducion=modalidadDeReproducionRebuda;
    }
    public String toString(){
        return this.getEspecie()+" "+this.getModalitat();
    }
}
