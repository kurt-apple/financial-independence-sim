package sims.finance;

public class FinanceBot {
    private double annual_income;
    private double annual_roi;
    private double balance;
    private double savings_aro;
    private double savings_rate;

    public double getAnnual_roi() {
        return annual_roi;
    }

    public FinanceBot setAnnual_roi(double annual_roi) {
        this.annual_roi = annual_roi;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public FinanceBot setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public double getAnnual_income() {
        return annual_income;
    }

    public FinanceBot setAnnual_income(double annual_income) {
        this.annual_income = annual_income;
        return this;
    }

    public double getSavings_aro() {
        return savings_aro;
    }

    public FinanceBot setSavings_aro(double savings_aro) {
        this.savings_aro = savings_aro;
        return this;
    }

    public double getSavings_rate() {
        return savings_rate;
    }

    public FinanceBot setSavings_rate(double savings_rate) {
        this.savings_rate = savings_rate;
        return this;
    }

    public FinanceBot setIncome(double income) {
        annual_income = income;
        return this;
    }

    public double getIncome() {
        return annual_income;
    }

    public FinanceBot copy(FinanceBot template) {
        this.savings_aro    = template.getSavings_aro();
        this.annual_income  = template.getAnnual_income();
        this.annual_roi     = template.getAnnual_roi();
        this.savings_rate   = template.getSavings_rate();
        this.balance        = template.getBalance();
        return this;
    }
}
