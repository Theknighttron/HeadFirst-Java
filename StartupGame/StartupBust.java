import java.util.ArrayList;


public class StartupBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses = 0;


    private void setUpGame() {
        // Create new startups
        Startup one = new Startup();
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");

        // Add startup to the arraylist
        startups.add(one);
        startups.add(two);
        startups.add(three);

        // Welcome message
        System.out.println("Your goal is to sink three Startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        // Place each startup on random locations
        for(Startup startup: startups) {
            ArrayList<String> newLocations = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }


    private void startPlaying() {
        while (!startups.isEmpty()) {       // as long as the startups is not empty
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (Startup starupToTest : startups) {
            result = startupToTest.checkYourSelf(userGuess);

            if (result.equals("hit")) {
                break;
            }

            if (result.equals("kill")) {
                startups.remove(startupToTest);
                break;
            }
        }


        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All startups are dead! Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }
}
