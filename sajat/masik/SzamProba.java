package hazi_4.sajat.masik;

import hazi_4.sajat.elso.Szam;


public class SzamProba {
    static Szam lokalis = new Szam(0.5);

    public static void main(String[] args) {
        int hanyadik = 0;
        for (double i = 0; i < 1; i = (i + 0.001)) {
            hanyadik++;
            Szam generated = new Szam(i);
            if (generated.egyezikE(lokalis.getReal()) == false) {
                System.out.println(i);
            } else {
                System.out.println("A " + hanyadik + ". generált Szam a tűréshatáron belül van: " + i);
                break;
            }
        }

        lokalis.setReal(0.6);
        System.out.println("Most az adattag értéke: "+lokalis.getReal()+" , megváltozott az eredeti értékhez képest");


    }
}
