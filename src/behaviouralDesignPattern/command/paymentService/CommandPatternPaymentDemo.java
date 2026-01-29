package behaviouralDesignPattern.command.paymentService;

public class CommandPatternPaymentDemo {

    public static void main(String[] args) {

        CheckoutService checkout = new CheckoutService();

        PaymentCommand creditCardPayment =
                new CreditCardPaymentCommand(
                        new CreditCardPaymentService(), 1500);

        PaymentCommand upiPayment =
                new UpiPaymentCommand(
                        new UpiPaymentService(), 800);

        checkout.processPayment(creditCardPayment);
        checkout.processPayment(upiPayment);

        // Refund last payment
        checkout.refundLastPayment();
    }
}
