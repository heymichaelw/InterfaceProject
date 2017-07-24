public class Main {

    public static void main(String[] args) {
        Pilot newSoldier  = new Pilot();
        System.out.println(newSoldier.shoot());
        System.out.println(newSoldier.takeOff());
        System.out.println(newSoldier.refuel());

        Infantry otherSoldier = new Infantry();
        System.out.println(otherSoldier.shoot());
        System.out.println(otherSoldier.reload());

        Tank newTank = new Tank();
        Bomb newBomb = newTank.createBomb();
        System.out.println(newBomb.toString());
    }
}
