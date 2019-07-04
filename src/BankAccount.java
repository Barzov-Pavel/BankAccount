public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("12345", 00.00, "Default name", "email@email.def", "(017) 515 12 18");
        System.out.println("Default constructor");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor with parameters");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("12345", 00.00, customerName, email, phoneNumber);
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("New balance is " + balance);
    }

    public void withdraw(double withdrasAmount) {
        if (withdrasAmount > balance) {
            System.out.println("Not enough money! Only " + balance + " dollars available!");
        } else {
            balance -= withdrasAmount;
            System.out.println("New balance is " + balance);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
