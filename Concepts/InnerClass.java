// Demostration of nested classes

class Outer {
    int outter_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("display: outter_x= " + outter_x);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
