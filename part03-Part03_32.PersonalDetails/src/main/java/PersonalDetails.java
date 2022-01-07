
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestNameLen = -1;
        String longestName = "";
        int count = 0;
        int sum = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            count++;
            sum += Integer.valueOf(parts[1]);

            if (parts[0].length() > longestNameLen) {
                longestName = parts[0];
                longestNameLen = parts[0].length();
            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sum / count);
    }
}
