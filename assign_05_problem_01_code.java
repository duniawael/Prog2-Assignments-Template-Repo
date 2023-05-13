//donia wael
//20216205
package BankSystem;

public class Main {
    public static void main(String[] args) {
        // Create objects
        Employee employee = new Employee("John Doe", 30, "Male", 5000, "Finance");
        Customer customer = new Customer("Jane Smith", 25, "Female", "123456789", "123 Main St");
        BankAccount bankAccount = new BankAccount();

        // Call functions
        employee.printData();
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Department: " + employee.getDepartment());
        employee.greet();
        System.out.println();

        customer.printData();
        System.out.println("Bank Account Balance: " + customer.getBankAccount().getBalance());
        customer.greet();
        System.out.println();

        // Set bank account balance
       
