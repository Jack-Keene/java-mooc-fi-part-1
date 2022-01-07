
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {

        int first = 0;
        int second = 0;
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] splitInput = input.split(" ");

            if (splitInput[0].equals("add")) {
                if (first + Integer.valueOf(splitInput[1]) > 100) {
                    first = 100;
                    continue;
                }
                if (Integer.valueOf(splitInput[1]) < 0) {
                    continue;
                }
                first += Integer.valueOf(splitInput[1]);        
                continue;
            }
            
            if (splitInput[0].equals("move")) {
                if (first > Integer.valueOf(splitInput[1])) {
                    second += Integer.valueOf(splitInput[1]);
                    first -= Integer.valueOf(splitInput[1]);
                } else {
                    second += first;
                    first -= first;
                }
                
                if (second > 100) {
                    second = 100;
                }
                if (second < 0) {
                    second = 0;
                }
                if (first > 100) {
                    first = 100;
                }
                if (first < 0) {
                    first = 0;
                }

                continue; 
            }

            if (splitInput[0].equals("remove")) {
                if (second - Integer.valueOf(splitInput[1]) < 0) {
                    second = 0;
                    continue;
                }
                if (Integer.valueOf(splitInput[1]) < 0) {
                    continue;
                }
                second -= Integer.valueOf(splitInput[1]);
                continue;
            }
        }
    }
}
