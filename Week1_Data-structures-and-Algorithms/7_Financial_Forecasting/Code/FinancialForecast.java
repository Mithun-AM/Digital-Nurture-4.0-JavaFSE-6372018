public class FinancialForecast {

    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) return presentValue;
        return calculateFutureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double presentValue = 10000;
        double annualGrowthRate = 0.05;
        int years = 5;

        double futureValue = calculateFutureValue(presentValue, annualGrowthRate, years);
        System.out.printf("Future Value after %d years: Rs.%.2f\n", years, futureValue);
    }

}
