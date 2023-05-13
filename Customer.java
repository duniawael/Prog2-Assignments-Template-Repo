//donia wael
//20216205
package BankSystem;

public class Customer extends Human {
    private String SSN;
    private String address;
    private BankAccount bankAccount;

    public Customer(String name, int age, String gender, String SSN, String address) {
        super(name, age, gender);
        this.SSN = SSN;
        this.address = address;
        this.bankAccount = new BankAccount();
    }

    public void printData() {
        super.printData();
        System.out.println("SSN: " + SSN);
        System.out.println("Address: " + address);
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
