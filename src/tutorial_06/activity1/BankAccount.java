package tutorial_06.activity1;

public class BankAccount {
    double balance;
    int transactions;
    String holderName;
    double interestRate;

    public BankAccount(String holderName, double initial, double interestRate) {
        this.balance = initial;
        this.transactions = 1;
        this.holderName = holderName;
        this.interestRate = interestRate;
    }

    public void annualInterest() {
        double interestAmount = this.interestRate * this.balance;
        this.balance += interestAmount;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        this.transactions++;
    }

    public void monthlyFee() {
        this.withdraw(10);
    }

    @Override
    public String toString() {
        if (balance >= 0)
            return String.format(this.holderName + ", " + "$%f", this.balance);
        else
            return String.format(this.holderName + ", " + "-$f", Math.abs(this.balance));
    }

    public void transfer(BankAccount recipientAccount, double amount) {
        double totalCost = amount + 0.5; //transfer fee
        if (balance >= totalCost) {
            this.withdraw(totalCost);
            recipientAccount.deposit(amount);
        }
        else
            System.out.println("Your balance is not enough for this transaction!");
    }

}
