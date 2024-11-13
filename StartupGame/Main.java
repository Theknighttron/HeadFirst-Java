import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        // Take user input
        GameHelper helper = new GameHelper();

        // Set location and check if it's a hit or miss
        Startup theStartup = new Startup();

        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> locations = new ArrayList<>();
        locations.add(String.valueOf(randomNum));
        locations.add(String.valueOf(randomNum + 1));
        locations.add(String.valueOf(randomNum + 2));

        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive) {
            String guess = helper.getUserInput("Enter a number ");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guessess");
            }
        }
    }
}
