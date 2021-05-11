package sims.finance;

public class TradingAccount extends Account {
  public TradingAccount() {
    super();
  }

  private TaxableIncome taxable;

  public void nextMonth() {
    double month_profit = balance * super.APY.getMonthlyRate();
    super.balance += month_profit;
    taxable.addIncome(month_profit);
  }

  public void deposit(double amt) { accountBalance += amt; }

  //withdraw amt or rest of account; whichever is smallest.
  public double withdraw(double amt) {
    accountBalance -= amt;
    return accountBalance >= 0 ? amt : accountBalance + amt;
  }
}
