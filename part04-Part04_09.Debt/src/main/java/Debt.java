public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double inititalInterestRate) {
        this.balance = initialBalance;
        this.interestRate = inititalInterestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance *= this.interestRate;
    }
    
}
