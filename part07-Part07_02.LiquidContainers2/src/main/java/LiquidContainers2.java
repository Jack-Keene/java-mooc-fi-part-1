
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);


            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputStrings = input.split(" ");
            
            if (inputStrings[0].equals("add")) {
                first.add(Integer.valueOf(inputStrings[1]));
                continue;
            }

            if (inputStrings[0].equals("move")) {
                first = second.move(first, Integer.valueOf(inputStrings[1]));
                continue;
            }

            if (inputStrings[0].equals("remove")) {
                second.remove(Integer.valueOf(inputStrings[1]));
                continue;
            }
        }
    }

}
