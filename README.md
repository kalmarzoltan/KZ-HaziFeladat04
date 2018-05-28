Osztály definíció, statikus tagok, csomagok

1. Készítsen egy Alkalmazott osztályt
- legyen név, kor és fizetés adata
- legyen egy osztályszintû adattagja a nyugdíj korhatár tárolására, értéke kezdetben legyen 65.
- legyen konstruktora, amelyben paraméterként kapott értékekkel inicializálja az adattagokat
- legyen metódusa, amely visszadja hány éve van még nyugdíjig
- legyen metódusa, amely string-be összefûzve adja vissza az Alkalmazott adatait, hozzáfûzve a nyugdíjig hátrelevõ éveinek számát is
- legyen metódusa, amely paraméterként kapott értékre állítja be a korhatárt
- legyen metódusa, amely paraméterként kapott két Alkalmazott közül a nagyobb fizetésût adja vissza.

Készítsen egy futtatható osztályt, amely beolvas n számú alkalmazottat egy tömbbe. Kiírja az alkalmazottak adatait, majd megváltoztatja a nyugdij korhatárt és újra kiírja az alkalmazottak adatait. Majd kiírja a legnagyobb fizetésû hazi_4.alkalmazott adatait.

2. Készítsen egy Szam nevû osztályt a hazi_4.sajat.elso nevû csomagba
- legyen egy osztályszintû konstans adattagja egy 0.001 értékkel egy tûrés tárolására
- legyen egy adattagja egy valós szám tárolására
- legyen konstruktora, amely paraméterként kapott értékekkel inicializálja az adattagot.
- legyen egy "egyezikE" metódusa, amely igazat ad ha egy paraméterként kapott valós szám eltérése a tûrésen belül van.
- legyen getter, setter metódusa a szám adattagra.

Készítsen egy SzamProba nevû futtatható osztályt a "masik" nevû csomagba, amelyben létrehoz egy Szam-ot egy 0-1 közötti értéket megadva és eltárolja egy statikus lokális változóban. Generáljon ciklusban egészen addig 0-1 közötti valós számokat és írja ki, amig egyezõt nem talál a létrehozott Szam-al (tûrésen belülit). Írja ki hanyadik generált szám volt ez. 
Próbálja ki megtudja-e változtatni a Szam adattagjának értékét.
Próbálja ki megtudja-e változtatni a referenciájának értékét. 

3. Készítsen egy hazi_4.konyves.alap.Konyv osztályt
- legyen adattagja iro, cím, oldalszám és ár adatok tárolására
- legyen konstruktora, amely paraméterként kapott értékekkel inicializálja az adattagokat.
- legyen metódusa, amely String-ben összefüzve adja vissza a könyv adatait
- legyen metódusa, amely igazat ad ha a könyv oldalankénti ára nagyobb, mint egy paraméterként kapott könyvvé.
- legyen metódusa, amely két paraméterként kapott könyv közül a hosszabbat adja vissza. (!)

Készítsen egy hazi_4.konyves.KonyvProba futtatható osztályt, amelyben beolvas n darab könyvet egy tömbbe és meghatározza a legkisebb oldalárút, valamint a leghosszabbat.

Öröklődés

4. Készítsen java nyelvû osztályt (hazi_4.arus.Aru) egy áru modellezésére
- legyen név, nettó ár (egész), áfakulcs (egész, százalék) adata
- legyen konstruktora, amely mindhárom adata megadásával inicializálja az adatokat
- legyen metódusa, amely visszaadja a bruttóárat (egész, kerekítve)
- legyen metódusa, amely egy stringbe összefûzve vissza adja a nevet és a bruttó árat.
Bónusz feladat: Definiálja felül az Object osztálybeli toString metódust. (együtt is venni fogjuk)
- legyen metódusa, amely paraméterben megadott százalék értékkel növeli a nettó árat.
- legyen metódusa, amely 1 ad ha az arú drágább (buttóár), mint egy paraméterben kapott 0-t ad, ha egyforma árúak és -1-t ad ha a paraméterben kapott a drágább.

Készítsen egy hazi_4.arus.Kenyer osztályt, amely az Aru leszármazottja
- legyen mennyiség (valós, pl. 0.75) adata
- legyen konstruktura, amely négy paraméterben kapott adattal inicializálja az objektumot
- legyen felüldefiniálva a String-et visszaadó metódusa úgy, hogy az õsbelihez képest fûzze még hozzá az egységárat (bruttóár/mennyiség).
- legyen metódusa, amely visszaadja a mennyiséget.
- legyen osztályszintû metódusa, amely igazat ad, ha paraméterként kapott két Kenyer közül az elsõnek nagyobb az egységára.

Készítsen egy hazi_4.arus.futo.AruProba futtatható osztályt, amelyben létrehoz egy Aru és egy Kenyer
objektumot tetszõleges adatokkal. Kiírja az adataikat, kiírja a drágábbat. 
Hozzon létre még egy Kenyer típusú objektumot, de a referenciáját egy Aru típusú változóba 
tárolja (neve: aru2). Próbálja ki, hogy az "aru2" referenciával, mit ad a String-et visszaadó 
metódusa, megtudja-e hívni ezzen a referencián keresztûl a mennyiséget visszaadó metódusat.
Hozzon létre még egy Kenyer példányt (neve: keny2) és az "aru2" referenciával hivatkozott 
másik Kenyerrel összehasonlítva a nagyobb egységárút kell kiírni (konvertálásra lesz szükség).

5. Készítsen java nyelvû osztályt hazi_4.ujkonyves.KonyvStilussal néven a korábbi hazi_4.konyves.alap.Konyv osztály kiterjesztésére.
- legyen még stílus (szöveg) adata
- legyen konstruktora, amely minden adatát paraméterben kapott adatokkal inicializálja.
- legyen metódusa, amely visszaadja a stílust
- legyen metódusa, amely felüldefiniálva a String-et visszadó metódus, úgy hogy az õsbeli
Stringhez még fûzze hozzá a stílust is.

Készítsen egy futtatható osztályt az hazi_4.ujkonyves.futo csomagba, amelyben beolvas n darab konyvet
egy tömbbe és kiírja a legkisebb oldalárút valamint a "Scifi" stílusú könyveket. (A String-ek
egyezésének vizsgálatára használja a String osztály következõ metódusát:
boolean equalsIgnoreCase(String anotherString) 
