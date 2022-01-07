
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface UserInterface = new UserInterface(manager, scanner);

        // UserInterface interface = new UserInterface(manager, scanner);
        UserInterface.start();

    }
}
