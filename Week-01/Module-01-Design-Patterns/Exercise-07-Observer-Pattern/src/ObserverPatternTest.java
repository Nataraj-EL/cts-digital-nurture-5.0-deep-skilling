public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Nataraj");

        Observer webUser = new WebApp("Sujith");

        stockMarket.registerObserver(mobileUser);

        stockMarket.registerObserver(webUser);

        stockMarket.setStockDetails("TCS", 3335);

        stockMarket.setStockDetails("Infosys", 1220);

        stockMarket.deregisterObserver(webUser);

        stockMarket.setStockDetails("Wipro", 245);

    }

}