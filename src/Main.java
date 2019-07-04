public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setBalance(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(10);
        bankAccount.withdraw(100);

        VipCustomer vipCustomer = new VipCustomer("Tim", 200, "Mail@mail");

        System.out.println(vipCustomer.getCreditLimit() + " credit limit " + vipCustomer.getEmail() + " email " + vipCustomer.getName() + " name.");

        VipCustomer Don = new VipCustomer();
        System.out.println(Don.getCreditLimit() + " credit limit " + Don.getEmail() + " email " + Don.getName() + " name.");
    }
}
