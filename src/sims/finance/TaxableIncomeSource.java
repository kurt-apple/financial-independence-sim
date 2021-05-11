package sims.finance;

public class TaxableIncomeSource extends Taxable implements PassesTime {
  private CashValue income;
  private double ARO;
  private InterestRate annualRaise;

  public IncomeSource(double salary, double ARO, double annualRaise) {
    income = salary;
    this.ARO = ARO;
    annualRaise = new InterestRate(annualRaise);
  }

  public IncomeSource() {
    income = 0;
    ARO = 0;
    annualRaise = new annualRaise();
  }

  public TaxableIncomeSource(TaxableIncomeSource career) {
    this.income = career.income;
    this.ARO = career.ARO;
    this.annualRaise = new InterestRate(annualRaise);
  }

  public IncomeSource setIncome(double new_income) {
    this.income = new_income;
    return this;
  }

  public IncomeSource setARO(double new_aro) {
    this.ARO = new_aro;
    return this;
  }

  public IncomeSource setAnnualRaise(double new_annual) {
    this.annualRaise = new InterestRate().setAnnualRate(new_annual);
  }

  @Override
  public void nextMonth() {
    this.addTaxableIncome(income.dividedby(12));
  }

  public CashValue getTaxableIncome() {
    return 
  }
}
