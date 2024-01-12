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
    public void start () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Jet Crash!");
        System.out.println("Your goal is to complete the story while keeping both yourself and your client, Raven, protected.");
        wait(3);
        System.out.println("Starting Game...");
        wait2seconds();
        ConsoleUtility.clearScreen();
        System.out.println("A lonely, rich girl who sits upon her castle for years, looking about the horizon, feels a great sense of solitude, yearning to see her father.");
        System.out.println("She is the daughter of a rich father who owns a flourishing fashion business, but her father has no business with the likes of her. ");
        System.out.println("For more than 19 years, she lived in a lonely castle her father had built to keep her away, with butlers and maids only to comfort her company.");
        System.out.println("But one day, her father calls her, telling her that his time is coming, and that it is about time the company be led by a newer generation.");
        System.out.println("Eagerly excited, more so to see him than to claim heir to the company, she agrees to come over. She is informed that a pilot has been hired for her, and to go to the air base to meet him.");
        wait(10);
    }
}
