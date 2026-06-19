public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor googlePay = new GooglePayAdapter(new GooglePayService());
        PaymentProcessor paytm = new PaytmAdapter(new PaytmService());
        PaymentProcessor phonePe = new PhonePeAdapter(new PhonePeService());

        System.out.println("---- Payment Processing Initiated !! ----\n");

        googlePay.processPayment(50000);

        System.out.println();

        paytm.processPayment(12200);

        System.out.println();

        phonePe.processPayment(75500);

        System.out.println("\n---- Payment Completed Succesfully ----");
    }
}