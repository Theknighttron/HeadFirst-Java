public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();

        Wolf wolf = new Wolf();
        Cat cat = new Cat();

        list.add(wolf);
        list.add(cat);
    }
}
