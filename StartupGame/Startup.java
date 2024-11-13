import java.util.ArrayList;

class Startup {
    private ArrayList<String> locationCells;
    private int numOfHits;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        // check if the user guess is in arraylist
        int index = locationCells.indexOf(userInput);
            if (index >= 0) {
                locationCells.remove(index);    // remove the current cell if it's a hit
                if (locationCells.isEmpty()){   // if there is no cells left it's a kill
                    result = "kill";
                } else {
                result = "hit";
                }
            }
        return result;
        }
}


