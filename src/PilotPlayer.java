import java.util.Arrays;

public class PilotPlayer {
    private int health;
    private String[] inv;

    public PilotPlayer (int health, String[] inv) {
        this.health = health;
        this.inv = inv;
    }

    public PilotPlayer () {
        this.health = 100;
        this.inv = new String[2];
    }

    public int getHealth () {
        return health;
    }

    public String[] getInv () {
        return inv;
    }

    public void loseHealth (int loss) {
        health -= loss;
    }

    public void addHealth (int add) {
        health += add;
    }

    public String addItem (String item) { // add an if else statement that changes A and An based on item.
        boolean success = false;
        for (int i = 0; i < inv.length; i++) {
            if (inv[i] == null) {
                inv[i] = item;
                success = true;
            }
        }
        if (!success) {
            return "Your inventory is full. Please remove an item.";
        }
        return "A " + item + " has been added to your inventory.";
    }

    public String removeItem (String item) {
        for (int i = 0; i < inv.length; i++) {
            if (inv[i] == item) {
                inv[i] = null;
            }
        }
        return "Your " + item + " has been removed from your inventory.";
    }
}
