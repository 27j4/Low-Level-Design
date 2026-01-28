package behaviouralDesignPattern.Observer;


// registerObserver
// removeObserver
// notifyObserver

public interface StockMarket {
    void registerObserver(StockObserver stockObserver);
    void removeObserver(StockObserver stockObserver);
    void notifyObserver(String stockSymbol, double stockPrice);
}
