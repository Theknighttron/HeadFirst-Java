import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameHelper {

    private static final String ALPHABET = "abcdefg";
    private static final int GRID_LENGTH = 7;
    private static final int GRID_SIZE = 49;
    private static final int MAX_ATTEMPTS = 200;
    static final int HORIZONTAL_INCREMENT = 1;
    static final int VERTICAL_INCREMENT = GRID_LENGTH;

    private final int[] grid =  new int[GRID_SIZE];
    private final Random random = new Random();
    private int startupCount = 0;


    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        String output =  scanner.nextLine().toLowerCase();
        return output;
    }


    public ArrayList<String> placeStartup(int startupSize)  {
        // hold index to grid (0 - 48)
        int[] startupCoords = new int[startupSize];
        int attempts = 0;
        boolean success = false;

        startupCount++;
        int increment = getIncrement();

        while (!success & attempts++ < MAX_ATTEMPTS) {   // main search loop
            int location = random.nextInt(GRID_SIZE);   // get a random starting location

            for (int i = 0; i < startupCoords.length; i++) {    // create array of proposed coords
                startupCoords[i] = location;                    // put current location in array
                location += increment;                          // calculate the next location
            }

            if (startupFits(startupCoords, increment)) {
                success = coordsAvailable(startupCoords);
            }
        }

        savePositionToGrid(startupCoords);
        ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords);
        System.out.println("Placed at: "+ alphaCells);
        return alphaCells;
    }


    private boolean startupFits(int[] startupCoords, int increment) {
        int finalLocation = startupCoords[startupCoords.length -1];
        if (increment == HORIZONTAL_INCREMENT) {
            return calcRowFromIndex(startupCoords[0]) == calcRowFromIndex(finalLocation);
        } else {
            return finalLocation < GRID_SIZE;
        }
    }


    private boolean coordsAvailable(int[] startupCoords) {
        for (int coord : startupCoords) {       // check for all potential position
            if(grid[coord] != 0){               // this position already taken
                // System.out.println("position: " + coord + " already taken.");
                return false;
            }
        }
        return true;
    }


    private void savePositionToGrid(int[] startupCoords) {
        for (int index: startupCoords) {
            grid[index] = 1;        // mark grid position as used
        }
    }


    private ArrayList<String> convertCoordsToAlphaFormat(int[] startupCoords) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        for (int index: startupCoords) {
            String alphaCoords = getAlphaCoordsFromIndex(index);
            alphaCells.add(alphaCoords);
        }
        return alphaCells;
    }


    private String getAlphaCoordsFromIndex(int index) {
        int row = calcRowFromIndex(index);      // get row values
        int column = index % GRID_LENGTH;       // get column numeric values

        String letter = ALPHABET.substring(column, column + 1);     // convert to letter
        return letter + row;
    }


    private int calcRowFromIndex(int index) {
        return index / GRID_LENGTH;
    }


    private int getIncrement() {
        if (startupCount % 2 == 0) {
            return HORIZONTAL_INCREMENT;
        } else {
            return VERTICAL_INCREMENT;
        }
    }

}
