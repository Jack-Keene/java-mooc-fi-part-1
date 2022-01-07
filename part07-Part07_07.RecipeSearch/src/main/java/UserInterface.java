import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }

    public void start() {
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        createRecipes(fileName);
        commands();

        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                list();
            }

            if (command.equals("find name")) {
                find();
            }

            if (command.equals("find cooking time")) {
                findCookingTime();
            }

            if (command.equals("find ingredient")) {
                findIngredient();
            }
        }
    }  

    public void commands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes"); 
        System.out.println("stop - stops the program"); 
    }

    public void createRecipes(String fileName) {
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String name = file.nextLine();
                int cookingTime = Integer.valueOf(file.nextLine());
    
                Recipe recipe = new Recipe(name, cookingTime);

                while (file.hasNextLine()) {
                    String ingredient = file.nextLine();
                    if (!(ingredient.equals(""))) {
                        recipe.addIngredient(ingredient);
                        continue;
                    }
                    break;
                }
    
                this.recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("File does not exist");
        }

    }

    public void list() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void find() {
        System.out.println("Searched word:");
        String search = scanner.nextLine();

        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(search)) {
                System.out.println(recipe);
            }
        }
    }

    public void findCookingTime() {
        System.out.println("Max cooking time");
        int search = Integer.valueOf(scanner.nextLine());

        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= search) {
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient() {
        System.out.println("Ingredient");
        String ingredient = scanner.nextLine();

        for (Recipe recipe : recipes) {
            for (String ing : recipe.getIngredients()) {
                if (ing.equals(ingredient)) {
                    System.out.println(recipe);
                }
            }

        }
    }
}
