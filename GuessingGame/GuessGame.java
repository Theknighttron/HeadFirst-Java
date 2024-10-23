public class GuessGame {
    // Instance variable for three players objects
    Player p1;
    Player p2;
    Player p3;

    // Object for each player
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

    // Player guesses
    int guessOne = 0;
    int guessTwo = 0;
    int guessThree = 0;


    boolean p1Ans = false;
    boolean p2Ans = false;
    boolean p3Ans = false;

    // Generate random number
    int targetNumber = (int) (Math.random() * 10);
    System.out.println(" I'm thinking of a number between 0 and 9...");

    while(true) {
            System.out.println("Number to guess is " + targetNumber);

            // Call each player to guess
            p1.guess();
            p2.guess();
            p3.guess();

            guessOne = p1.number;
            System.out.println("Player one guessed " + guessOne);


            guessTwo = p2.number;
            System.out.println("Player two guessed " + guessTwo);

            guessThree = p3.number;
            System.out.println("Player three guessed " + guessThree);


            // Match the guessed number to the targer number
            if (guessOne == targetNumber) {
                p1Ans = true;
            }
            if (guessTwo == targetNumber) {
                p2Ans = true;
            }
            if (guessThree == targetNumber) {
                p3Ans = true;
            }


            // Game over if one of the player got it right
            if (p1Ans || p2Ans | p3Ans) {
                System.out.println(" We have a winner!");
                System.out.println("Player one got it right? " + p1Ans);
                System.out.println("Player two got it right? " + p2Ans);
                System.out.println("Player three got it right? " + p3Ans);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }

    }
}
