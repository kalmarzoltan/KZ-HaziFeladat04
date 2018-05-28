package hazi_4.konyves.alap;

public class Konyv {
    private String író;
    private String cím;
    private int oldalSzam;
    private int ár;

    public Konyv(String író, String cím, int oldalSzam, int ár) {
        this.író = író;
        this.cím = cím;
        this.oldalSzam = oldalSzam;
        this.ár = ár;

    }


    public String getÍró() {
        return író;
    }

    public void setÍró(String író) {
        this.író = író;
    }

    public String getCím() {
        return cím;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public int getOldalSzam() {
        return oldalSzam;
    }

    public void setOldalSzam(int oldalSzam) {
        this.oldalSzam = oldalSzam;
    }

    public int getÁr() {
        return ár;
    }

    public void setÁr(int ár) {
        this.ár = ár;
    }


    public void aKonyvAdatai(){
        System.out.println("Cím: "+this.cím+" író: "+this.író+" oladalak: "+this.oldalSzam+" ár: "+this.ár);

    }

    public boolean oldalakéntiÁr(Konyv pKönyv) {
        if ((this.ár / this.oldalSzam) > (pKönyv.ár / pKönyv.oldalSzam)) {
            return true;
        } else {
            return false;
        }
    }



    public Konyv aHosszabbikKonyv(Konyv k1, Konyv k2) {
        if (k1.getOldalSzam() >= k2.getOldalSzam()) {
            return k1;
        } else {
            return k2;
        }
    }

    @Override
    public String toString() {
        return "Cím: "+this.getCím()+" író: "+this.getÍró()
                +" oladalak: "+this.getOldalSzam()+" ár: "
                +this.getÁr()+ '\'' +'}';
    }


}
