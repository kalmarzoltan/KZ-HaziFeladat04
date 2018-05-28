package hazi_4.ujkonyves;

import hazi_4.konyves.alap.Konyv;

public class KonyvStilus extends Konyv {

    private String stilus;

    public KonyvStilus(String író, String cím, int oldalSzam, int ár,String stilus) {
        super(író, cím, oldalSzam, ár);
        this.stilus=stilus;
    }

    public String getStilus(){
        return stilus;
    }

    public void setStilus(String stilus){
        this.stilus=stilus;
    }

public String returnTheStyle(){
        return this.getStilus().toString();
}

    @Override
    public String toString() {
        return "Cím: "+super.getCím()+" író: "+super.getÍró()
                +" oladalak: "+super.getOldalSzam()+" ár: "
                +super.getÁr()+" KonyvStilus{" +"stilus='"
                + stilus + '\'' +'}';
    }
}
