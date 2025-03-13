// Learn About Access Modifier
class Test {
    int a;
    public int b;
    private int c;

    // Define setter and getter methods for private modifier
    // setter
    void setC(int i) {
        c = i;
    }

    // getter
    int getC() {
        return c;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Test test = new Test();

        test.a = 10;
        test.b = 15;
        test.setC(20);

        System.out.println("A: " + test.a);
        System.out.println("B: " + test.b);
        System.out.println("C: " + test.getC());
    }
}
