import java.util.Arrays;

public class PilotPlayer {
    private int health;
    private static String[] inv = new String[5];

    public PilotPlayer (int health) {
        this.health = health;
    }

    public PilotPlayer () {
        this.health = 70; //max 100
    }

    public int getHealth () {
        return health;
    }

    public static String[] getInv () {
        return inv;
    }

    public void loseHealth (int loss) {
        health -= loss;
    }

    public void addHealth (int add) {
        if (health + add <= 100) {
            health += add;
        }
    }

    public static String addItem (String item) { // add an if else statement that changes A and An based on item.
        boolean success = false;
        for (int i = 0; i < inv.length; i++) {
            if (inv[i] == null) {
                inv[i] = item;
                success = true;
            }
        }
        if (!success) {
            return "Your inventory is full. Please remove an item.";
        } else {
            return "A(n) " + item + " has been added to your inventory.";
        }
    }

    public static String removeItem (String item) {
        for (int i = 0; i < inv.length; i++) {
            if (inv[i] == item) {
                inv[i] = null;
            }
        }
        return "Your " + item + " has been removed from your inventory.";
    }

    public static boolean hasItem (String item) {
        String search = "";
        for (int i = 0; i < inv.length; i++) {
            search = inv[i];
            if (search.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
