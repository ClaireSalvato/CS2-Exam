public class SurvivorLeader {
    private String transmission = "q2xf1t8r5w3t tm9c5i8l900d5n7heto 3g5t6hgw44y5e7bhty605rh8t5 85ml95ak2k5r7qw5ksp295e5t7p45 o5i3n 6z5n205 9soe5o8hhg5lygtt5dq7th 5 gf34s9o 35j7j5o45k99hg5kyqqcjg5mkpl20z5o629sle5k20sk5k9c5 gh73h qxp25vi8t5i3f2v1q 9x7z6t5l8r9j3o4v5l3l1w 9y5a4d6f7x2c9l5g h8s45ek6";

    public Shelter[] shelter = new Shelter[40];

    public static void main(String[] args) {
        SurvivorLeader survivor = new SurvivorLeader();
    }

    public SurvivorLeader() {
        System.out.println("Goodbye World! Good luck surviving the apocalypse!");
        shelter = new Shelter[40];
        for (int i = 0; i < 40; i++) {
            int defenseLevel = (int) (Math.random() * 100 + 1);
            int numberOfSupplies = (int) (Math.random() * 1001);
            shelter[i] = new Shelter(defenseLevel, numberOfSupplies);
        }

        displayShelters();
        boolean c = checkSupplies();
        System.out.println("It is " + c + " that two supplies in the shelter are equal");

        decipher(transmission);

        newDefense();

    }

    public void displayShelters() {
        for (int i = 0; i < shelter.length; i++) {
            shelter[i].printInfo();
        }
    }

    public boolean checkSupplies() {
        boolean sameSupplies = false;

        for (int i = 0; i < shelter.length; i++) {
            for (int x = 0; x < shelter.length; x++) {

                if (shelter[i].getNumberOfSupplies() == shelter[x].getNumberOfSupplies() && (i != x)) {
                    sameSupplies = true;
                }
            }
        }

        if (sameSupplies == true) {
            return true;
        } else {
            return false;
        }
    }

    public String decipher(String languageSample) {
        String decodedString = "";
        System.out.println(languageSample);
        int al = languageSample.indexOf("5") + 1;
        while (al != 0) {
            al = languageSample.indexOf("5") + 1;
            String sub = languageSample.substring(al, al + 1);
            decodedString += sub;
            System.out.println(decodedString);
        }

        return decodedString;
    }

    public boolean newDefense() {
        boolean sameDefense = false;
        for (int i = 0; i < 40; i++) {
            for (int x = 0; x < shelter.length; x++) {

                if (shelter[i].getDefenseLevel() == shelter[x].getDefenseLevel() && (i != x)) {
                    sameDefense = true;
                }
            }
        }

        if (sameDefense == true) {
            return true;
        } else {
            return false;
        }


    }


}
