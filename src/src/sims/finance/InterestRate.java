package sims.finance;

public class InterestRate {
  private double annualRate;

  public InterestRate(double rate) {
    annualRate = rate;
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
