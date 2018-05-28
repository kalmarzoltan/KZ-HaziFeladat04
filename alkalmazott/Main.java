package hazi_4.alkalmazott;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Alkalmazott[] alkTomb = new Alkalmazott[n];

        for (int i = 0; i < n; i++) {
            String name = "Sanya" + i;
            int randAge = (int) (Math.random() * (70 - 20) + 1) + 20;
            double randSalary = (double) Math.round(Math.random() * 2500) + 750;
            Alkalmazott alk = new Alkalmazott(name, randAge, randSalary);
            alkTomb[i] = alk;
            System.out.println(alk.getName() + " has been added to the list");
        }

        for (int i = 0; i < alkTomb.length; i++) {
            alkTomb[i].alkalmazottAdatai();

        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Változik a nyugdíjkorhatár 65-ről 67-re sajnos");
        System.out.println("-----------------------------------------------------------------------------------------");
        Alkalmazott.nyugdijkorhatar = 67;
        for (int i = 0; i < alkTomb.length; i++) {
            alkTomb[i].alkalmazottAdatai();

        }
        System.out.println("-----------------------------------------------------------------------------------------");


        Alkalmazott highest = alkTomb[0];
        for(int i =1; i<alkTomb.length; i++){
            if(highest.getSalary()<alkTomb[i].getSalary()){
                highest=alkTomb[i];
            }

        }
        System.out.println(highest.getName() + " has the highest salary");
        highest.alkalmazottAdatai();
        }



    }

