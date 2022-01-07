
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String[] row = file.nextLine().split(",");

                if (Integer.valueOf(row[1]) == 1) {
                    System.out.println(row[0] + ", age: " + row[1] + " year");
                    continue;
                }

                System.out.println(row[0] + ", age: " + row[1] + " years");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
