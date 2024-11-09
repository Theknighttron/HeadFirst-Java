class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "miss";

        // Check if the user guess if a hit
        for (int cell: locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        // if hit = 3 it's a kill
        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        // print the result
        System.out.println(result);
        return result;
    }
}
