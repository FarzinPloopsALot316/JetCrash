import java.util.Scanner;
public class Story {
    public PilotPlayer pilot = new PilotPlayer();
    public Raven Raven = new Raven();

    public Story () {}

    public void start () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Jet Crash!");
        System.out.println("Your goal is to complete the story while keeping both yourself and your client, Raven, protected.");
        try {
            Thread.sleep(3000);  // 2000 milliseconds, or 2 seconds
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.println("Starting Game...");
        try {
            Thread.sleep(2000);  // 2000 milliseconds, or 2 seconds
        } catch (Exception e) {
            System.out.println("error");
        }
        ConsoleUtility.clearScreen();
        System.out.println("testing testing testinggggg");
        try {
            Thread.sleep(2000);  // 2000 milliseconds, or 2 seconds
        } catch (Exception e) {
            System.out.println("error");
        }
        ConsoleUtility.clearScreen();
    }
}
