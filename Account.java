public class Account {
    int accountNo;
    String accountType;
    int accountBalance;

    public void setAccountDetails(int accountNo, String accountType, int accountBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void withdraw(int amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Available balance: " + accountBalance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(int amount) {
        accountBalance += amount;
        System.out.println("Deposit successful. Available balance: " + accountBalance);
    }

    public void dispAccountDetails() {
        System.out.println("Account number: " + accountNo);
        System.out.println("Account type: " + accountType);
        System.out.println("Account balance: " + accountBalance);
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setAccountDetails(1001, "Savings", 5000);
        account1.dispAccountDetails();
        account1.withdraw(1000);
        account1.dispAccountDetails();
        account1.deposit(2000);
        account1.dispAccountDetails();

        Account account2 = new Account();
        account2.setAccountDetails(1002, "Checking", 10000);
        account2.dispAccountDetails();
        account2.deposit(-500);
        account2.withdraw(15000);
        account2.withdraw(5000);
        account2.dispAccountDetails();
    }
}