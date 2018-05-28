package hazi_4.arus.futo;

import hazi_4.arus.Aru;
import hazi_4.arus.Kenyér;

public class AruProba {
    public static void main(String[] args) {
        Aru a1 = new Aru("a1", 100, 15);
        Kenyér k1 = new Kenyér("k1", 200, 10, 40);

        System.out.println(a1.toString());
        System.out.println(k1.toString());
        System.out.println(a1.compareThePrice(k1));
        System.out.println("--------------------------------------------------------------");
        Aru aru2 = new Kenyér("aru2", 300, 10, 20);
        System.out.println(aru2.toString());
           //nem lehet ezen a referencián meghívni a getMennyiséget pedig meg lett adva 20
        System.out.println("--------------------------------------------------------------");
        Kenyér keny2 = new Kenyér("keny2", 350, 10, 15);
        System.out.println(keny2.compareThePrice(aru2));
        //nemis kellett konvertálni...


    }
}
