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
                System.out.println("The can explodes, and fire shoots everywhere, covering a wall between you three and most of the assassins who burned behind it.");
                System.out.println("Ash lead the two of you to the shed, but suddenly, 8 assassins jump out!");
                wait2seconds();
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
            } //battle while code's bracket, do note you're still running to the shed
            System.out.println("You successfully made it through! You died " + deathCount + " times!");
            System.out.println("--------------------------- FINISHED BATTLE --------------------------");
            System.out.println("Ash leads you and Raven to the shed on time, jamming the door shut behind him with a chair. He pushed over a shelf to barricade further.");
            System.out.println("You notice a secret trap door leading to the basement of this particular shed. You remove the boxes and furniture on top.");
            wait(5);
            System.out.println("Ash slumps down against the wall, covering the bullet wound in his stomach. Sadly, one of the assassins got to him.");
            wait(3);
            System.out.println("Raven's eyes widened as she watched the blood slowly stain his shirt. \"A-Ash?!..\" she stuttered.");
            wait(3);
            System.out.println("You notice his wound and immediately stop to go to his side. You try to pump the wound and stop the blood flow.");
            wait2seconds();
            System.out.println("\"N-n-no c'mon n-now fella, you'se know better than.. than to.. try an' fix dis..\" Ash coughed out.");
            System.out.println("\"You need to get under here's trapdoor, the antennae and GPS is down there! G-go on now.. I'll be behind.\"");
            System.out.println("- Press q to open underground trapdoor -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("You head to the trapdoor and open it.");
            System.out.println(" - ");
            wait2seconds();
            System.out.println("You rush everybody inside, closing the trapdoor above you tight. Raven sits Ash down.");
            wait2seconds();
            System.out.println("A light blinks on, and you head to the antennae and GPS on the worktable.");
            System.out.println("\"Yes that's them!\" Ash heaves out. \"N-Now, pair em..\" He coughs painfully. Raven tries to aid the wound");
            System.out.println("- Press q to attempt the pair -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("You connect the wires. The GPS and the communicators blinks to life, and you immediately try to contact an emergency crew in America");
            System.out.println(" - ");
            wait(4);
            System.out.println("\"Hello, Emergency Personnel requested. Respond.\" No response. \"Hello? HELLO?!\"");
            System.out.println("You slam the table in frustration. The assassins were already on their way to you, about to search the shed entrance.");
            wait2seconds();
            System.out.println("Raven look at you with worry, holding the tiny plushie from before to her heart.");
            System.out.println("She sat by Ash, who groaned in pain.");
            System.out.println("Suddenly...");
            wait(6);
            System.out.println("\"This is Blue Cross Aerial Emergency Personnel.\" A voice on the reciever's radio crackled.");
            System.out.println("You jumped up in hope at the response. \"Pilot 789, requesting medical and backup assistance! Urgent!\"");
            wait(3);
            System.out.println("Pilot 789, is that y-!.. Very well. Help is on the way. Keep the GPS on you.");
            System.out.println("The radio shut off.");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("Ash grimaced in pain, but he smiled. \"You'se done it.. N-now.. head on through that vent gate...\"");
            System.out.println("He points to a \"ventilation\" pathway. But you eye his wound, concerned.");
            System.out.println("- Press q to continue -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            wait(2);
            System.out.println("Raven shakes her head. \"Ash you're coming, come on!\"");
            System.out.println("Ash turned to face Raven as he sat against the wall, shaking his head as tears formed through his eyes.");
            System.out.println("- Press q to continue -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            wait(4);
            System.out.println("He continued to speak. \"Now you'se been a good girl, Raven, now do as yo' man says...\"");
            System.out.println("\"You'se gon make it to yo' father! Go on, scurry now!... I's put my faith in y'all\"");
            wait(3);
            System.out.println("Raven shook her head in denial. \"Ash, stop joking around! Come on!..\" A sob could be heard straining her voice.");
            wait2seconds();
            System.out.println("\"Y'all's.. y'all's the bravest two I've ever met...\"");
            System.out.println("Raven stuttered. \"C'mon Ash.. let's go! C'mon-\"");
            wait(6);
            System.out.println("He didn't respond. His eyes blankly stared into the underground shed's ceiling.");
            wait2seconds();
            System.out.println("His body went limp. His mouth hung open, his chest no longer heaving weary breaths.");
            waitADangSecond();
            System.out.println("Raven let out a few tears. In respect, she shut his eyes to let him rest.");
            System.out.println("- Press q to continue -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(" - ");
            System.out.println("You salute to Ash in respect, a tear running down your face as well.");
            wait(4);
            System.out.println(" - ");
            System.out.println("And so, you open the vent gate, leaving Ash behind as you and Raven crawled through the pathway.");
            System.out.println("The assassins were still right outside. Hurredly, you cover the entrance behind you, and lead way to safety.");
            cleared = true;
            System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        } // while code's bracket
        wait(4);
        System.out.println("PART 3 COMPLETED.");
        wait(2);
        System.out.println("YOU HAVE COMPLETED THE STORY.");
        System.out.println("Inventory and health stats are no longer required. Press \"q\" to initiate epilogue ending.");
        userInput = "";
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(" - ");
        System.out.println("SAVING GAME...");
        wait2seconds();
        System.out.println("File saved. Starting final ending...");
        wait(3);
        ConsoleUtility.clearScreen();
        //ending AHFEUIOEKJFHGUYIEWHADJKLSNLUW3IEAHFKJSCNUQLIEKWJHSVanyway
        System.out.println("For hours, the two of you crawl through the long, claustraphobic pathway.");
        wait(3);
        System.out.println("Raven suddenly stops. She breaks down in tears.");
        System.out.println("\"I just.. wanted to see my dad. Why...\" her voice hitched for a second.");
        System.out.println("\"Why did he have to die.. Why did we have to go through all of this..\"");
        wait2seconds();
        System.out.println("- Press q to comfort -");
        userInput = "";
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("You try to comfort her with words. \"Raven, I-\"");
        wait2seconds();
        System.out.println("\"THIS IS UNFAIR! THIS IS UNFAIR!!\" She kept smacking your broad shoulders in blinded rage, taking it all out with screams and wails.");
        System.out.println("But you know she wasn't mad at you. Just mad at everybody and everything that got you two here in the first place.");
        System.out.println("- Press q to comfort -");
        userInput = "";
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("You hug her, embracing her with your warmth as she sobbed.");
        System.out.println("Nobody but the walls heard her cries, as they echoed and heaved, her misery in vain.");
        wait(4);
        System.out.println("She held the plushie Ash had given her, before tucking it away again. She wiped her tears.");
        if (raven2.getFriendship() > 40) {
            System.out.println("She held your hand through the embrace. \"You're the best pilot friend anybody could ever have.\"");
            System.out.println("- Press q to continue -");
            userInput = "";
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("You said your name was David Maystonford, I believe.");
            wait(3);
            System.out.println("\"I owe you a lot, Mr. Maystonford.\"");
            System.out.println("You smile sweetly, wiping her tears. \"C'mon, let's go.\"");
        } else {
            System.out.println("Thank you, sir..");
            System.out.println("You nod assuringly. \"C'mon, let's go.\"");
        }
        System.out.println("- Press q to continue -");
        userInput = "";
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("You reach the other side, thinking you were a safe distance from them.");
        wait(2);
        System.out.println("However, you notice a rifle aimed at your head. The same was for Raven the moment you two crawled out.");
        System.out.println("They have gotten to you and Raven. There was nothing to do as you stared into the rim of their guns.");
        System.out.println("About 5 men or so, remaining from last night, surrounded you two");
        wait(4);
        System.out.println("\"WE GOT THEM, PREPARE FOR FIRE.\" The rest of them cocked their guns and pointed it at you two.");
        System.out.println("- Press q to accept death -");
        userInput = "";
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(" - ");
        System.out.println("\"FIRE IN 3\"...");
        wait2seconds();
        System.out.println("\"FIRE IN 2\"...");
        wait2seconds();
        System.out.println("\"FIRE IN 1\"...");
        wait(4);
        System.out.println("Suddenly, gunfire rained, but not over you two.");
        System.out.println("A recuse helicopter flew above! A rope was lowered as the remaining 5 men were shot to death from above.");
        System.out.println("- Press q to climb the rope with Raven -");
        userInput = "";
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("You climb the rope. You and Raven sit together in the helicopter as you flew into the distance");
    }
}