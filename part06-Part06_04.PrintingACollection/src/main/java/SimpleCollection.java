
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } 

        String printOutput = "The collection " + this.name + " has " + this.elements.size() + " element";

        if (this.elements.size() > 1) {
            printOutput += "s:";
        } else {
            printOutput += ":";
        }

        String elementsString = "";

        for (String element : elements) {
            elementsString += "\n" + element;
        }

        return printOutput + elementsString;
    
    }
    
}
