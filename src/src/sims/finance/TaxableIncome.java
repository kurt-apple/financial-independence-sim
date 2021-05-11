package sims.finance;

public class TaxableIncome {
    private int year;
    private double total_income;

    public void addIncome(double taxable) {
        total_income += taxable;
    }

    public double getTaxes() {

    }
}
