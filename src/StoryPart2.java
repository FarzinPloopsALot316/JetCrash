import java.util.Scanner;

public class StoryPart2 {
    PilotPlayer pilot2;
    Raven raven2;

    public StoryPart2(int currentHealth, String[] currentInv, int RCurrentHealth) {
        pilot2 = new PilotPlayer(currentHealth, currentInv);
        raven2 = new Raven(RCurrentHealth);
    }

    public void wait(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void wait2seconds() {
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

    public void start2() {
        boolean cleared = false;
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        while (!cleared) {
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
                    System.out.println("You eyed your bear meat.");
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
                    System.out.println("You eyed your deer meat.");
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
            System.out.println("Ash prepares dinner for everybody, as Raven catches Ash up with the story.");
            System.out.println("He nods in awe as she explained the whole situation, taking a bite of his food.");
            System.out.println(" - ");
            wait2seconds();
            System.out.println("\"So y'all out here 'cause Missy Raven wants to see her pop!\" Ash chuckles.");
            System.out.println("\"Well I'll be danged howeva', it's quite brave to go through all dis' trouble just to do so.\"");
            wait(3);
            System.out.println("a. \"That's right,\" you respond.");
            System.out.print("b. \"Mhm.\" Take a bite of your food.");
            userInput = scan.nextLine();
            System.out.println(" - ");
            wait2seconds();
            System.out.println("\"See, buddy,\" he turns to you. \"You'se a darin' fella, wreathin' through just to protect Missy and help her out.\"");
            System.out.println("He smiled sweetly at you. \"And you'se doin' it just for spite? Not even the money matters?\"");
            System.out.println("- Press q to agree -");
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("You nod.");
            waitADangSecond();
            System.out.println(" - ");
            System.out.println("\"Now that's somethin'! You'se really is more than a man. Holla!\" Ash was astonished.");
            System.out.println("\"I sure's do hope you and Missy make it through this alive. Yall's be careful now...\"");
            wait(3);
            System.out.println("\"Now you see, there be bad people out here, try'na take what ain't theirs to take...");
            System.out.println("Ash leaned in closer to the two of you, whispering.");
            wait2seconds();
            System.out.println("\"Missy, now you said you'se the daughter and future of a whole flourishin' business! Well holla to that, but..\"");
            System.out.println("\"Other people may also wanna be the business's future. They may just try to claim yo' spot!\" Ash warned.");
            System.out.println("- Press q to agree -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            System.out.println("\"And trust be held, now God fo'bid!..\" Ash's eyes widened a bit as he continued. \"They gon' even kill to get it.\"");
            wait2seconds();
            System.out.println("Raven yelped. \"But I didn't do any harm to anybody!-\"");
            System.out.println("\"Missy, they won't care, even if you'se is as innocent as a frolickin' deer.\" Ash frowns, patting Raven on the shoulder.");
            wait(3);
            System.out.println("\"But I see you'se got a man who's willing to cut limb and bone for yo' troubles, and I promise, I know's the both of you'se gon' be safe. Now see,..\"");
            System.out.println("\"I can help with that broken GPS you have with you. Most likely just needs some signal reception repairs n' an' antennae.\"");
            System.out.println("- Press q to accept help -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            System.out.println("\"Well I'll be mo' than honored to help y'all out.\" He gave Raven a tiny little bear plushie.");
            wait2seconds();
            System.out.println("\"Now I know it's stupid but..\" Ash chuckles. \"I hope it at least means sum'.\" Raven smiled, kindly accepting the plushie, almost eagerly.");
            wait(3);
            System.out.println("She snuggles the tiny plushie in her hands, her eyes twinkling. \"I love it, it's so cute!\"");
            System.out.println("You smile as you watched her hold the plushie. Ash smiles, then turns to you.");
            System.out.println("\"Well, I'll have that GPS now. Reckon I'll be able to fix it by tonight.");
            System.out.println("- Press q to accept -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("You take out the GPS and hand it to him.");
            waitADangSecond();
            System.out.println("For the rest of the day, you, Raven, and Ash get along wonderfully, sharing stories and laughing over jokes ");
            System.out.println("Ash continues to work of the GPS, almost done with it by sunset.");
            wait2seconds();
            System.out.println("You head inside with Raven. Raven laid down on a bed, getting some sleep, as you did the same in a chair across the room.");
            System.out.println("The sun docked it's head slowly below the horizon, saying it's farewells as night echoed across the woods with it's growing waves of darkness.");
            System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
            wait(3);
            System.out.println("In the next 2 hours, however, it wasn't the call of crickets that would awaken you to a jolt.");
            System.out.println("- Press q to continue -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            System.out.println("The sound of a bullet ricocheting through the trees way outside fires you up as you grab your weapon immediately.");
            System.out.println("Without question, you shake Raven awake, who was also startled by the noise.");
            System.out.println("- Press q to escort -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            System.out.println("\"Shhh, stay quiet, follow my steps. Stay below the windows.\" you hush to Raven in a quiet tone. She nods in agreement.");
            wait2seconds();
            System.out.println(" - ");
            System.out.println("Footsteps could be heard outside, but they were quite far from the cabin. Ash crawls below the windows, finding the both of you.");
            System.out.println("\"Holla!\" he whispers to you two. \"Thanks lord I found y'all. Heard the first bullet an' I already got myself down to my knees searchin'.\"");
            wait2seconds();
            System.out.println("\"It's most likely those assassins you mentioned about earlier,\" Raven acknowledged. Ash nods, worry filling his tone.");
            System.out.println("\"We need to head to my shed. The GPS is ready, it just needa' be paired with the antennae in there.\" Ash points to the shed across the yard.");
            System.out.println("- Press q to agree -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            System.out.println("\"But there's most likely assassins waiting in the yard already.. We need a distraction..\" Raven suggests.");
            wait(5);
            System.out.println("It was quiet outside all of a sudden.");
            wait2seconds();
            System.out.println("a. Carefully peek through the window with your weapon ready.");
            System.out.print("b. Wait patiently, and hope for something good.");
            userInput = scan.nextLine();
            if (userInput.equals("a")) {
                System.out.println("You peek through the window slowly, but as you do, a bullet flies through the window glass in front of you.");
                System.out.println("The bullet grazes the muscle above your shoulder before flying past, inflicting 5 damage");
                pilot2.loseHealth(5);
                wait(2);
                System.out.println("Raven shrieks as you fall back down. You winced in pain as you cupped your wound.");
                System.out.println("\"THEY'RE IN THERE!\" the assassins outside holler. \"ADVANCE!\"");
            } else {
                System.out.println("You stay put, your weapon ready. As you start to reconsider, a bullet flies through the cabin window above.");
                System.out.println("The glass shatters as the bullet strikes through JUST ABOVE your hair, slamming a hole into the wall ahead.");
                wait2seconds();
                System.out.println("You shield Raven from the glass in time. Luckily, nobody was hurt, because you followed your instructions.");
            }
            System.out.println(" - ");
            wait2seconds();
            System.out.println("Suddenly, a whole array of bullets blasted through the cabin. You all stayed just under the range.");
            System.out.println("- Press q to continue -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            System.out.println("\"HOLY COW! EVER'BODY WATCH OUT!\" Ash yelled. He suddenly notices a large canister of gasoline under the sink. You spot it too.");
            wait2seconds();
            System.out.println("\"Hang on now missy! I's got a bright idea. Mister Pilot, mind rollin' that can over on here?\" You do as asked.");
            System.out.println("- Press q to grab gasoline can -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            System.out.println("You and Ash hold the can of gasoline together. \"On my mark, we throw the can, and toss a lighter at it after!\" Ash exclaimed.");
            System.out.println("\"The smoke and fire outta drive MOST of em' off!\" he said.");
            System.out.println("- Press q to toss can -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            System.out.println("The assassins notice the can rolling towards them.");
            System.out.println("\"NOW!!\" Ash yelled, handing you the lit lighter!");
            System.out.println("- Press q to toss lighter -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            int deathCount = 0;
            boolean complete = false;
            while (!complete) {
                System.out.println("Ash lead the two of you to the shed, but suddenly, 8 assassins jump out!");
                System.out.println("- Press q to begin battling -");
                userInput = "";
                while (!userInput.equals("q")) {
                    userInput = scan.nextLine();
                }
                System.out.println("\"Alright, we'll do this the hard way.\" you sigh.");
                int ammo = 20;
                if (Raven.getHide()) { // if you've gained enough friendship
                    System.out.println("Raven, whose trust you hold, hides behind you, completely shielded from the 8 assassins as you fought.");
                    for (int count = 1; count <= 8; count++) {
                        System.out.println("--------------------------- ROUND " + count + " --------------------------");
                        System.out.println("Your Current Health: " + pilot2.getHealth());
                        System.out.println("Raven's Current Health: " + raven2.getRHealth());
                        System.out.println("Current Inv: " + PilotPlayer.getInv());
                        System.out.println(" - ");
                        wait(5);
                        System.out.println("Assassin " + count + " encountered!");
                        System.out.println("Ammo: " + ammo);
                        if (PilotPlayer.hasItem("gun")) { //set an else statement for knife only, this is if the user has a gun
                            System.out.println("a. Fire gun.");
                            System.out.print("b. Try to dodge, then charge with your knife.");
                            userInput = scan.nextLine();
                            if (userInput.equals("a")) { //if user chooses to fire
                                int success = (int) ((Math.random() * 4) * 1);
                                if (success == 1) {
                                    System.out.println("You missed! The assassin shot you and ran away. You lose 20 health and 5 ammo.");
                                    pilot2.loseHealth(20);
                                    ammo -= 5;
                                    System.out.println("Ammo: " + ammo);
                                } else if (ammo <= 0) {
                                    System.out.println("Uh oh! Did you forget you're out of ammo? Yikes!");
                                    System.out.println("You missed! The assassin shot you and ran away. You lose 20 health.");
                                    pilot2.loseHealth(20);
                                } else {
                                    System.out.println("You fired! The assassin drops dead. 5 ammo used.");
                                    ammo -= 5;
                                    System.out.println("Ammo: " + ammo);
                                }
                            } else { //if user chooses to use knife
                                int success = (int) ((Math.random() * 4) * 1);
                                if (success == 1) {
                                    System.out.println("You missed! The assassin stabbed you and ran away. You lose 25 health.");
                                    pilot2.loseHealth(25);
                                } else {
                                    System.out.println("You successfully dodged and stabbed the assassin to death!");
                                }
                            }
                        } else { //if user doesn't have gun
                            System.out.println("a. Attack");
                            System.out.print("b. Try to dodge");
                            userInput = scan.nextLine();
                            if (userInput.equals("a")) { //if user chooses to attack
                                int success = (int) ((Math.random() * 4) * 1);
                                if (success == 1) {
                                    System.out.println("You missed! The assassin stabbed you and ran away. You lose 20 health.");
                                    pilot2.loseHealth(20);
                                } else {
                                    System.out.println("You successfully stabbed the assassin to death!");
                                }
                            } else { //if user chooses to dodge completely
                                int success = (int) ((Math.random() * 4) * 1);
                                if (success == 1) {
                                    System.out.println("You tried! The assassin stabbed you and ran away. You lose 20 health.");
                                    pilot2.loseHealth(20);
                                } else {
                                    System.out.println("You successfully dodged");
                                }
                            }
                        }//end of knife only codes
                        if (pilot2.getHealth() <= 0 && raven2.getRHealth() <= 0) {
                            pilot2.addHealth(60);
                            raven2.ravenAddHealth(60); //show mercy, but take away their gun.
                            count = 0;
                            System.out.println(LoseScreens.died());
                            System.out.println(LoseScreens.RavenDied());
                            if (PilotPlayer.hasItem("gun")) {
                                PilotPlayer.removeItem("gun");
                            }
                            System.out.println("- Press q to retry -");
                            userInput = "";
                            while (!userInput.equals("q")) {
                                userInput = scan.nextLine();
                            }
                            deathCount++;
                        } else if (pilot2.getHealth() <= 0) {
                            pilot2.addHealth(60);
                            count = 0;
                            System.out.println(LoseScreens.died());
                            if (PilotPlayer.hasItem("gun")) {
                                PilotPlayer.removeItem("gun");
                            }
                            System.out.println("- Press q to retry -");
                            userInput = "";
                            while (!userInput.equals("q")) {
                                userInput = scan.nextLine();
                            }
                            deathCount++;
                        } else if (raven2.getRHealth() <= 0) {
                            raven2.ravenAddHealth(60);
                            count = 0;
                            ammo = 20;
                            System.out.println(LoseScreens.RavenDied());
                            System.out.println("- Press q to retry -");
                            userInput = "";
                            while (!userInput.equals("q")) {
                                userInput = scan.nextLine();
                            }
                            deathCount++;
                        } // end of Raven hidden sequence
                    } //for loop bracket end
                } else { //for if raven cannot hide
                    for (int count = 1; count <= 8; count++) {
                        System.out.println("--------------------------- ROUND " + count + " --------------------------");
                        System.out.println("Your Current Health: " + pilot2.getHealth());
                        System.out.println("Raven's Current Health: " + raven2.getRHealth());
                        System.out.println("Current Inv: " + PilotPlayer.getInv());
                        System.out.println(" - ");
                        wait(5);
                        System.out.println("Assassin " + count + " encountered!");
                        System.out.println("Ammo: " + ammo);
                        if (PilotPlayer.hasItem("gun")) { //set an else statement for knife only, this is if the user has a gun
                            System.out.println("a. Fire gun.");
                            System.out.print("b. Try to dodge, then charge with your knife.");
                            userInput = scan.nextLine();
                            if (userInput.equals("a")) { //if user chooses to fire
                                int success = (int) ((Math.random() * 4) * 1);
                                int rHurt = (int) ((Math.random() * 4) * 1);
                                if (success == 1) {
                                    System.out.println("You missed! The assassin shot you and ran away. You lose 20 health and 5 ammo.");
                                    if (rHurt == 1) {
                                        System.out.println("The assassin attacks Raven too! She inflicts 20 damage!");
                                        raven2.ravenLoseHealth(20);
                                    }
                                    pilot2.loseHealth(20);
                                    ammo -= 5;
                                    System.out.println("Ammo: " + ammo);
                                } else if (ammo <= 0) {
                                    System.out.println("Uh oh! Did you forget you're out of ammo? Yikes!");
                                    System.out.println("You missed! The assassin shot you and ran away. You lose 10 health.");
                                    pilot2.loseHealth(20);
                                    if (rHurt == 1) {
                                        System.out.println("The assassin attacks Raven too! She inflicts 10 damage!");
                                        raven2.ravenLoseHealth(20);
                                    }
                                } else {
                                    System.out.println("You fired! The assassin drops dead. 5 ammo used.");
                                    ammo -= 5;
                                    System.out.println("Ammo: " + ammo);
                                }
                            } else { //if user chooses to use knife
                                int success = (int) ((Math.random() * 4) * 1);
                                int rHurt = (int) ((Math.random() * 4) * 1);
                                if (success == 1) {
                                    System.out.println("You missed! The assassin stabbed you and ran away. You lose 25 health.");
                                    pilot2.loseHealth(25);
                                    if (rHurt == 1) {
                                        System.out.println("The assassin attacks Raven too! She inflicts 20 damage!");
                                        raven2.ravenLoseHealth(20);
                                    }
                                } else {
                                    System.out.println("You successfully dodged and stabbed the assassin to death!");
                                }
                            }
                        } else { //if user doesn't have gun
                            System.out.println("a. Attack");
                            System.out.print("b. Try to dodge");
                            userInput = scan.nextLine();
                            if (userInput.equals("a")) { //if user chooses to attack
                                int success = (int) ((Math.random() * 4) * 1);
                                int rHurt = (int) ((Math.random() * 4) * 1);
                                if (success == 1) {
                                    System.out.println("You missed! The assassin stabbed you and ran away. You lose 20 health.");
                                    pilot2.loseHealth(20);
                                    if (rHurt == 1) {
                                        System.out.println("The assassin attacks Raven too! She inflicts 20 damage!");
                                        raven2.ravenLoseHealth(20);
                                    }
                                } else {
                                    System.out.println("You successfully stabbed the assassin to death!");
                                }
                            } else { //if user chooses to dodge completely
                                int success = (int) ((Math.random() * 4) * 1);
                                int rHurt = (int) ((Math.random() * 4) * 1);
                                if (success == 1) {
                                    System.out.println("You tried! The assassin stabbed you and ran away. You lose 20 health.");
                                    pilot2.loseHealth(20);
                                    if (rHurt == 1) {
                                        System.out.println("The assassin attacks Raven too! She inflicts 20 damage!");
                                        raven2.ravenLoseHealth(20);
                                    }
                                } else {
                                    System.out.println("You successfully dodged");
                                }
                            }
                        }//end of knife only codes
                        if (pilot2.getHealth() <= 0 && raven2.getRHealth() <= 0) {
                            pilot2.addHealth(60);
                            raven2.ravenAddHealth(60); //show mercy, but take away their gun.
                            count = 0;
                            System.out.println(LoseScreens.died());
                            System.out.println(LoseScreens.RavenDied());
                            if (PilotPlayer.hasItem("gun")) {
                                PilotPlayer.removeItem("gun");
                            }
                            System.out.println("- Press q to retry -");
                            userInput = "";
                            while (!userInput.equals("q")) {
                                userInput = scan.nextLine();
                            }
                            deathCount++;
                        } else if (pilot2.getHealth() <= 0) {
                            pilot2.addHealth(60);
                            count = 0;
                            System.out.println(LoseScreens.died());
                            if (PilotPlayer.hasItem("gun")) {
                                PilotPlayer.removeItem("gun");
                            }
                            System.out.println("- Press q to retry -");
                            userInput = "";
                            while (!userInput.equals("q")) {
                                userInput = scan.nextLine();
                            }
                            deathCount++;
                        } else if (raven2.getRHealth() <= 0) {
                            raven2.ravenAddHealth(60);
                            count = 0;
                            ammo = 20;
                            System.out.println(LoseScreens.RavenDied());
                            System.out.println("- Press q to retry -");
                            userInput = "";
                            while (!userInput.equals("q")) {
                                userInput = scan.nextLine();
                            }
                            deathCount++;
                        } // end of Raven NOT HIDDEN sequence
                    } //for loop bracket end
                } // end of entire battle sequence
                complete = true;
            } //battle while code's bracket
            System.out.println("You successfully made it through!");
            System.out.println("--------------------------- FINISHED BATTLE --------------------------");
            cleared = true;
        } // while code's bracket
        wait(4);
        System.out.println("PART 3 COMPLETED.");
    }
}