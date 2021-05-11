package sims.finance;

public class BankAccount extends CashValue implements PassesTime {
    private InterestRate APY;
    @Override
    public void nextMonth() {
        balance*=APY.getMonthlyRate();
    }
}
