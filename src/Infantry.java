
public class Infantry extends Soldier implements Shootable{
    public String shoot(){
        return "Gun fired!";
    }

    public String reload(){
        return "Ammo available!";
    }

    public String speak(){
        return "What are you lookin' at?";
    }


}
