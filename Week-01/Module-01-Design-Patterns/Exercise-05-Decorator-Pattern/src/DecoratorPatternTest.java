public class DecoratorPatternTest {

    public static void main(String[] args) {

        String message = "Your order has been shipped..";

        System.out.println("----- Email Notification !! -----");

        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send(message);
        System.out.println();

        System.out.println("----- Email + SMS Notification !! -----");

        Notifier smsNotifier =
            new SMSNotifierDecorator(
            new EmailNotifier());
        smsNotifier.send(message);

        System.out.println();

        System.out.println("----- Email + SMS + Slack Notification !! -----");

        Notifier allChannelsNotifier =
                new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                new EmailNotifier()));
                
        allChannelsNotifier.send(message);

    }

}