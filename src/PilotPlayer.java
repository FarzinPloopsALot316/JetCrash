public class PilotPlayer {
    private int health;
    private String[] inv;

    public PilotPlayer (int health, String[] inv) {
        this.health = health;
        this.inv = inv;
    }

    public PilotPlayer (String[] inv) {
        this.health = 100;
        this.inv = inv;
    }

    public int getHealth () {
        return health;
    }

    public String[] inv () {
        return inv;
    }

    public void loseHealth (int loss) {
        health -= loss;
    }

    public void addHealth (int add) {
        health += add;
    }


}
