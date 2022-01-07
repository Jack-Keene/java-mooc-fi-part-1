import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() > maxWeight) {
            return;
        } 

        items.add(item);
    }

    public int totalWeight() {
        int weight = 0;

        for (Item item : items) {
            weight += item.getWeight();
        }

        return weight;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for (Item item : items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0kg)";
        } 

        if (this.items.size() == 1) {
            return this.items.size() + " item (" + totalWeight() + " kg)";
        }

        return this.items.size() + " items (" + totalWeight() + " kg)";
    }
}
