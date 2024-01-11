public class Terrain {
    public Terrain () {}

    public void randomItemFound () {
        int chanceItem = (int) ((Math.random() * 15) * 1);
        if (chanceItem <= 3) {
            PilotPlayer.addItem("gun");
        }
    }
}
