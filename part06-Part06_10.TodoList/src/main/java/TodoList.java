import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i+1 + ": " + tasks.get(i));
        }
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void remove(int number) {
        tasks.remove(tasks.get(number - 1));
    }
}
