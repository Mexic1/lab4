package ex1;

public class sistem extends echipamente implements java.io.Serializable{
    private String tip_mon;
    private double vit_proc;
    private int c_hdd;
    private String sys_op;

    public sistem(String nume, int nr_inv, int pret, String zona_mag, String situatie, String tip, String tip_mon, double vit_proc, int c_hdd, String sys_op) {
        super(nume, nr_inv, pret, zona_mag, situatie,tip);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.sys_op = sys_op;
    }

    public void setSys_op(String sys_op){
        this.sys_op=sys_op;
    }

    @Override
    public String toString() {;
        return "Sistem de operare{"+"nume="+getNume() + ", tip_mon='" + tip_mon + '\'' + ", vit_proc=" + vit_proc + ", c_hdd=" + c_hdd + ", sys_op='" + sys_op + '\'' + getSituatie()+'}';
    }
}
