package sims.finance;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /*
    Initialize variables of the world
    Run loop until death or broke
     */
    System.out.println("Financial Independence Sim");
    FinancialSimulation sim = new FinancialSimulation();
    //TODO: figure out what menu options make sense
    System.out.print("Menu\n1. Sweep\n2. Custom\n> ");
    Scanner scan = new Scanner(System.in);
    //TODO: gather user variables in CLI
    sim.runSim(new Scanner(System.in).nextInt());
  }
}
