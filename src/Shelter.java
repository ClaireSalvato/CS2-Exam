public class Shelter {

    private int defenseLevel;
    private int numberOfSupplies;

    public Shelter(int defenseLevel, int paramNumberOfSupplies){
        this.defenseLevel = defenseLevel;
        this.numberOfSupplies = paramNumberOfSupplies;
    }

    public int getDefenseLevel(){
        return defenseLevel;
    }

    public void setDefenseLevel(int paramDefense){
        this.defenseLevel = paramDefense;
    }

    public int getNumberOfSupplies(){
        return numberOfSupplies;
    }

    public void setNumberOfSupplies(int paramSupplies){
        numberOfSupplies = paramSupplies;
    }

    public void printInfo(){
        System.out.println("Defense: " + defenseLevel + " Supplies:" + numberOfSupplies);
    }
}
