package ex1;

public class Imprimante extends echipamente implements java.io.Serializable{
    private int ppm;
    private String rezolutie;
    private int p_cat;
    private String color;


    public Imprimante(String nume, int nr_inv, int pret, String zona_mag, String situatie,String tip,int ppm, String rezolutie, int p_cat, String color) {
        super(nume, nr_inv, pret, zona_mag, situatie,tip);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        this.p_cat = p_cat;
        this.color = color;
    }

    public void setcolor(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        return "Imprimante{" +"nume="+getNume()+ ", ppm=" + ppm + ", rezolutie='" + rezolutie + '\'' + ", p_cat=" + p_cat + ", color='" + color + '\'' + '}';
    }
}
