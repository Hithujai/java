 class Customer {
    private int custId;
    private String custName;
    private String custAddress;

    public Customer(int custId, String custName, String custAddress) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    public void display() {
        System.out.println("Customer ID: " + this.custId);
        System.out.println("Customer Name: " + this.custName);
        System.out.println("Customer Address: " + this.custAddress);
    }
}

class AccountTest {
    private int acctId;
    private String acctType;
    private Customer customer;
    private double acctBalance;

    public AccountTest(int acctId, String acctType, Customer customer, double acctBalance) {
        this.acctId = acctId;
        this.acctType = acctType;
        this.customer = customer;
        this.acctBalance = acctBalance;
    }

    public void display() {
        System.out.println("Account ID: " + this.acctId);
        System.out.println("Account Type: " + this.acctType);
        System.out.println("Account Balance: " + this.acctBalance);
        System.out.println("Customer Details:");
        customer.display();
    }


    public static void main(String[] args) {
        Customer customer = new Customer(1, "Kiran", "123 Main Street");
        AccountTest account = new AccountTest(1001, "Savings", customer, 5000.0);
        account.display();
    }
}





