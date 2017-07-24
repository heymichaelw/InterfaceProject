
public abstract class Soldier {
    private String name;
    private int rank;
    private String weaponType;

    public String confirm(){
        return "10-4!";
    }

    public String eat(){
        return "Rations consumed";
    }

    public abstract String speak();
}
