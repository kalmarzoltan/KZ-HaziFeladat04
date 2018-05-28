package hazi_4.arus;

public class Aru {
    private String név;
    private int nettoÁr;
    private int áfaKulcs;


    public String getNév() {
        return név;
    }

    public void setNév(String pNév) {
        this.név = pNév;
    }

    public int getNettoÁr() {
        return nettoÁr;
    }

    public void setNettoÁr(int pNettoAr) {
        this.nettoÁr = pNettoAr;
    }

    public int getÁfaKulcs() {
        return Math.round(áfaKulcs);
    }

    public void setÁfaKulcs(int áfakulcs) {
        this.áfaKulcs = áfakulcs;
    }

    public Aru(String név, int nettoÁr, int áfaKulcs) {
        this.név = név;
        this.nettoÁr = nettoÁr;
        this.áfaKulcs = áfaKulcs;
    }

    public int getBruttoAr() {
        return Math.round((this.nettoÁr + (this.nettoÁr * this.áfaKulcs / 100.0f)));

    }

    public String nameAndBruttoAr() {

        String resultString = "név: " + this.név + ", Brutto Ár: " + this.getBruttoAr();
        return resultString;
    }

    public void increaseNetPrice(int percentage) {
        this.nettoÁr = (int) (this.nettoÁr + (this.nettoÁr * percentage / 100.0f));
    }

    public int compareThePrice(Aru x) {
        if (this.getBruttoAr() > x.getBruttoAr()) {
            System.out.println(this.név+" price is higher than "+x.név+" price");
            return 1;
        } else if (this.getBruttoAr() < x.getBruttoAr()) {
            System.out.println(x.név+" price is higher than "+this.név+" price");
            return -1;
        } else
            System.out.println(x.név+" price is equal to "+this.név+" price");
            return 0;
    }

    @Override
    public String toString() {
        return "Aru{" +
                "név='" + név + '\'' +
                ", nettoÁr=" + nettoÁr +
                ", áfaKulcs=" + áfaKulcs +
                '}';
    }
}

