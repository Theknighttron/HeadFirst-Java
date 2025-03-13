public class BasicMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        BasicMath math = new BasicMath();

        System.out.println(math.add(5, 5));
        System.out.println(math.sub(5, 5));
        System.out.println(math.div(5, 5));
        System.out.println(math.mult(5, 5));
    }

}
