package sims.finance;

public class Main {
  public static void main(String[] args) {
    /*
    Initialize variables of the world
    Run loop until death or broke
     */
    System.out.println("Financial Independence Sim");
    FinancialSimulation sim = new FinancialSimulation();
    System.out.print("Menu\n1. Sweep\n2. Custom\n> ");
    Scanner scan = new Scanner(System.in);
  }
}
