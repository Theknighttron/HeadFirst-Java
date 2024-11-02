class Dog {
    String name;
    public static void main(String[] args) {
// make a dog object and access it
    Dog dog1 = new Dog();
    dog1.bark();
    dog1.name = "Bart";
// now make a dog array
    Dog[] myDogs = new Dog[3];

    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;
// now access the dogs using the array
    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";

// print the last dog's name
    System.out.print("Last dog's name is: ");
    System.out.println(myDogs[2].name);

// loop through the array
    int x = 0;
    while ( x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

// bark method
    public void bark() {
        System.out.println(name + " says Huff Huff!");
    }

// eat method
    public void eat() {

    }

// chaseCat method
    public void chaseCat() {

    }
}

