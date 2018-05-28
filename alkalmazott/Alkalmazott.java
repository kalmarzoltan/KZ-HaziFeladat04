package hazi_4.alkalmazott;

public class Alkalmazott {
    private String name;
    private int age;
    private double salary;
    protected static int nyugdijkorhatar = 65;

    public Alkalmazott(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public int getNyugdijkorhatar(int nyugdijkorhatar) {
        return nyugdijkorhatar;
    }

    /**
     * Metódusok
     */

    public int mennyiVanMegHatra(int age) {
        int hátraLévőÉvek = nyugdijkorhatar-age;
        if(hátraLévőÉvek>0){

            return hátraLévőÉvek;

        }else{
            System.out.println(this.name+" már mehetne nyugdíjba...");
            return 0;

        }

    }

    public void alkalmazottAdatai() {
        System.out.println("Az alkalmazott neve: " + this.name + " életkora: "
                + this.age + " fizetése: " + this.salary + " €, nyugdíjig van még : "
                + this.mennyiVanMegHatra(this.getAge()) + " év");
    }

    public static void setNyugdijkorhatar(int nyugdijkorhatar) {
        Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
    }

    public Alkalmazott aNagyobbFizetésű(Alkalmazott a, Alkalmazott b) {
        if (a.getSalary() > b.getSalary()) {

            return a;
        } else if (a.getSalary() < b.getSalary()) {

            return b;
        } else {
            return null;
        }


    }


}

