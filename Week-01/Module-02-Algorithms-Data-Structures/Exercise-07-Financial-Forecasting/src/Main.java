public class Main {

    public static void main(String[] args) {

        FinancialForecast forecast = new FinancialForecast();

        double currentValue = 1000;  
        double growthRate = 0.10;     
        int years = 5;

        double result = forecast.calculateFutureValue(currentValue, growthRate, years);

        System.out.println("Future Value after " + years + " years: " + String.format("%.2f", result));    }
}