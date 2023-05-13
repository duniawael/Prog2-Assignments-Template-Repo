//donia wael
//20216205
package BankSystem;

public final class BankAccount {
    private double balance;

    public double getBalance() {
        return balance + (balance * 0.1);
    }

    public void setBalance(double balance) {
        if (balance >= 0 && balance <= 1_000_000) {
            this.balance += balance;
        } else {
            System.out.println("Invalid balance value. Balance not updated.");
        }
    }

    public void setBalance(double value, double taxPercent) {
        double taxAmount = value * (taxPercent / 100);
        this.balance += value - taxAmount;
    }
}
