
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // System.out.println("Where to?");
        // int where = Integer.valueOf(scanner.next());
        // int i =1;

        // while(i <= where) {
        //     System.out.println(i);
        //     i++;
        // }

        System.out.println("Where to?");
        int where = Integer.valueOf(scanner.next());
        System.out.println("Where from?");
        int from = Integer.valueOf(scanner.next());

        int i = from;
        while(i <= where) {
            System.out.println(i);
            i++;
        }
    }
}
