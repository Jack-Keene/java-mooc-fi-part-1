
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public boolean lessThan(Money compared) {

        if (this.euros > compared.euros) {
            return false;
        }

        if (this.euros < compared.euros) {
            return true;
        }

        if (this.cents > compared.cents) {
            return false;
        }

        if (this.cents < compared.cents) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {
        int euros = 0;
        int cents = 0;
        
        if (this.euros  >= decreaser.euros) {
            euros = this.euros  - decreaser.euros;
           
            if (this.cents > decreaser.cents) {
                cents = this.cents - decreaser.cents;
            } else if (euros > 1) {
                euros--;
                cents = 100 - decreaser.cents;
            }
        }

        return new Money(euros, cents);
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
