package structuralDesignPattern.adapter.loggerConvertor;

class OrderService {

    private AppLogger logger;

    public OrderService(AppLogger logger) {
        this.logger = logger;
    }

    public void placeOrder() {
        logger.info("Order placement started");

        try {
            int x = 10 / 0;
        } catch (Exception e) {
            logger.error("Order failed", e);
        }
    }
}
