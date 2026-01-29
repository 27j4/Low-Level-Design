package Practice;

// payment system

@FunctionalInterface
interface PaymentSystem {
    void pay(double amount);
}

class UPI implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using UPI " + amount);
    }
}

class Credit implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Credit Card " + amount);
    }
}

class Debit implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Debit Card " + amount);
    }
}

class PaymentFactory {

    public static PaymentSystem getInstance(String sys) {
        if (sys.equalsIgnoreCase("upi")) {
            return new UPI();
        } else if (sys.equalsIgnoreCase("credit")) {
            return new Credit();
        } else if (sys.equalsIgnoreCase("debit")) {
            return new Debit();
        } else {
            throw new IllegalArgumentException("Invalid Type");
        }
    }
}

public class SimpleFactory {
    public static void main(String[] args) {

        PaymentSystem paymentSystem = PaymentFactory.getInstance("debit");
        paymentSystem.pay(1000);
    }
}
