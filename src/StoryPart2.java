import java.util.Scanner;

public class StoryPart2 {
    PilotPlayer pilot2;
    Raven raven2;

    public StoryPart2(int currentHealth, String[] currentInv, int RCurrentHealth) {
        pilot2 = new PilotPlayer(currentHealth, currentInv);
        raven2 = new Raven(RCurrentHealth);
    }

    public void wait (int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void wait2seconds () {
        try {
            Thread.sleep(2000);  // 2000 milliseconds, or 2 seconds
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void waitADangSecond () {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void assassin() {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        int ammo = 20;
        int loss = 0;
        if (Raven.getHide()) {
            System.out.println("Raven, whose trust you hold, hides behind you, shielded from the 8 assassins as you fought.");
            for (int count = 1; count <= 8; count++) {
                System.out.println(" - ");
                System.out.println("Assassin " + count + " encountered!");
                System.out.println("Ammo: " + ammo);
                if (PilotPlayer.hasItem("gun")) {
                    System.out.println("a. Fire gun.");
                    System.out.println("b. Try to dodge, then charge with a knife.");
                    if (userInput.equals("a")) {
                        int success = (int) ((Math.random() * 4) * 1);
                        if (success == 1) {
                            System.out.println("You missed! The assassin stabbed you and ran away. You lose 15 health and 5 ammo.");
                            loss += 15;
                            ammo -= 5;
                        } else {
                            System.out.println("You fired! The assassin drops dead. 5 ammo used.");
                            ammo -= 5;
                        }
                    } else {
                        int success = (int) ((Math.random() * 4) * 1);
                        if (success == 1) {

                        } else {

                        }
                    }
                }
            }
        } else {
            System.out.println("test holder");
        }
    }

    public void start2() {
        boolean cleared = false;
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        while (pilot2.getHealth() > 0 && raven2.getRHealth() > 0 && !cleared) {
            System.out.println("You, Raven, and Ash walk to his cabin.");
            System.out.println("Upon arriving after about 35 minutes, you and Raven admire the natural tranquility of the abode.");
            System.out.println("The cabin seemed lonely, accompanied by none other than Ash and the green willow trees which coveted the mass of its wooden exterior.");
            System.out.println("You decide to set your belongings aside on the couch inside, sitting down next to Raven.");
            wait(8);
            System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
            System.out.println("Your Current Health: " + pilot2.getHealth());
            System.out.println("Raven's Current Health: " + raven2.getRHealth());
            System.out.println("Current Inv: " + PilotPlayer.getInv());
            waitADangSecond();
            if (PilotPlayer.hasItem("berries")) {
                System.out.println("You had berries from before, and figured to use them before they went rotten.");
                System.out.println("a. Feed yourself.");
                System.out.print("b. Feed Raven.");
                userInput = scan.nextLine();
                if (userInput.equals("a")) {
                    System.out.println("You gain 10 health upon consumption.");
                    pilot2.addHealth(10);
                    wait2seconds();
                    System.out.println(PilotPlayer.removeItem("berries"));
                    System.out.println("Current Inv: " + PilotPlayer.getInv());
                } else {
                    System.out.println("Raven smiles in joy, gaining 10 health upon consumption.");
                    raven2.ravenAddHealth(10);
                    wait2seconds();
                    System.out.println(PilotPlayer.removeItem("berries"));
                    System.out.println("Current Inv: " + PilotPlayer.getInv());
                }
            }
            if (PilotPlayer.hasItem("bear meat") || PilotPlayer.hasItem("deer meat")) { //meat gives 15 each
                System.out.println("You had meat from before, and figured to use them before they went rotten.");
                if (PilotPlayer.hasItem("bear meat")) {
                    System.out.println("a. Feed yourself the bear meat.");
                    System.out.print("b. Feed Raven the bear meat.");
                    userInput = scan.nextLine();
                    if (userInput.equals("a")) {
                        System.out.println("You gain 15 health upon consumption.");
                        pilot2.addHealth(15);
                        wait2seconds();
                        System.out.println(PilotPlayer.removeItem("bear meat"));
                        System.out.println("Current Inv: " + PilotPlayer.getInv());
                    } else {
                        System.out.println("Raven smiles in joy, gaining 15 health upon consumption.");
                        raven2.ravenAddHealth(15);
                        wait2seconds();
                        System.out.println(PilotPlayer.removeItem("bear meat"));
                        System.out.println("Current Inv: " + PilotPlayer.getInv());
                    }
                }
                if (PilotPlayer.hasItem("deer meat")) {
                    System.out.println("a. Feed yourself the deer meat.");
                    System.out.print("b. Feed Raven the deer meat.");
                    userInput = scan.nextLine();
                    if (userInput.equals("a")) {
                        System.out.println("You gain 15 health upon consumption.");
                        pilot2.addHealth(15);
                        wait2seconds();
                        System.out.println(PilotPlayer.removeItem("deer meat"));
                        System.out.println("Current Inv: " + PilotPlayer.getInv());
                    } else {
                        System.out.println("Raven smiles in joy, gaining 15 health upon consumption.");
                        raven2.ravenAddHealth(15);
                        wait2seconds();
                        System.out.println(PilotPlayer.removeItem("deer meat"));
                        System.out.println("Current Inv: " + PilotPlayer.getInv());
                    }
                }
            }
            cleared = true;
        }
    }
}
