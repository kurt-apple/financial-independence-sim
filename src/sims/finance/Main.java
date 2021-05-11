package sims.finance;

public class Main {

    public static void main(String[] args) {
	/*
	Initialize variables of the world
	Run loop until death or broke
	 */
        private double income;
        private double incomeARO;
        private double tradingdepositARO;
        private double tradingAPY;
        private double tradingbalance;
        FinancialSimulation sim = new FinancialSimulation()
                .setInflation(Constants.PESSIMISM.INFLATION)
                .setTaxrate(0.15);
        FinanceBot bot_template = new FinanceBot()
                .setIncome(income)
                .setIncomeARO(Constants.ARO.BIWEEKLY)
                .setTradingDepositARO(Constants.ARO.BIWEEKLY)
                .setTradingAPY(tradingAPY)
                .setTradingBalance(tradingbalance);
    }
}
