import java.util.Scanner;
public class Story {
    public PilotPlayer pilot = new PilotPlayer(70);
    public Raven raven = new Raven(60);
    public Terrain island = new Terrain();

    public Story() {
    }

    public void wait(int seconds) { // putting it into a separate method because im tired of typing this out
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void wait2seconds() { // putting it into a seperate method because im tired of typing this out
        try {
            Thread.sleep(2000);  // 2000 milliseconds, or 2 seconds
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void waitADangSecond() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void start() { //entire story line takes place here
        ConsoleUtility.clearScreen();
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
        System.out.println("Raven's Current Health: " + raven.getRHealth());
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
            raven.addFriendship(10);
            System.out.println("\"O-okay I trust you. Let's uhm, go look for some resources.\" She was still scared, but her faith had increased in you.");
        } else {
            System.out.println("\"Uhmm, okay, I'll be right behind you..\"");
        }
        wait(3);
        ConsoleUtility.clearScreen();
        boolean cleared = false;
        while (pilot.getHealth() > 0 && raven.getRHealth() > 0 && !cleared) {
            PilotPlayer.addItem("pocket knife");
            System.out.println("Your Current Health: " + pilot.getHealth());
            System.out.println("Raven's Current Health: " + raven.getRHealth());
            System.out.println("You searched the premises.");
            wait2seconds();
            island.randomItemFound();
            System.out.println("Current Inv: " + PilotPlayer.getInv());
            wait2seconds();
            System.out.println("-");
            System.out.println("The two of you wander into the forest, and you both look around. After a few minutes of searching the tropical vast, you spot a fruit tree.");
            System.out.println("It bore nutritious berries that could help sustain you or Raven's hunger. You pluck a few, and Raven's eyes sparkle with relief.");
            System.out.println("But there's only enough for the either one of you, not both. You could also choose to store the berries for later.");
            System.out.println("Your body was heavily damaged from the plane crash; starving could hurt.");
            System.out.println("a. Look her straight in the eyes and eat the berries. \"I'm sorry, I need it.\"");
            System.out.println("b. Give her the berries.");
            System.out.print("c. Store the berries. \"Look, we gotta keep this for later, it may come into handy. Let's not use it up right now.");
            userInput = scan.nextLine();
            if (userInput.equals("a")) {
                raven.loseFriendship(5);
                pilot.addHealth(20);
                System.out.println("\"I- But- oh okay-\"");
                wait2seconds();
                System.out.println("You gain 20 health.");
            } else if (userInput.equals("b")) {
                raven.addFriendship(5);
                System.out.println("\"Oh my goodness!! Thank you so much, I was starving!\"");
                System.out.println("She devours the berries in a near gulp. \"These berries are amazing!\"");
                wait2seconds();
                System.out.println("Your body was still in pain, and suffers a bit of damage from hunger (-10), but you were happy to help her.");
                pilot.loseHealth(10);
            } else if (userInput.equals("c")) {
                System.out.println("\"Oh I see, no worries then! Let's store it for later!\" Due to hunger, you lose 10 health.");
                wait2seconds();
                pilot.loseHealth(10);
                System.out.println(PilotPlayer.addItem("berries"));
            }
            System.out.println("Suddenly, a rustling could be heard in the bushes.");
            waitADangSecond();
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
                        raven.ravenLoseHealth(30);
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
                    System.out.println("You successfully wade the bear off, and it runs away into the wilderness, leaving the both of you unharmed.");
                } else if (success == 2) {
                    pilot.loseHealth(20);
                    System.out.println("The bear strikes at you, costing you 20 damage!");
                    System.out.println("It then dashes off into the wilderness, leaving you harmed, but at least Raven was untouched.");
                } else {
                    raven.ravenLoseHealth(30);
                    System.out.println("\"AAAAA! OWWWW!\" Raven screams");
                    System.out.println("Raven gets damaged by 30 as the bear pounces at her, slashing her skin. You pry the bear off, using your pocket knife to stab it.");
                    System.out.println("The bear roars, taking off into the wilderness, leaving Raven severely hurt.");
                }
            } else {
                System.out.println("You and Raven decide to run away for your life, and not mess around with the beast!");
                System.out.println("The bear chases after you two, gaining pace.");
                int uhOh = (int) (Math.random() * 3);
                if (uhOh == 1) {
                    pilot.loseHealth(10);
                    raven.ravenLoseHealth(10);
                    System.out.println("You both intake a damage of 10 as the bear catches up and slashes you both! You manage to pry the bear off you two with your pocket knife.");
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
        System.out.println("Your Current Health: " + pilot.getHealth());
        System.out.println("Raven's Current Health: " + raven.getRHealth());
        System.out.println("Current Inv: " + PilotPlayer.getInv());
        wait(4);
        System.out.println("Play next part? \"yes\" to continue.");
        System.out.println("You can also try hunting (requires shotgun) to get deer meat, which recovers health. Press q to do so.");
        userInput = "";
        int alreadyTried = 0;
        while (!userInput.equals("yes")) {
            userInput = scan.nextLine();
            if (PilotPlayer.hasItem("shotgun") && userInput.equals("q") && alreadyTried < 1) {
                System.out.println(island.hunt());
                System.out.println("Current Inv: " + PilotPlayer.getInv());
                alreadyTried++;
            } else if (userInput.equals("q") && alreadyTried >= 1) {
                System.out.println("You already tried hunting once!");
            } else {
                System.out.println("You don't have a shotgun.");
            }
        }
        System.out.println("SAVING GAME...");
        wait2seconds();
        System.out.println("File saved. Starting next part..");
        wait2seconds();
        cleared = false;
        ConsoleUtility.clearScreen();
        while (pilot.getHealth() > 0 && raven.getRHealth() > 0 && !cleared) {
            System.out.println("Your Current Health: " + pilot.getHealth());
            System.out.println("Raven's Current Health: " + raven.getRHealth());
            System.out.println("Current Inv: " + PilotPlayer.getInv());
            System.out.println("You two decide to stay in the cave for at least a week. You kept Raven company as you worked on trying to repair the GPS you found from the plane wreck.");
            wait(4);
            System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
            System.out.println("She looks at you sighing, her eyes swell with sorrow as she eyed the remnants you collected from the plane crash.");
            System.out.println("\"You know... I never really had parents to love. I never had friends, always isolated in my castle.\"");
            waitADangSecond();
            System.out.println("\"I kinda like this better than being in that damned castle.\" she mumbled.");
            System.out.println("She looks at you, noting your professional silence. \"How come you're working so hard to help me? I admire it.\"");
            System.out.println("a. \"Just doing my job, madam. Is all.\" Go back to working on the GPS.");
            System.out.print("b. Smile at her to comfort her. \"I'm not really here for the money, just here to help out whoever needs that help. I like being true to my duty, Madam.\"");
            userInput = scan.nextLine();
            if (userInput.equals("a")) {
                System.out.println("\"I see, I see..\" she responds.");
            } else {
                raven.addFriendship(10);
                System.out.println("\"That's.. really sweet.\" She smiled, holding your hand.");
                System.out.println("As you held her hand, you smiled sweetly, and you suddenly felt just a little better in all this havoc.");
                pilot.addHealth(5);
            }
            System.out.println("a. \"So, how come you're all alone?\"");
            System.out.print("b. Continue to work on the GPS in silence. (press this to skip story)");
            userInput = scan.nextLine();
            if (userInput.equals("a")) {
                System.out.println("Do you really wanna know me?");
                System.out.println("a. \"Yeah sure, why not?\"");
                System.out.print("b. \"Nah, not right now.\"");
                userInput = scan.nextLine();
                if (userInput.equals("a")) {
                    System.out.println("Alright, well...");
                    System.out.println(" - ");
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
                    System.out.println("\"Well, I guess that's about it for me.\"");
                    System.out.println("You nod, comforting her. \"That's a very heartfelt experience.\"");
                    waitADangSecond();
                    System.out.println("\"Raven, mark my words, I will do everything in my ability to make sure you reach your father in one piece.\" You smile, saluting her");
                    System.out.println("Raven smiles back sweetly. \"I trust you.\"");
                    System.out.println(" - ");
                    waitADangSecond();
                } else {
                    System.out.println("\"Alright,\" she nodded.");
                }
            }
            if (PilotPlayer.hasItem("berries")) {
                System.out.println("You realized you still had the berries from before. Feed or store?");
                System.out.println("a. Store.");
                System.out.println("b. Feed Raven.");
                System.out.print("c. Feed yourself.");
                userInput = scan.nextLine();
                if (userInput.equals("a")) {
                    System.out.println("You stored them for later.");
                } else if (userInput.equals("b")) {
                    System.out.println("You handed Raven the berries, and she happily ate them, recovering 10 health. Her trust increased in you as well.");
                    raven.addFriendship(5);
                    raven.ravenAddHealth(10);
                    System.out.println(PilotPlayer.removeItem("berries"));
                } else if (userInput.equals("c")) {
                    System.out.println("You ate the berries and recover 10 health.");
                    System.out.println(PilotPlayer.removeItem("berries"));
                }
            }
            System.out.println("-");
            System.out.println("You continue working on the GPS under the warm embrace of the hazel lit fire, which crackled softly in the darkness of the cave.");
            waitADangSecond();
            System.out.println("Suddenly, you hear a sound from outside. Food cans being rattled, a few knocked over.");
            if (PilotPlayer.hasItem("gun")) {
                System.out.println("You put your gun at a ready aim, heading out the entrance of the cave to see what was wrong.");
                wait2seconds();
                System.out.println("You spot a young man fiddling around with your cans of food, and you aim your gun at him.");
                System.out.println("\"HANDS UP! DON'T MOVE ANYWHERE. DROP THE SHOTGUN ON YOUR BACK,\" you order.");
                waitADangSecond();
                System.out.println("\"Hey now, no need to fret, I ain't mean no harm!\" He drops the gun as ordered, and you snatch it.");
                if (!PilotPlayer.hasItem("shotgun")) {
                    System.out.println(PilotPlayer.addItem("shotgun"));
                } else {
                    System.out.println("The shotgun was broken and useless, so you toss it aside.");
                }
            } else {
                System.out.println("You ready your pocket knife, heading out the entrance of the cave to see what's wrong.");
                wait2seconds();
                System.out.println("You spot a young man fiddling around with your cans of food. You point the knife at him.");
                System.out.println("\"HANDS UP! DON'T MOVE ANYWHERE,\" you order.");
                wait2seconds();
                System.out.println("\"Hey now, no need to fret, I ain't mean no harm!\" The man puts his arms up.");
            }
            System.out.println("\"I is' just here for some food is all! I swear! I ain't mean no bad to you!\"");
            waitADangSecond();
            System.out.println("a. \"State your name, age, and occupation.\" Lower your weapon in trust.");
            System.out.print("b. \"Who the (redacted) are you?\" Keep your weapon aimed.");
            userInput = scan.nextLine();
            if (userInput.equals("a")) {
                wait2seconds();
                System.out.println("Ash noted you lowering your guard, and nodded. \"Name's Ash, 19 years old. I dwell in these woods humbly.\"");
                System.out.println("Well..");
                wait(5);
                System.out.println("-");
            } else {
                wait2seconds();
                if (PilotPlayer.hasItem("gun")) {
                    System.out.println("He looked into the barrel of your pistol, noting the rim of the bullet inside cocked and ready to fire. He gulped");
                    System.out.println("\"I's just.. I- Please I ain't.. I'm justa' humble dwella' in here's woods, spare mercy!\"");
                    raven.loseFriendship(10);
                    wait2seconds();
                    System.out.println("\"Lower your gun! Can't you see he's already helpless?\" Raven looks at you with concern. You lower your gun.");
                    System.out.println("Her faith in your actions dwindle a bit.");
                    wait2seconds();
                    System.out.println("Ash nods slowly, deciding to introduce himself calmly. \"N-Name's Ash.. 19 years old.\"");
                    wait(5);
                    System.out.println("-");
                } else {
                    System.out.println("He looked at the sharp rim of your knife, shuddering as you pointed it directly at his neck.");
                    System.out.println("\"I's just.. I- Please I ain't.. I'm justa' humble dwella' in here's woods, spare mercy!\"");
                    raven.loseFriendship(15);
                    wait2seconds();
                    System.out.println("\"Lower your Knife! Can't you see he's already helpless?\" Raven looks at you with concern. You lower your knife.");
                    System.out.println("Her faith in your actions dwindle a bit.");
                    wait2seconds();
                    System.out.println("Ash nods slowly, deciding to introduce himself calmly. \"N-Name's Ash.. 19 years old..\"");
                    wait(5);
                    System.out.println("-");
                }
            }
            System.out.println("\"Used to be a satellite repairer back in my town, fixin' navigation technology for a job.. GPS, trackers, you name it,\" he continued.");
            System.out.println("\"But now I'm out here after I had to run away from home, Americano' feds want me for crafting illegally..\"");
            wait2seconds();
            System.out.println("\"You'se see, I know y'all two out here done got yo selves in quite the fiddle, stuck in dis here big ol' cave.");
            System.out.println("\"I saw the plane ruckus out on shore! Yep, y'all's in quite the trouble, judgin' by the blue on you'se faces!");
            wait2seconds();
            System.out.println("He noticed Raven. \"You've got a missy there too, lad looks pretty hurt. Now instead of triflin' with the likes of a sad man lik' me,..");
            System.out.println("\"How's I say I offa' you guys some humble hospitality at my cabin? Not too far on from here, 'bout a half hour hike.\" Ash smiles.");
            System.out.println("- Press q to continue -");
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("Ash nods at your agreement. \"Wise choice! Well, c'mon now, we'll head at daybreak. We pack then.\"");
            System.out.println("-");
            waitADangSecond();
            System.out.println("Before going to bed, you search the premises for any luck.");
            wait2seconds();
            island.randomItemFound();
            System.out.println("Current Inv: " + PilotPlayer.getInv());
            wait(3);
            System.out.println("-");
            cleared = true;
        } // while code's semicolon
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        wait2seconds();
        System.out.println("PART 2 COMPLETED.");
        System.out.println("Your Current Health: " + pilot.getHealth());
        System.out.println("Raven's Current Health: " + raven.getRHealth());
        System.out.println("Current Inv: " + PilotPlayer.getInv());
        wait(4);
        if (raven.getFriendship() >= 30) {
            Raven.setHide();
            System.out.println("Another consideration to note:");
            wait2seconds();
            System.out.println(" - ");
            System.out.println("Due to Raven's increased trust in you, she will now hide behind you at your command.");
            System.out.println("Commanding her to hide will spare her completely from any bullet wounds or opponent attacks in this part.");
            System.out.println(" - ");
            wait2seconds();
        }
        System.out.println("Play next part? \"yes\" to continue.");
        System.out.println("You can also try hunting (requires shotgun) to get deer meat, which recovers health. Press q to do so.");
        System.out.println("Current Inv: " + PilotPlayer.getInv());
        userInput = "";
        alreadyTried = 0;
        while (!userInput.equals("yes")) {
            userInput = scan.nextLine();
            if (PilotPlayer.hasItem("shotgun") && userInput.equals("q") && alreadyTried < 1) {
                System.out.println(island.hunt());
                System.out.println("Current Inv: " + PilotPlayer.getInv());
                alreadyTried++;
            } else if (userInput.equals("q") && alreadyTried >= 1) {
                System.out.println("You already tried hunting once!");
            } else {
                System.out.println("You don't have a shotgun.");
            }
        }
        System.out.println("SAVING GAME...");
        wait2seconds();
        System.out.println("File saved. Starting next part..");
        wait2seconds();
        cleared = false;
        StoryPart2 storyContinued = new StoryPart2(pilot.getHealth(), PilotPlayer.getInvList(), raven.getRHealth());
        storyContinued.start2();
        ConsoleUtility.clearScreen();
    }
}