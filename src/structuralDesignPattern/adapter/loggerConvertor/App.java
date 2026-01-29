package structuralDesignPattern.adapter.loggerConvertor;

public class App {
    public static void main(String[] args) {

        AppLogger logger =
                new Log4jAdapter(new Log4jLogger());

        OrderService service = new OrderService(logger);
        service.placeOrder();
    }
}
