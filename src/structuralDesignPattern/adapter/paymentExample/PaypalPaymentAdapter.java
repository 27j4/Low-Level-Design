package structuralDesignPattern.adapter.paymentExample;

public class PaypalPaymentAdapter implements PaymentProcessor{

    private final PaypalPaymentGateway paypalPaymentGateway;

    public PaypalPaymentAdapter(PaypalPaymentGateway paypalPaymentGateway) {
        this.paypalPaymentGateway = paypalPaymentGateway;
    }
    @Override
    public void processPayment(double amount) {
        paypalPaymentGateway.makePayment(amount);
    }
}


/*

UML Diagram :

Client → PaymentProcessor
              ↑
         PayPalAdapter
              ↑
        PayPalGateway


Steps :

Identify incompatible interfaces
(Client expects X, existing class provides Y)

Define the target interface
(What your client code will use)

Identify the adaptee
(Existing / third-party / legacy class)

Create the adapter class

Implements target interface

Holds adaptee object

Translate method calls
(Convert target methods → adaptee methods)

Use adapter in client code
(Client talks only to target interface)

 */
