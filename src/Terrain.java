public class Terrain {
    public Terrain () {}

    public void randomItemFound () {
        int chanceItem = (int) ((Math.random() * 30) * 1);
        if (chanceItem <= 3) {
            PilotPlayer.addItem("gun");
        } else if (chanceItem > 3 && chanceItem <= 7) {
            PilotPlayer.addItem("shotgun");
    }

    public String hunt () {
        if (PilotPlayer.hasItem("shotgun")) {
            int animal = (int) ((Math.random() * 15) * 1);
            if (animal <= 5) {
                return "You have found a deer, and successfully shot it. Would you like to feed yourself or feed Raven?";
            } else {
                return "You found nothing.";
            }
        } else {
            return "You can't hunt without a shotgun!";
        }
    }
}
