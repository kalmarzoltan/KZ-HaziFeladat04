package hazi_4.ujkonyves.futo;

import hazi_4.ujkonyves.KonyvStilus;
public class Main {
    public static void main(String[] args) {
        int n = 7;
        KonyvStilus[] konyvStTomb = new KonyvStilus[n];
        for (int i = 0; i < n; i++) {
            String író = "Author" + i;
            String cím = "Title" + i;
            int oldalSzam = (int) (Math.random() * (650 - 200) + 1) + 200;
            int ár = (int) (Math.random() * (5600 - 3500) + 1) + 3500;
            String stilus = "sci-fi";
            if (i % 2 == 0) {
                stilus = "classic";
            }
            KonyvStilus konyvSt = new KonyvStilus(író, cím, oldalSzam, ár, stilus);
            konyvStTomb[i] = konyvSt;
            System.out.println(konyvSt.getCím() + " has been added to the list");
        }
        for (int i = 0; i < konyvStTomb.length; i++) {
            System.out.println(konyvStTomb[i].toString());
        }
        KonyvStilus legkisebbOldalÁrú = konyvStTomb[0];
        for (int i = 1; i < konyvStTomb.length - 1; i++) {
            if ((legkisebbOldalÁrú.oldalakéntiÁr(konyvStTomb[i + 1])) == true) {
                legkisebbOldalÁrú = konyvStTomb[i + 1];
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("A legkisebb oldalárú könyv a: " + (legkisebbOldalÁrú.getCím())
                + ", oldalankénti ára ~"
                + ((legkisebbOldalÁrú.getÁr()) / (legkisebbOldalÁrú.getOldalSzam())
        ) + " Huf");
        for (int i = 0; i < konyvStTomb.length; i++) {
            if (konyvStTomb[i].getStilus().equalsIgnoreCase("sci-fi")) {
                System.out.println("Scifi stílusú könyv: " + konyvStTomb[i].toString());
            }
        }
    }
}
