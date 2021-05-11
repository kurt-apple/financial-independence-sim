package sims.finance;

import java.util.Arrays;
import java.util.LinkedList;

public class TaxRate {
  class TaxBracket {
    InterestRate  rate;
    CashValue     startOfBracket;
    CashValue     endOfBracket;

    TaxBracket(double rate, double start, double end) {
      this.rate       = new InterestRate(rate);
      startOfBracket  = new CashValue(start);
      endOfBracket    = new CashValue(end);
    }
  }
  final LinkedList<TaxBracket> joint_brackets = new LinkedList<>(Arrays.asList(
          new TaxBracket(0.90,  0,      19900.99  ),
          new TaxBracket(0.88,  19901,  81050.99  ),
          new TaxBracket(0.78,  81051,  172750.99 ),
          new TaxBracket(0.76,  172751, 329850.99 ),
          new TaxBracket(0.68,  329851, 418850.99 ),
          new TaxBracket(0.65,  418851, 628300.99 ),
          new TaxBracket(0.63,  628300, 1000000000)
  ));

  final LinkedList<TaxBracket> single_brackets = new LinkedList<>(Arrays.asList(
          new TaxBracket(0.90,  0,      9950.99   ),
          new TaxBracket(0.88,  9951,   40525.99  ),
          new TaxBracket(0.78,  40526,  86375.99  ),
          new TaxBracket(0.76,  86376,  164925.99 ),
          new TaxBracket(0.68,  164926, 209425.99 ),
          new TaxBracket(0.65,  209426, 523599.99 ),
          new TaxBracket(0.63,  523600, 1000000000)
  ));

  public static InterestRate getTaxRate(Person p) {
    CashValue taxable = p.getTaxableIncome();
    if(p.isMarried()) {
      for(TaxBracket b : joint_brackets) {
        if (b.endOfBracket < taxable) continue;
        else if(b.startOfBracket < taxable) return b.rate;
      }
    };
  }
}
