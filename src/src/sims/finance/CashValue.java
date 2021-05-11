package sims.finance;

public class CashValue {
    //a double that is restricted to two digits past the decimal point.
    protected Double value;
    private static final int digits = 2;

    private double format(double x) {
        return Utils.round(x, digits);
    }

    public CashValue() {
        this.value = 0.0;
    }

    public CashValue(double value) {
        this.value = value;
    }

    public void add(double x) {
        this.value = format(this.value + x);
    }

    public double subtract(double x) {
        this.value = format(this.value - x);
        return this.value > 0 ? x : this.value + x;
    }

    public void set(double x) {
        this.value = format(x);
    }
}
