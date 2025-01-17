public class MyDogList {
    private Dog[] dog = new Dog[5];
    private int counter = 0;

    public void add(Dog d) {
        if (counter < dog.length) {
            dog[counter] = d;
            System.out.println("Dog added at " + counter);
            counter++;
        }
    }
}
