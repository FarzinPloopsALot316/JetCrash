import java.util.Scanner;
public class Story {
    public PilotPlayer pilot = new PilotPlayer(70);
    public Raven Raven = new Raven(60);
    public Terrain island = new Terrain();

    public Story () {}

    public void wait (int seconds) { // putting it into a seperate method because im tired of typing this out
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void wait2seconds () { // putting it into a seperate method because im tired of typing this out
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

    public void start () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Jet Crash! Have fun!");
        wait(3);
        System.out.println("Starting Game...");
        wait2seconds();
        ConsoleUtility.clearScreen();
        System.out.println("A lonely, rich girl who sits upon her castle for years, looking about the horizon, feels a great sense of solitude, yearning to see her father.");
        System.out.println("She is the daughter of a rich father who owns a flourishing fashion business, but her father has no business with the likes of her. ");
        System.out.println("For more than 19 years, she lived in a lonely castle her father had built to keep her away, with butlers and maids only to comfort her company.");
        System.out.println("But one day, her father calls her, telling her that he must soon retire, and that it is about time the company be led by a newer generation.");
        System.out.println("Eagerly excited, more so to see him than to claim heir to the company, she agrees to come over.");
        System.out.println("She is informed that a pilot has been hired for her, and to go to the air base to meet him.");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        wait(10);
        System.out.println("On your journey over the large Atlantic Ocean, however, you run into a treacherous hurricane.");
        System.out.println("One of your engines fail, and for emergency purposes, you crash land the plane onto a remote island that was nearby");
        System.out.println("You wake up on the sandy shore, your eyes opening to the bright sunlight.");
        System.out.println("Your body aches like hell, but you know what your duty is.");
        System.out.println("Your goal is to complete this story while keeping both yourself and your client, Raven, protected.");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        wait(8);
        System.out.println("Your Current Health: " + pilot.getHealth());
        System.out.println("Raven's Current Health: " + Raven.getRHealth());
        System.out.println("-");
        waitADangSecond();
        System.out.println("\"Oh no, where are we?!\" Raven exclaims. ");
        System.out.println("She looks at the plane wreck. \"Oh no.. nonono.. how am I gonna get to my dad?!?!..\" she mutters hesitantly.");
        System.out.println("- Press a or b to interact. -");
        System.out.print("a. \"You'll be fine, please don't worry madam. I will make my best efforts to fix this delay.\" b. \"I don't know, but we'll figure it out somehow..\" ");
        String userInput = scan.nextLine();
        waitADangSecond();
        System.out.println("Worry filled her eyes as she looked into the vast horizons, the view of the Atlantic surrounding them not helping her panicked state.");
        System.out.println("a. \"Listen, I know it's scary, but I promise I will do everything in my will to make sure you survive this in one piece. But we'll need to trust each other.\"");
        System.out.print("b. \"We gotta hurry and find some resources. The sun looks close to setting. Come on madam.\" ");
        userInput = scan.nextLine();
        waitADangSecond();
        if (userInput.equals("a")) {
            Raven.addFriendship(10);
            System.out.println("\"O-okay I trust you. Let's uhm, go look for some resources.\" She was still scared, but her faith had increased in you.");
        } else {
            System.out.println("\"Uhmm, okay, I'll be right behind you..\"");
        }
        wait(3);
        ConsoleUtility.clearScreen();
        PilotPlayer.addItem("pocket knife");
        System.out.println("Your Current Health: " + pilot.getHealth());
        System.out.println("Raven's Current Health: " + Raven.getRHealth());
        System.out.println("Current Inv: " + PilotPlayer.getInv());
        System.out.println("-");
        System.out.println("The two of you wander into the forest, and you both look around. After a few minutes of searching the tropical vast, you spot a fruit tree.");
        System.out.println("It bore nutritious berries that could help sustain you or Raven's hunger. You pluck a few, and Raven's eyes sparkle with relief.");
        System.out.println("But there's only enough for the either one of you, not both. You could also choose to store the berries for later.");
        System.out.println("Your body was heavily damaged from the plane crash");
        System.out.println("a. Look her straight in the eyes and eat the berries. \"I'm sorry, I need it.\"");
        System.out.println("b. Give her the berries.");
        System.out.print("c. Store the berries. \"Look, we gotta keep this for later, it may come into handy. Let's not use it up right now.");
        userInput = scan.nextLine();
        if (userInput.equals("a")) {
            Raven.loseFriendship(5);
            pilot.addHealth(15);
            System.out.println("\"I- But- oh okay-\"");
        } else if (userInput.equals("b")) {
            Raven.addFriendship(5);
            System.out.println("\"Oh my goodness!! Thank you so much, I was starving!\"");
            System.out.println("She devours the berries in a near gulp. \"These berries are amazing!\"");
            System.out.println("Your body was still in pain, and suffers a bit of damage from hunger, but you were happy to help her.");
            pilot.loseHealth(10);
        } else if (userInput.equals("c")) {
            System.out.println("\"Oh I see, no worries then! Let's store it for later!\"");
        }
        island.randomItemFound();
        System.out.println("Suddenly, a rustling could be heard in the bushes.");
        System.out.println("You and Raven widen your eyes in shock as you see a giant bear emerge, ready to pounce upon attack. What do you do?");
        System.out.println("a. Try to fight the bear.");
        System.out.print("b. Take Raven and run.");
        if (PilotPlayer.hasItem("gun") && PilotPlayer.hasItem("shotgun")) {
            System.out.print("\nc. Try firing at the bear.");
        }
        userInput = scan.nextLine();
        if (userInput.equals("c") && (PilotPlayer.hasItem("gun") || PilotPlayer.hasItem("shotgun"))) {
            int success = (int) (Math.random() * 3);
            if (success >= 2) {
                System.out.println(PilotPlayer.addItem("bear meat"));
                System.out.println(PilotPlayer.addItem("bear skin"));
                System.out.println("The bear has been successfully killed with a shot!");
            }
        }
    }
}
