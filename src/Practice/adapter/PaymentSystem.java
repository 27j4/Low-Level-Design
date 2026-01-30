package Practice.adapter;


// already existing payment system
// This is my adaptee
class UPIPayment {

    public String  payViaUPI(double amount) {
        return "Processing UPI payment of $" + amount;
    }
}


interface PaymentSystemInterface {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentSystemInterface {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class DebitCardPayment implements PaymentSystemInterface {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing debit card payment of $" + amount);
    }
}

// Adapter to integrate UPIPayment with PaymentSystemInterface
// this is the system we want to adapt
class UPIPaymentAdapter implements PaymentSystemInterface {

    private UPIPayment upiPayment;

    UPIPaymentAdapter(UPIPayment upiPayment) {
        this.upiPayment = upiPayment;
    }

    @Override
    public void processPayment(double amount) {
        String message = upiPayment.payViaUPI(amount);
        System.out.println(message);
    }
}


public class PaymentSystem {

    public static void main(String[] args) {
        PaymentSystemInterface creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(100.0);

        PaymentSystemInterface debitCardPayment = new DebitCardPayment();
        debitCardPayment.processPayment(200.0);

        PaymentSystemInterface upiAdapter = new UPIPaymentAdapter(new UPIPayment());
        upiAdapter.processPayment(150.0);
    }

}
