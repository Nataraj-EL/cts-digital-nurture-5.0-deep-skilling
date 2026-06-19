import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {

    private final List<Observer> observers;
    private String stockName;
    private double stockPrice;

    public StockMarket() {

        observers = new ArrayList<>();

    }

    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);
        System.out.println(observer.getClass().getSimpleName()
                + " subscribed to stock updates.");

    }

    @Override
    public void deregisterObserver(Observer observer) {

        observers.remove(observer);
        System.out.println(observer.getClass().getSimpleName()
                + " unsubscribed from stock updates.");

    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(stockName, stockPrice);

        }

    }

    public void setStockDetails(String stockName, double stockPrice) {

        this.stockName = stockName;
        this.stockPrice = stockPrice;

        System.out.println("\nStock Updated");
        System.out.println("Stock : " + stockName);
        System.out.println("Price : ₹" + stockPrice);

        notifyObservers();

    }

}