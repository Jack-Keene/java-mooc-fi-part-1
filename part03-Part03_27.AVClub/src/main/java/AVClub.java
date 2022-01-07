
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            String[] words = input.split(" ");
            if (input.equals("")) {
                break;
            }

            for (String word : words) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
