package behaviouralDesignPattern.Observer.stockMarket;

import java.util.ArrayList;
import java.util.List;

public class StockMarketImpl implements StockMarket{
    private List<StockObserver> stockObserverList = new ArrayList<>();

    @Override
    public void registerObserver(StockObserver stockObserver) {
        stockObserverList.add(stockObserver);
    }

    @Override
    public void removeObserver(StockObserver stockObserver) {
        stockObserverList.remove(stockObserver);
    }

    @Override
    public void notifyObserver(String stockSymbol, double stockPrice) {
        for(StockObserver stockObserver : stockObserverList){
            stockObserver.update(stockSymbol, stockPrice);
        }
    }

    // Simulate stock price changes
    public void setStockPrice(String stockSymbol, double stockPrice) {
        notifyObserver(stockSymbol, stockPrice);
    }
}
