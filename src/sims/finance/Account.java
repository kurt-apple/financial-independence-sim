package sims.finance;

public class Account extends PassesTime {
  protected CashValue balance;
  protected InterestRate APY;
  protected TaxableIncome interestAccrued;

  @Override
  public void nextMonth() { 
    addTaxableIncome(balance.times(APY.getMonthlyRate()));
  }

  public Account(CashValue balance, InterestRate apy) {
    this.balance = balance;
    this.APY = apy;
  }

  public CashValue getBalance() { 
    return balance; 
  }

  public void setBalance(CashValue balance) { 
    this.balance = balance; 
  }

  public void deposit(CashValue deposit) throws InvalidInputException {
    if(deposit.lt(0)) throw new InvalidInputException();
    balance.add(deposit);
  }

  public CashValue withdraw(CashValue withdrawal) throws InvalidInputException {
    if(withdrawal.gte(0)) throw new InvalidInputException();
    balance.subtract(withdrawal);
    return balance.gte(0) ? withdrawal : balance.plus(withdrawal);
  }

  public void addTaxableIncome(CashValue income) {
    interestAccrued.add(income);
    balance.add(income);
  }
}
