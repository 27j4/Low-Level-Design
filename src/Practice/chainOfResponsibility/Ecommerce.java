package Practice.chainOfResponsibility;

// Request Object
class Order {
    boolean inStock;
    boolean paymentSuccessful;
    boolean fraudFree;

    Order(boolean inStock, boolean paymentSuccessful, boolean fraudFree) {
        this.inStock = inStock;
        this.paymentSuccessful = paymentSuccessful;
        this.fraudFree = fraudFree;
    }
}

// Abstract Handler
abstract class ProductHandler {
    protected ProductHandler next;

    public void setNext(ProductHandler next) {
        this.next = next;
    }

    abstract void processOrder(Order order);
}

// Concrete Handler 1
class InventoryHandler extends ProductHandler {

    @Override
    void processOrder(Order order) {
        if (order.inStock) {
            System.out.println("Inventory check passed");
            if (next != null) next.processOrder(order);
        } else {
            System.out.println("Order cancelled: Item out of stock");
        }
    }
}

// Concrete Handler 2
class PaymentHandler extends ProductHandler {

    @Override
    void processOrder(Order order) {
        if (order.paymentSuccessful) {
            System.out.println("Payment verified");
            if (next != null) next.processOrder(order);
        } else {
            System.out.println("Order cancelled: Payment failed");
        }
    }
}

// Concrete Handler 3
class FraudHandler extends ProductHandler {

    @Override
    void processOrder(Order order) {
        if (order.fraudFree) {
            System.out.println("Fraud check passed");
            if (next != null) next.processOrder(order);
        } else {
            System.out.println("Order cancelled: Fraud detected");
        }
    }
}

// Concrete Handler 4
class PackagingHandler extends ProductHandler {

    @Override
    void processOrder(Order order) {
        System.out.println("Order packaged and shipped successfully 🎉");
    }
}

// Client
public class Ecommerce {

    public static void main(String[] args) {

        // Create handlers
        ProductHandler inventory = new InventoryHandler();
        ProductHandler payment = new PaymentHandler();
        ProductHandler fraud = new FraudHandler();
        ProductHandler packaging = new PackagingHandler();

        // Build the chain
        inventory.setNext(payment);
        payment.setNext(fraud);
        fraud.setNext(packaging);

        // Create request
        Order order = new Order(
                true,   // in stock
                true,   // payment successful
                true    // fraud free
        );

        // Start processing
        inventory.processOrder(order);
    }
}
