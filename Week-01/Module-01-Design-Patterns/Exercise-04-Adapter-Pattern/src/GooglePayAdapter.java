public class GooglePayAdapter implements PaymentProcessor {

    private GooglePayService googlePayService;

    public GooglePayAdapter(GooglePayService googlePayService) {
        this.googlePayService = googlePayService;
    }

    @Override
    public void processPayment(double amount) {
        googlePayService.sendMoney(amount);
    }
}