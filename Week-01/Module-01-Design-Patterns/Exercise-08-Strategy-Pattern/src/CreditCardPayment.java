public class CreditCardPayment implements PaymentStrategy {

    private final String cardHolderName;

    public CreditCardPayment(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {

        System.out.println(
                "Paid ₹" + amount
                        + " using Credit Card."
        );

        System.out.println(
                "Card Holder : " + cardHolderName
        );

    }

}