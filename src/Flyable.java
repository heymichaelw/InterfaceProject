
public interface Flyable {
    public String takeOff();
    public String land();

    default String refuel(){
        return "Tank full!";
    }
}
