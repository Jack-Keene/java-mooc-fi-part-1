
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        int count =0;
        for (int number : numbers) {
            count++;
            sum += number;
        }

        System.out.println("Average: " + (double) sum / count);
        
    }
}
