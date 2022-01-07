
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNegativeNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number >= 0) {
                continue;
            }

            numberOfNegativeNumbers++;
        }

        System.out.println("Number of negative numbers: " + numberOfNegativeNumbers);

    }
}
