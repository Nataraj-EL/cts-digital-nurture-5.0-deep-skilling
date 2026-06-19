public class PaytmAdapter implements PaymentProcessor {

    private PaytmService paytmService;

    public PaytmAdapter(PaytmService paytmService) {
        this.paytmService = paytmService;
    }

    @Override
    public void processPayment(double amount) {
        paytmService.makePayment(amount);
    }
}