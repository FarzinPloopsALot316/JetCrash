public class Raven {
    private int friendship;
    private int health;
    private boolean hide;

    public Raven () {
        this.hide = false;
        this.health = 100;
        this.friendship = 10;
    }

    public int getRHealth () {
        return health;
    }

    public int getFriendship () {
        return friendship;
    }

    public boolean getHide () {
        return hide;
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
