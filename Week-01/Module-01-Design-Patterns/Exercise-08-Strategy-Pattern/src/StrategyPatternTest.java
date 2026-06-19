public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(
                new CreditCardPayment("Nataraj EL")
        );

        paymentContext.makePayment(250000);

        System.out.println();

        paymentContext.setPaymentStrategy(
                new UPIPayment("nataraj@okcub")
        );

        paymentContext.makePayment(755000);

    }

}