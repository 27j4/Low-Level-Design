package behaviouralDesignPattern.Observer.stockMarket;

public interface StockObserver {
    void update(String stockSymbol, double stockPrice);
}
