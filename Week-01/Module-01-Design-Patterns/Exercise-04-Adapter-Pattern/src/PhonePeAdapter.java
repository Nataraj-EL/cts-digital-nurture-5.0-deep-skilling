public class PhonePeAdapter implements PaymentProcessor {

    private PhonePeService phonePeService;

    public PhonePeAdapter(PhonePeService phonePeService) {
        this.phonePeService = phonePeService;
    }

    @Override
    public void processPayment(double amount) {
        phonePeService.transfer(amount);
    }
}