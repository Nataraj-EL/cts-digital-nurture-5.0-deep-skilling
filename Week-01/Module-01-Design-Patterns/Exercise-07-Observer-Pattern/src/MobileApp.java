public class MobileApp implements Observer {

    private final String userName;

    public MobileApp(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String stockName, double stockPrice) {

        System.out.println(
                "Mobile App - "
                        + userName
                        + " received update: "
                        + stockName
                        + " is now ₹"
                        + stockPrice
        );

    }

}