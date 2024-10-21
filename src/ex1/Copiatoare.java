package ex1;

public class Copiatoare extends echipamente{
    private int p_ton;
    private String format;

    public Copiatoare(String nume, int nr_inv, int pret, String zona_mag, String situatie,String tip,int p_ton, String format) {
        super(nume, nr_inv, pret, zona_mag, situatie,tip);
        this.p_ton = p_ton;
        this.format = format;
    }

    public void setFormat(String format){
        this.format=format;
    }

    @Override
    public String toString() {
        return "Copiatoare{"+"nume="+getNume() + ", p_ton=" + p_ton + ", format='" + format + '\'' + '}';
    }
}
