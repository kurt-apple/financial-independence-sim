package sims.finance;

import java.util.Arrays;
import java.util.LinkedList;

public class TaxRate {
    class TaxBracket {
        InterestRate    rate;
        CashValue       startOfBracket;
        CashValue       endOfBracket;

        TaxBracket(double rate, double start, double end) {
            this.rate = new InterestRate(rate);
            startOfBracket = new CashValue(start);
            endOfBracket = new CashValue(end);
        }
    }
    final LinkedList<TaxBracket> joint_brackets = new LinkedList<>(Arrays.asList(
            new TaxBracket(0.10, 0, 19900.99),
            new TaxBracket(0.12, 19901, 81050.99),
            new TaxBracket(0.22, 81051, 172750.99),
            new TaxBracket(0.24, 172751, 329850.99),
            new TaxBracket(0.32, 329851, 418850.99),
            new TaxBracket(0.35, 418851, 628300.99),
            new TaxBracket(0.37, 628300, 1000000000)
    ));

    final LinkedList<TaxBracket> single_brackets = new LinkedList<>(Arrays.asList(
            new TaxBracket(0.10, 0, 9950.99),
            new TaxBracket(0.12, 9951, 40525.99),
            new TaxBracket(0.22, 40526, 86375.99),
            new TaxBracket(0.24, 86376, 164925.99),
            new TaxBracket(0.32, 164926, 209425.99),
            new TaxBracket(0.35, 209426, 523599.99),
            new TaxBracket(0.37, 523600, 1000000000)
    ));

    public InterestRate getTaxRate(Person p) {
        CashValue taxable = p.getTaxableIncome();
        if(p.isMarried) {
            for(TaxBracket b : joint_brackets) {
                if (b.endOfBracket < taxable) continue;
                else if(b.startOfBracket < taxable) {
                    return b.rate;
                }
            }
        };
    }
}
