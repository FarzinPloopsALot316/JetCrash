import java.util.Arrays;

public class PilotPlayer {
    private int health;
    private static String[] inv;

    public PilotPlayer (int health) {
        this.health = health;
        inv = new String[4];
        for (int i = 0; i < inv.length; i++) {
            if (inv[i] == null) {
                inv[i] = "EMPTY";
            }
        }
    }

    public PilotPlayer (int health, String[] newInv) { //use only for StoryPart2 class.
        this.health = health;
        inv = new String[4];
        inv = newInv; //now the pilot's current inv from Story class is restored to Story Part 2 to preserve progress. Please test.
    }

    public PilotPlayer () {
        this.health = 70; //max 100
        inv = new String[4];
        for (int i = 0; i < inv.length; i++) {
            if (inv[i] == null) {
                inv[i] = "EMPTY";
            }
        }
    }

    public int getHealth () {
        return health;
    }

    public static String getInv () {
        String str = "| ";
        for (int i = 0; i < inv.length; i++) {
            str += inv[i] + " | ";
        }
        return str;
    }

    public static String[] getInvList () {
        return inv;
    }

    public void loseHealth (int loss) {
        health -= loss;
        if (health <= 0) {
            health = 0;
        }
    }

    public void addHealth (int add) {
        if (health + add <= 100) {
            health += add;
        }
    }

    public static String addItem (String item) {
        for (int i = 0; i < inv.length; i++) {
            if (inv[i].equals(item)) {
                return "Your inventory already contains this item. Therefore, you toss it away.";
            }
        }
        for (int i = 0; i < inv.length; i++) {
            if (inv[i].equals("EMPTY")) {
                inv[i] = item;
                return "A(n) " + item + " had been added to your inventory.";
            }
        }
        return "Your inventory is full, and so the item was tossed away.";
    }

    public static String removeItem (String item) {
        for (int i = 0; i < inv.length; i++) {
            if (inv[i] == item) {
                inv[i] = "EMPTY";
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
