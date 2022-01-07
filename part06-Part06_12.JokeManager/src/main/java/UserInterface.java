import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            commands();
            String input = scanner.nextLine();

            if (input.equals("X")) {
                break;
            }

            if (input.equals("1")) {
                add();
            }

            if (input.equals("2")) {
                draw();
            }

            if (input.equals("3")) {
                list();
            }
        }
    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String input = scanner.nextLine();
        jokeManager.addJoke(input);
    }

    public void draw() {
        System.out.println(jokeManager.drawJoke());
    }

    public void list() {
        jokeManager.printJokes();
    }

    public void commands() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
}
