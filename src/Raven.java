public class Raven {
    private int friendship; //disregard in Part2 class.
    private int health;
    private static boolean hide;

    public Raven () {
        this.hide = false;
        this.health = 60;
        this.friendship = 10;
    }

    public Raven (int health) {
        this.hide = false;
        this.health = health;
        this.friendship = 10;
    }

    public int getRHealth () {
        return health;
    }

    public int getFriendship () {
        return friendship;
    }

    public static boolean getHide () {
        return hide;
    }

    public static void setHide () {
        hide = true;
    }

    public void ravenLoseHealth (int loss) {
        health -= loss;
    }

    public void ravenAddHealth (int add) {
        health += add;
    }

    public void loseFriendship (int loss) {
        friendship -= loss;
    }

    public void addFriendship (int add) {
        friendship += add;
    }
}
