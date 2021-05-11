package sims.finance;

public class InterestRate {
  private Double annualRate;

  public InterestRate(double rate) {
    annualRate = rate;
  }

  public InterestRate(InterestRate annualRaise) {
    this.annualRate = annualRaise.annualRate;
  }

  public void setAnnualRate(double rate) {
    annualRate = rate;
  }

  public double getAnnualRate() {
    return annualRate;
  }

  public double getMonthlyRate() {
    return Utils.pow4(1+annualRate, 1.0/12);
  }
}
