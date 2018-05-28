package hazi_4.arus;

public class Kenyér extends Aru {
    private double mennyiseg = 0.75;


    public Kenyér(String név, int nettoÁr, int áfaKulcs, double mennyiseg) {
        super(név, nettoÁr, áfaKulcs);
        this.mennyiseg = mennyiseg;
    }


    public double getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(double mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return super.toString() + " a " + this.getNév() + " egységára: " + (this.getBruttoAr() / this.mennyiseg);
    }

    public static boolean compareBreadPrices(Kenyér k1, Kenyér k2) {
        if ((k1.getBruttoAr() / k1.mennyiseg) > (k2.getBruttoAr() / k2.mennyiseg)) {
            return true;
        } else {
            return false;
        }
    }


}
