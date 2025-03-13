// Old Ways / Legacy Code
/*
public class Varargs {
    static void vaTest(int v[]) {
        System.out.print("Number of args: " + v.length + " Contents: ");

        for (int x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number1[] = { 10 };
        int number2[] = { 1, 2, 3 };
        int number3[] = {};

        vaTest(number1);
        vaTest(number2);
        vaTest(number3);
    }
}
*/

// New way to pass multiple Args 
public class Varargs {
    static void vaTest(int... v) {
        System.out.print("Number of args: " + v.length + " Contents: ");

        for (int x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
