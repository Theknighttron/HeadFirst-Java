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
}
