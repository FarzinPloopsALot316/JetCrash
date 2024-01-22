public class LoseScreens {
    public static String died () {
        return ConsoleUtility.RED + "You died, and lost the gun you may have had in your inventory.\nInteract to return to last checkpoint." + ConsoleUtility.PURPLE;
    }

    public static String RavenDied () {
        return ConsoleUtility.RED + "Mission failed: Raven has been killed. Great going, pilot.\nInteract to return to last checkpoint." + ConsoleUtility.PURPLE;
    }
}
