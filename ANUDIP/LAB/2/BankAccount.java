
class Bank1 {
    protected double balance;

    public Bank1(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}


class SavingsAccount extends Bank1 {
    private static final double WITHDRAWAL_LIMIT = 1000.00;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && amount <= WITHDRAWAL_LIMIT) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " from Savings Account");
        } else {
            System.out.println("Withdrawal amount exceeds the limit or insufficient funds.");
        }
    }
}


class CheckingAccount extends Bank1{
    private static final double WITHDRAWAL_FEE = 2.50;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (amount + WITHDRAWAL_FEE) <= balance) {
            balance -= (amount + WITHDRAWAL_FEE);
            System.out.println("Withdrew: $" + amount + " from Checking Account with a fee of $" + WITHDRAWAL_FEE);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000.00);
        CheckingAccount checking = new CheckingAccount(1500.00);

        // Testing deposit
        savings.deposit(500.00);
        checking.deposit(300.00);

        // Testing withdraw with SavingsAccount
        savings.withdraw(500.00);
        savings.withdraw(1500.00);

        // Testing withdraw with CheckingAccount
        checking.withdraw(100.00);
        checking.withdraw(2000.00);

        // Printing final balances
        System.out.println("Savings Account Balance: $" + savings.getBalance());
        System.out.println("Checking Account Balance: $" + checking.getBalance());
    }
}
