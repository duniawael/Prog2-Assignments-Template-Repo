//donia wael
//20216205
package BankSystem;

public class Employee extends Human {
    private double salary;
    private String department;

    public Employee(String name, int age, String gender, double salary, String department) {
        super(name, age, gender);
        this.salary = salary;
        this.department = department;
    }

    @Override
    protected void printData() {
        super.printData();
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
