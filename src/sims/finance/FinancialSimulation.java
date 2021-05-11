package sims.finance;

public class FinancialSimulation {
    private Calendar cal;
    private double inflation;
    private double taxrate;
    public FinancialSimulation() {
        inflation = 0;
        taxrate = 0;
    }
    public FinancialSimulation setInflation(double i) {
        inflation = i;
        return this;
    }
    public FinancialSimulation setTaxrate(double t) {
        taxrate = t;
        return this;
    }
}
