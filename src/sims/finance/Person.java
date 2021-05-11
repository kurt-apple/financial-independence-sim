package sims.finance;

public class Person {
    private TaxableIncomeSource career;
    private TradingAccount      trading;
    private BankAccount         bank;
    private boolean             married;

    public boolean isMarried() {
      return married;
    }

    public void setMarried(boolean married) {
      this.married = married;
    }

    public Person copy(Person template) {
      this.career   = new TaxableIncomeSource(template.career);
      this.trading  = new TradingAccount(template.trading);
      this.bank     = new BankAccount(template.bank);
      this.married  = template.married;
      return this;
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
