class Main {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        // Take user input
        GameHelper helper = new GameHelper();

        // Set location and check if it's a hit or miss
        SimpleStartup theStartup = new SimpleStartup();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive) {
            int guess  = helper.getUserInput("Enter a number: ");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guessess");
            }
        }

    }
}
