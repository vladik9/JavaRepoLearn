package OopPackage.Opp1;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(0, 0.0, "no name", "email@em.com", "0000000000");
        System.out.println("Default constructor!");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Custom constructor!");
        System.out.println("User account with name: " + this.getCustomerName() + " was created!");
        System.out.println("Initial amount is: " + this.getBalance() + "$");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(1, 0.0, customerName, email, phoneNumber);
        System.out.println("Delegating a another constructor.");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean depositFounds(double amount) {
        this.balance += amount;
        return true;
    }

    public boolean withdrawFounds(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
