package sims.finance;

public class FinancialSimulation {
  private Time          time;
  private InterestRate  inflation;
  private Person        person;

  public FinancialSimulation() {
    time      = new Time();
    inflation = new InterestRate(Constants.PESSIMISM.INFLATION);
    taxrate   = new InterestRate(Constants.PESSIMISM.TAXRATE);
    person    = new Person();
  }
  
  public FinancialSimulation setInflation(double i) {
    inflation = i;
    return this;
  }

  public void setPerson(Person p) {
    this.person = p;
  }
}
