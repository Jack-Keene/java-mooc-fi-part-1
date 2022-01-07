import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void add() {
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String translation = scanner.nextLine();
        dictionary.add(word, translation);
    }

    public void search() {
        System.out.println("To be translated: ");
        String translate = scanner.nextLine();

        if (dictionary.translate(translate)==null) {
            System.out.println("Word " + translate + " was not found");
            return;
        }

        System.out.println(dictionary.translate(translate));
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
    
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("add")) {
                add();
                continue;
            }

            if (input.equals("search")) {
                search();
                continue;
            }

            System.out.println("Unknown command");
        }
    }
}
