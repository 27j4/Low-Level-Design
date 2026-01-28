package behaviouralDesignPattern.template;

abstract class PaymentProcessor {
    // Template method
    public final void processPayment(double amount) {
        validatePaymentDetails();
        executePayment(amount);
        sendReceipt();
    }

    protected abstract void validatePaymentDetails(); // subclass will implement

    protected abstract void executePayment(double amount); // subclass will implement

    protected void sendReceipt() {
        System.out.println("Receipt sent to customer."); // default implementation
    }
}


class PayPalPaymentProcessor extends PaymentProcessor {
    @Override
    protected void validatePaymentDetails() {
        System.out.println("Validating PayPal account details.");
    }

    @Override
    protected void executePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class RazorpayPaymentProcessor extends PaymentProcessor {
    @Override
    protected void validatePaymentDetails() {
        System.out.println("Validating Razorpay payment details.");
    }

    @Override
    protected void executePayment(double amount) {
        System.out.println("Processing Razorpay payment of $" + amount);
    }

    @Override
    protected void sendReceipt() {
        System.out.println("Sending customized Razorpay receipt to customer.");
    }
}

public class PaymentProcessorExample {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalPaymentProcessor();
        paypalProcessor.processPayment(150.00);

        System.out.println();

        PaymentProcessor razorpayProcessor = new RazorpayPaymentProcessor();
        razorpayProcessor.processPayment(250.00);
    }
}
