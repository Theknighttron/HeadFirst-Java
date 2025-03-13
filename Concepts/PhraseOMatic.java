public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "extensible", "reactive", " agent based", "Strongly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event-driven", "pub-sub", "IoT", "cloud", "containerized"};
        String[] wordListThree = {"framework", "library", "DSL", "pipeline", "service mesh", "architecture", "design", "orientation"};


    // find the length in each word length
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    // generate three random numbers
    java.util.Random randomGenerator = new java.util.Random();

    int randNo1 = randomGenerator.nextInt(oneLength);
    int randNo2 = randomGenerator.nextInt(twoLength);
    int randNo3 = randomGenerator.nextInt(threeLength);


    // build a phrase
    String phrase = wordListOne[randNo1] + " " + wordListTwo[randNo2] + " " + wordListThree[randNo3];

    System.out.println(phrase);

    }
}
