package sims.finance;

public interface Constants {
    interface ARO {
        double DAILY        = 365.0;
        double WEEKLY       = DAILY/7;
        double BIWEEKLY     = WEEKLY/2;
        double MONTHLY      = 12.0;
        double QUARTERLY    = 4.0;
    }
    interface PESSIMISM {
        double INFLATION    = 0.031;
        double TRADINGAPY   = 0.07;
        double RAISE        = 0.011;
    }
}
