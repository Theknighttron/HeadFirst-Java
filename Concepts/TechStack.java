public class TechStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(10);
        Stack mystack2 = new Stack(10);

        // Push item to the stack
        for (int i = 0; i < 10; i++) {
            System.out.println("Pushing onto the stack1: " + i);
            mystack1.push(i);
        }

        for (int i = 10; i < 20; i++) {
            System.out.println("Pushing onto the stack2: " + i);
            mystack2.push(i);
        }

        // Pop items offf the stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
