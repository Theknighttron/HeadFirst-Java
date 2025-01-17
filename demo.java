import java.util.ArrayList;

public class demo {
    private final Dog[] dog = new Dog[5];
    private int counter = 0;

    public void add(final Dog d) {
        if (counter < dog.length) {
            dog[counter] = d;
            System.out.println("Dog added at " + counter);
            counter++;
        }
    }

}
