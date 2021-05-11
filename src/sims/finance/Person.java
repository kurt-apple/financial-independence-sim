package sims.finance;

public class Household {
  private FinancialSimulation sim;
  private TaxableIncomeSource career;
  private TradingIncomeSource trading;
  private BankAccount         bank;
  private boolean             married;

  public boolean isMarried() {
    return married;
  }

  public void setMarried(boolean married) {
    this.married = married;
  }

  public Household copy(Household template) {
    this.career   = new TaxableIncomeSource(template.career);
    this.trading  = new TradingAccount(template.trading);
    this.bank     = new BankAccount(template.bank);
    this.married  = template.married;
    return this;
  }

  public Household setSimulation(FinancialSimulation fs) { 
    this.sim = fs;
  }

  public CashValue getTaxableIncome() {
    return  career  .getTaxableIncome()
          + trading .getTaxableIncome()
          + bank    .getTaxableIncome();
  }

  public TaxRate getTaxRate() {
    return TaxRate.getTaxRate(this);
  }
}
