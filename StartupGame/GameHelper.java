import java.util.Scanner;

public class GameHelper {
        public String getUserInput(String prompt) {
            System.out.print(prompt + ": ");
            Scanner scanner = new Scanner(System.in);
            String output =  scanner.nextLine();
            return output;
        }
}
