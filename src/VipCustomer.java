public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Defaul name", 100.00, "Default@mail.mail");
    }

    public VipCustomer(String name, String email) {
        this(name, 100.00, email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
