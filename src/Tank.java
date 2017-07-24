
public class Tank extends Soldier implements Bombable {
    public String shoot() {
        return "BLAM!";
    }

    public Bomb createBomb() {
        Bomb newBomb = new Bomb();
        return new Bomb();
    }

    public String reload() {
        return "Missles refreshed!";
    }

    public String speak() {
        return "I'M A TANK";
    }
}
