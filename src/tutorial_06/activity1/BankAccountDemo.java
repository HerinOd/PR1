package tutorial_06.activity1;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Hieu", 1000, 0.05);
        BankAccount account2 = new BankAccount("Hieu2", 500, 0.02);

        account1.annualInterest();
        System.out.println(account1);
        account1.withdraw(50);

        account1.transfer(account2, 250);

        System.out.println("Account 1: " + account1);
        System.out.println("Account 2: " + account2);

        account1.transfer(account2, 7000);
    }
}
