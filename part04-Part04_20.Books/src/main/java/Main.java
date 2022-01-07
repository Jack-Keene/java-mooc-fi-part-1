import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            String year = scanner.nextLine();

            books.add(new Book(name, year, pages));
        }

        System.out.println("What information will be printed?");
        String info = scanner.nextLine();

        for (Book book : books) {
            if (info.equals("name")) {
                System.out.println(book.getName());
            } else {
                System.out.println(book.getName() + ", " + book.getPages() + " pages, " + book.getYear());
            }
        }



    }
}
