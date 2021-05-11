package sims.finance;

public class TaxableIncomeSource implements PassesTime {
  private double income;
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
}
