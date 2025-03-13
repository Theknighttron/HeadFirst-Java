public class Stack {
    private int stck[];
    private int top_stck;

    // Allocate and initalize stack
    Stack(int size) {
        stck = new int[size];
        top_stck = -1; // setting the stack to empty
    }

    // Add an item onto the stack
    void push(int item) {
        if (top_stck == stck.length - 1) { // Determine the stack length
            System.out.println("Stack Overflow");
        } else {
            stck[++top_stck] = item;
        }
    }

    // Remove an item from the stack
    int pop() {
        if (top_stck < 0) {
            System.out.println("Stack underflow");

            return 0;
        } else {
            return stck[top_stck--];
        }
    }
}
