package hazi_4.konyves;

import hazi_4.konyves.alap.Konyv;

public class KonyvProba {
    public static void main(String[] args) {
        int n = 5;
        Konyv[] konyvTomb = new Konyv[n];

        for (int i = 0; i < n; i++) {
            String író = "Author" + i;
            String cím = "Title" + i;
            int oldalSzam = (int) (Math.random() * (500 - 150) + 1) + 150;
            int ár = (int) (Math.random() * (4500 - 2000) + 1) + 2000;
            Konyv konyv = new Konyv(író, cím, oldalSzam, ár);
            konyvTomb[i] = konyv;
            System.out.println(konyv.getCím() + " has been added to the list");
        }

        for (int i = 0; i < konyvTomb.length; i++) {
            konyvTomb[i].aKonyvAdatai();

        }


        Konyv legkisebbOldalÁrú = konyvTomb[0];
        Konyv legHosszabb = konyvTomb[0];

        for (int i = 1; i < konyvTomb.length - 1; i++) {
            if ((legkisebbOldalÁrú.oldalakéntiÁr(konyvTomb[i + 1])) == true) {
                legkisebbOldalÁrú = konyvTomb[i + 1];
            }


        }
        System.out.println("A legkisebb oldalárú könyv a: " + (legkisebbOldalÁrú.getCím())
                + ", oldalankénti ára ~"
                + ((legkisebbOldalÁrú.getÁr()) / (legkisebbOldalÁrú.getOldalSzam())
        ) + " Huf");

        for (int i = 1; i < konyvTomb.length; i++) {
            if (legHosszabb.getOldalSzam() < konyvTomb[i].getOldalSzam()) {
                legHosszabb = konyvTomb[i];
            }
        }
        System.out.println("A leghosszabb könyv címe: "
                + legHosszabb.getCím() + " ->"
                + legHosszabb.getOldalSzam() + " oldal hosszú");
    }


}


