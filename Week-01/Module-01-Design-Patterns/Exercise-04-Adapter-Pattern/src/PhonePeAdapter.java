public class PhonePeAdapter implements PaymentProcessor {

    private final PhonePeService phonePeService;

    public PhonePeAdapter(PhonePeService phonePeService) {
        this.phonePeService = phonePeService;
    }

    @Override
    public void processPayment(double amount) {
        phonePeService.transfer(amount);
    }
}
