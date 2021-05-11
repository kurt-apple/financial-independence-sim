package sims.finance;

public class CashValue {
    //a double that is restricted to two digits past the decimal point.
    protected Double value;
    private static final int digits = 2;

    public double get() {
        return format(value);
    }

    private double format(double x) {
        return Utils.round(x, digits);
    }

    public CashValue() {
        this.value = 0.0;
    }

    public CashValue(double value) {
        this.value = value;
    }

    public boolean gt(CashValue a, CashValue b) {
        return a.get() > b.get();
    }

    public boolean lt(CashValue a, CashValue b) {
        return a.get() < b.get();
    }

    public boolean gte(CashValue a, CashValue b) {
        return a.get() >= b.get();
    }

    public boolean lte(CashValue a, CashValue b) {
        return a.get() <= b.get();
    }

    public boolean eq(CashValue a, CashValue b) {
        return a.get() == b.get();
    }

    public void add(double x) {
        this.value = format(this.value + x);
    }

    public double subtract(double x) {
        this.value = format(this.value - x);
        return this.value > 0 ? x : this.value + x;
    }

    public double times(double x) {
        return this.value * x;
    }

    public void applyAPM(InterestRate rate) {
        this.value = format(this.value * (1+rate.getMonthlyRate()));
    }

    public void set(double x) {
        this.value = format(x);
    }
}
