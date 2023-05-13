//donia wael
//20216205
package BankSystem;

public class Human {
    protected String name;
    protected int age;
    protected String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public final void greet() {
        System.out.println("Good Morning");
    }
}
