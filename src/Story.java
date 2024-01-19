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
        boolean cleared = false;
        while (pilot.getHealth() > 0 && Raven.getRHealth() > 0 && !cleared) {
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
            System.out.println("Suddenly, a rustling could be heard in the bushes.");
            System.out.println("You and Raven widen your eyes in shock as you see a giant bear emerge, ready to pounce upon attack. What do you do?");
            System.out.println("Current Inv: " + PilotPlayer.getInv());
            System.out.println("a. Try to fight the bear.");
            System.out.print("b. Take Raven and run.");
            if (PilotPlayer.hasItem("gun") || PilotPlayer.hasItem("shotgun")) {
                System.out.print("\nc. Try firing at the bear.");
            }
            userInput = scan.nextLine();
            if (userInput.equals("c") && (PilotPlayer.hasItem("gun") || PilotPlayer.hasItem("shotgun"))) {
                int success = (int) (Math.random() * 3);
                if (success >= 2) {
                    System.out.println(PilotPlayer.addItem("bear meat"));
                    System.out.println("The bear has been successfully killed with a shot!");
                } else {
                    System.out.println("You missed!");
                    int RavenHit = (int) (Math.random() * 3);
                    if (RavenHit == 1) {
                        Raven.ravenLoseHealth(30);
                        System.out.println("\"AAAAA! OWWWW!\" Raven screams as the bear slashes at her, costing her 30 health.");
                    } else {
                        pilot.loseHealth(20);
                        System.out.println("The bear pinned you down, swiping at you with it's claws!");
                        System.out.println("You lost 20 health!");
                    }
                    System.out.println("The bear roars, taking off into the wilderness.");
                }
            } else if (userInput.equals("a")) {
                System.out.println("You attack the bear.");
                int success = (int) (Math.random() * 3);
                if (success == 1) {
                    System.out.println("You successfully wade the bear off, and it runs away into the wildnerness, leaving the both of you unharmed.");
                } else if (success == 2) {
                    pilot.loseHealth(20);
                    System.out.println("The bear strikes at you, costing you 20 damage!");
                    System.out.println("It then dashes off into the wilderness, leaving you harmed, but at least Raven was untouched.");
                } else {
                    Raven.ravenLoseHealth(30);
                    System.out.println("Raven gets hurt by 30 health as the bear pounces at her, slashing her skin. You pry the bear off, using your pocket knife to stab it.");
                    System.out.println("The bear roars, taking off into the wilderness, leaving Raven severely hurt.");
                }
            } else {
                System.out.println("You and Raven decide to run away for your life, and not mess around with the beast!");
                System.out.println("The bear chases after you two, gaining pace.");
                int uhOh = (int) (Math.random() * 3);
                if (uhOh == 1) {
                    pilot.loseHealth(10);
                    Raven.ravenLoseHealth(10);
                    System.out.println("You both intake a damage of 10 as the bear catches up and slahes you both! You manage to pry the bear off you two with your pocket knife.");
                    System.out.println("You jump into a cave with Raven, the bear growling as it cannot reach you anymore");
                    System.out.println("It takes off into the wilderness, leaving you both harmed.");
                } else {
                    System.out.println("You spot a cave, and quickly jump into there, as the bear runs past not noticing.");
                    System.out.println("You have successfully escaped the bear.");
                }
            }
            wait2seconds();
            System.out.println("When you two found a cave, you stay there, trying to catch your breath from the bear.");
            System.out.println("You decide to situate yourselves there for now.");
            cleared = true;
        } // while code's semicolon
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        wait2seconds();
        System.out.println("PART 1 COMPLETED.");
        System.out.println("SAVING GAME...");
        wait2seconds();
        System.out.println("File saved. Starting next part..");
        cleared = false;
        ConsoleUtility.clearScreen();
        while (pilot.getHealth() > 0 && Raven.getRHealth() > 0 && !cleared) {
            System.out.println("Your Current Health: " + pilot.getHealth());
            System.out.println("Raven's Current Health: " + Raven.getRHealth());
            System.out.println("Current Inv: " + PilotPlayer.getInv());
            System.out.println("You two decide to stay in the cave for at least a week. You kept Raven company as you worked on trying to repair the GPS you found from the plane wreck.");
            waitADangSecond();
            System.out.println("She looks at you sighing, her eyes swell with sorrow as she eyed the remnants you collected from the plane crash.");
            System.out.println("\"You know... I never really had parents to love. I never had friends, always isolated in my castle.\"");
            waitADangSecond();
            System.out.println("\"I kinda like this better than being in that damned castle.\" she mumbled.");
            System.out.println("She looks at you, noting your professional silence. \"How come you're working so hard to help me? I admire it.\"");
            System.out.println("a. \"Just doing my job, madam. Is all.\" Go back to working on the GPS.");
            System.out.print("b. Smile at her to comfort her. \"I'm not really here for the money, just here to help out whoever needs that help. I like being true to my duty, Madam.\"");
            userInput = scan.nextLine();
            if (userInput == "a") {
                System.out.println("\"I see, I see..\" she responds.");
            } else {
                Raven.addFriendship(10);
                System.out.println("\"That's.. really sweet.\" She smiled, holding your hand.");
                System.out.println("As you held her hand, you smiled sweetly, and you suddenly felt just a little better in all this havoc.");
                pilot.addHealth(5);
            }
            System.out.println("a. \"So, how come you're all alone?\"");
            System.out.print("b. Continue to work on the GPS in silence.");
            userInput = scan.nextLine();
            if (userInput == "a") {
                System.out.println("Do you really wanna know me?");
                System.out.println("a. \"Yeah sure, why not?\"");
                System.out.print("b. \"Nah, not right now.\"");
                userInput = scan.nextLine();
                if (userInput == "a") {
                    System.out.println("Alright, well...");
                    System.out.println("\"You know, I used to have a mom. Well, I mean duh, everybody does!\" she chuckled.");
                    System.out.println("\"My father, who owns a rich fashion business, married her long ago. But then, after realizing she gave birth to a daughter..\" She sighs.");
                    waitADangSecond();
                    System.out.println("\"He left us. My mother soon died of an illness, and he didn't even visit then. Too focused on his company to send worry our way.\"");
                    waitADangSecond();
                    System.out.println("\"He paid for the castle I stayed in in order to keep me away from him, so that he could focus on his company instead of family.\"");
                    System.out.println("\"For years, I sat behind solemn stone walls which radiated nothing but intolerable solitude and grieving silence.\"");
                    System.out.println("\"with nothing but butlers and maids to keep me company, none of whom would even tell me why I was trapped here.\" Raven looked at you as she continued.");
                    System.out.println("\"He finally called me over a week ago to come to America, to discuss plans about the future owner of the company.\"");
                    waitADangSecond();
                    System.out.println("\"I just want to see him.. I couldn't care less about the company which kept me in stone shackles my whole childhood.\"");
                    waitADangSecond();
                    System.out.println("\"I want to be a daughter, not just a business heir.\"");
                    System.out.println("\"Well, I guess that's about it for me.\"")
                    waitADangSecond();

                } else {
                    System.out.println("\"Alright,\" she nodded.");
                }
            }
            cleared = true;
        } // while code's semicolon
    }
}
