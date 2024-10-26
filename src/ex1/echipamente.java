package ex1;

public class echipamente implements java.io.Serializable {
    private String nume;
    private int nr_inv;
    private int pret;
    private String zona_mag;
    private String situatie;
    private String tip;

    public echipamente(String nume, int nr_inv, int pret, String zona_mag, String situatie,String tip) {
        this.nume = nume;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.situatie = situatie;
        this.tip=tip;
    }

    public String getNume() {
        return nume;
    }

    public String getSituatie(){
        return situatie;
    }

    public void setSituatie(String situatie) {
        this.situatie = situatie;
    }




    @Override
    public String toString() {
        return "echipamente{" + "nume='" + nume + '\'' + ", nr_inv=" + nr_inv + ", pret=" + pret + ", zona_mag='" + zona_mag + '\'' + ", situatie='" + situatie + '\'' + '}';
    }
}
