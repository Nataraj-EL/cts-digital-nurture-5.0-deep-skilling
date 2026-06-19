public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending Email notification...");
        System.out.println("Message: " + message);
    }
}