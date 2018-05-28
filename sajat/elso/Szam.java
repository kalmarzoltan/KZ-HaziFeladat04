package hazi_4.sajat.elso;

public class Szam {
    protected final static double tures = 0.001;
    private double real;

    public double getReal() {
        return real;
    }

    public void setReal(double pReal) {
        this.real = pReal;
    }

    public Szam(double pSzam) {
        this.real = pSzam;
    }


    public boolean egyezikE(double pSzam) {
        if ((this.getReal() - tures) > pSzam || (this.getReal() + tures) < pSzam) {
            System.out.println("Nem egyezik: "+pSzam+"+-tures !="+real);
            return false;
        } else {
            System.out.println("Egyezik: "+pSzam+"+-tures ="+real);
            return true;
        }
    }
}
