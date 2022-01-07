public class Container {
    private int value;

    public Container() {
        this.value = 0;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        if (this.value + amount > 100) {
            this.value = 100;
            return;
        }
        this.value += amount;
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        if (this.value - amount < 0) {
            this.value = 0;
            return;
        }
        this.value -= amount;
    }

    public Container move(Container container, int value) {
        if (container.value >= value) {
            add(value);
            container.remove(value);
        } else {
            add(container.value);
            container.remove(container.value);
        }
        return container;
    }

    public String toString() {
        return this.value + "/100";
    }
    
}
