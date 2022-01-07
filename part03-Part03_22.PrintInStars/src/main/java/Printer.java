
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int a : array) {
            printStars(a);
        }
    }

    public static void printStars(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }        
        System.out.println("");
    }


}
