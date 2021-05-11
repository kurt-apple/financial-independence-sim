package sims.finance;

public class TradingAccount extends Account implements PassesTime {
  private double accountBalance;
  private InterestRate performance;
  private TaxableIncome taxable;

  public void deposit(double amt) { accountBalance += amt; }

  //withdraw amt or rest of account; whichever is smallest.
  public double withdraw(double amt) {
    accountBalance -= amt;
    return accountBalance >= 0 ? amt : accountBalance + amt;
  }

  private void nextMonth() {
    accountBalance *= performance.getMonthlyRate();
  }
}
