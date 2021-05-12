package sims.finance;

public class Account implements PassesTime {
  //TODO: is there a better way to do this
  FinancialSimulation fs;
  protected CashValue startbalance;
  //TODO: need a way to tell if this is a new year.
  protected CashValue taxableincome;
  protected InterestRate APY;
  protected TaxableIncome interestAccrued;

  @Override
  public void nextMonth() {
    //TODO: implement this
    addTaxableIncome(getMonthlyInterest());
    if()
  }

  //TODO: return CashValue from CashValue.times()
  public CashValue getMonthlyInterest() {
    return getBalance().times(APY.getMonthlyRate());
  }

  public Account(CashValue balance, InterestRate apy) {
    this.balance = balance;
    this.APY = apy;
  }

  public CashValue getBalance() { 
    return startbalance.plus(taxableincome); 
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
