public class Terrain {
    public Terrain() {
    }

    public void randomItemFound() {
        int chanceItem = (int) ((Math.random() * 15) * 1);
        if (chanceItem <= 3) {
            System.out.println(PilotPlayer.addItem("gun"));
        } else if (chanceItem > 3 && chanceItem <= 7) {
            System.out.println(PilotPlayer.addItem("shotgun"));
        } else {
            System.out.println("You found nothing.");
        }
    }

    public String hunt() {
        if (PilotPlayer.hasItem("shotgun")) {
            int animal = (int) ((Math.random() * 15) * 1);
            if (animal <= 5) {
                System.out.println(PilotPlayer.addItem("deer meat"));
                return "You have found a deer, and successfully shot it.";
            } else {
                return "You found nothing.";
            }
        } else {
            return "You can't hunt without a shotgun!";
        }
    }
}
