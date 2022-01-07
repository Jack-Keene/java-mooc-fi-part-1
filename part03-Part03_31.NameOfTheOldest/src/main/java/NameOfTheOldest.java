
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        String oldest_name = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] info = input.split(",");
            if (Integer.valueOf(info[1]) > oldest) {
                oldest_name = info[0];
                oldest = Integer.valueOf(info[1]);
            }
        }
        System.out.println("Name of the oldest: " + oldest_name);
    }
}
