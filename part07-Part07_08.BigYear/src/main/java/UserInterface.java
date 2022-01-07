import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void start() {

        while (true) {
            System.out.println("?");
            String input = scanner.nextLine();

            if (input.equals("Quit")) {
                break;
            }

            if (input.equals("Add")) {
                add();
                continue;
            }

            if (input.equals("Observation")) {
                observation();
                continue;
            }

            if (input.equals("All")) {
                all();
                continue;
            }

            if (input.equals("One")) {
                one();
                continue;
            }
            System.out.println("No such command");
        }
    }

    private void observation() {
        System.out.println("Bird?");
        String name = scanner.nextLine();
        
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.add();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    private void add() {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        
        System.out.println("Name in Latin: ");
        String latinName = scanner.nextLine();

        Bird bird = new Bird(name, latinName);

        this.birds.add(bird);
    }

    private void all() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    private void one() {
        Random random = new Random();
        
        if (birds.size() > 0) {
            int rand = random.nextInt(this.birds.size());
            System.out.println("size = " + this.birds.size());
            System.out.println("rand = " + rand);
            System.out.println(this.birds.get(rand));
        }
    }
    
}
