import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            if (input.equals("add")) {
                add();
                continue;
            }

            if (input.equals("list")) {
                list();
                continue;
            }

            if (input.equals("remove")) {
                remove();
                continue;
            }
        }
    }

    public void add() {
        System.out.println("To add:");
        String input = scanner.nextLine();

        this.todoList.add(input);
    }

    public void list() {
        todoList.print();
    }

    public void remove() {
        System.out.println("Which one is removed?");
        int remove = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(remove);
    }
}
