public class Demo {
    public static void main(String[] args) {

        ///// ARRAYS

        // Variable to hold a desired type
        int month_days[];

        // Allocate memory to hold the array
        month_days = new int[5];

        // int month_days[] = new int[5];
        int list_of_days_in_month[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        // int days[] = new int[7];

        // int years[] = new int[12];

        System.out.println("month_days: " + month_days);
        System.out.println("list_of_days_in_month: " + list_of_days_in_month);

        ///// SWITCH STATEMENT

        // Using switch statement
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is : " + i);
                    break;
                case 1:
                    System.out.println("i is : " + i);
                    break;
                case 2:
                    System.out.println("i is : " + i);
                    break;
                case 3:
                    System.out.println("i is : " + i);
                    break;
                default:
                    System.out.println("i is greater than three");
            }
        }

        // While Loop Syntax

        /*
         * while (condition) {
         * // body of loop
         * }
         */

        // Tick the numbers from 10 to 1

        int n = 10;

        while (n > 0) {
            System.out.println("tick" + n);
            n--;
        }

        // Find the midpoint value

        int valueI = 100;
        int valueJ = 200;

        while (++valueI < --valueJ)
            ;
        System.out.println("Midpoint is " + valueI);

        // Do While Syntax

        /*
         * do {
         * // body of the loop
         * } while (condition);
         */

        int num = 10;

        do {
            System.out.println("tick " + num);
            num--;
        } while (num > 0);

        // Display menu atleast once

        /*
         * throws java.io.IOException {
         * int age;
         * 
         * do {
         * System.out.println("Please Enter your age: ");
         * age = System.in.read();
         * } while (age < 18); // reprompt until user has entered valid age
         * }
         */

        // FOR EACH | ENHANCED FOR loop

        /*
         * for (type var : iterable) {
         * 
         * }
         */

        /*
         * int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
         * int sum = 0;
         * 
         * for (int x : nums) {
         * sum += x;
         * }
         */

        // Method Overloading is when more than one method share the same same
        // but different numbers of parameter

        // equalTo() method is used to compare two objects for equality and return
        // results

        // Defining a string
        // String mystring = "This is a string too";

        // Predefined String Methods
        /*
         * boolean equals(secondStr) -> Check for equality
         * int length() -> Get the length of the string
         * char charAt(index) -> Get the character at a specific index
         */

        // Inheritance
        /*
         * class subclass extends superclass {
         * // body of the class
         * }
         */
    }
}
