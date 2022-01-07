import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeRegister grades;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.grades = new GradeRegister();
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            grades.add(input);
        }

        double averageAll = grades.average();
        double averagePass = grades.average(50);
        double passPercent = grades.passing(50);

        System.out.println("Point average (all): " + averageAll);
        
        if (!(Double.isNaN(averagePass))) {
            System.out.println("Point average (passing): " + averagePass);
        } else {
            System.out.println("Point average (passing): -");
        }

        System.out.println("Pass percentage: " + passPercent);
        grades.printGrade();
    }



}
