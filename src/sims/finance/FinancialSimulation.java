package sims.finance;

public class FinancialSimulation implements PassesTime {
  protected static Time time;
  private InterestRate  inflation;
  private Household     household;

  public FinancialSimulation() {
    time      = new Time();
    inflation = new InterestRate(Constants.PESSIMISM.INFLATION);
    household = new Household()
      .setSimulation(this);
  }
  
  public FinancialSimulation setInflation(InterestRate i) {
    inflation = i;
    return this;
  }

  public void setHousehold(Household p) {
    this.household = p;
  }

  @Override
  public void nextMonth() {
    time.nextMonth();
    household.nextMonth();
  }

  //TODO:
  public void runSim(int nextInt) {

  }
}
