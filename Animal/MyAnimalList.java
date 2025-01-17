public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int counter = 0;

    public void add(Animal a) {
        if (counter < animals.length) {
            animals[counter] = a;

            System.out.println("Animal added at: " + counter);
            counter++;
        }

    }
}
