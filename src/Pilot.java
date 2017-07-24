
public class Pilot extends Soldier implements Shootable, Flyable {
    public String shoot(){
        return "Missiles launched!";
    }

    public String reload(){
        return "Weapon reloaded!";
    }

    public String speak(){
        return "Howdy!";
    }

    public String takeOff(){
        return "Flight started";
    }

    public String land(){
        return "Safely touched down";
    }
}
