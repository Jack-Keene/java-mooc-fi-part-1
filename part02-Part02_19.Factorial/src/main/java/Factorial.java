
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.next());
        int i = 1;
        int result = 1;

        while (i<=number) {
            result *= i;
            i++;
        }

        System.out.println("Factorial: " + result);

    }
}
