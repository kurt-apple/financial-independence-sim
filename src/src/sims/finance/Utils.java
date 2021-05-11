package sims.finance;

public class Utils {
    public static double round(double x, int digits) {
        double places = Math.pow(10, digits);
        return Math.round(x*places)/places;
    }
    public static double pow4(double x, double y) {
        return round(Math.pow(x, y), 4);
    }
}
