import java.util.Scanner;
public class Story {
    public PilotPlayer pilot = new PilotPlayer();
    public Raven Raven = new Raven();

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
        System.out.print("b. \"We gotta hurry and find some resources. The sun looks close to setting. Come on madam. ");
        userInput = scan.nextLine();
        waitADangSecond();
        if (userInput.equals("a")) {
            Raven.addFriendship(5);
            System.out.println("\"O-okay I trust you. Let's uhm, go look for some resources.\" She was still scared, but her faith had increased in you.");
        } else {
            System.out.println("\"Uhmm, okay, I'll be right behind you..\"");
        }
    }
}
