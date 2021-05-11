package sims.finance;

public class Account implements PassesTime {
    protected double balance;
    protected InterestRate APY;

    @Override
    public void nextMonth() {
        balance *= APY.getMonthlyRate();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
