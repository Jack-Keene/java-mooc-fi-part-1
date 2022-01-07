import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Grade> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void add(int grade) {
        if (grade < 0) {
            return;
        }

        if (grade > 100) {
            return;
        }
        grades.add(new Grade(grade));
    }

    public int sum() {
        return sum(0);
    }

    public int sum(int boundary) {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i).getScore() >= boundary) {
                sum += grades.get(i).getScore();
            }
        }
        return sum;
    }

    public int count() {
        return grades.size();
    }

    public int count(int boundary) {
        int count = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i).getScore() >= boundary) {
                count++;
            }
        }
        return count;
    }

    public double average() {
        return (double) sum() / count();
    }

    public double average(int boundary) {
        return (double) sum(boundary) / count(boundary);
    }

    public double passing(int boundary) {
        return 100.0 * count(boundary) / count();
    }

    public void printGrade() {
        System.out.println("Grade distribution:");
        for (int i=5; i > -1; i--) {
            System.out.print(i + ":");
            for (int j = 0; j < grades.size(); j++) {
                if (grades.get(j).getGrade() == i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        
        }
    }    
}
