package behaviouralDesignPattern.command.paymentService;

public class CreditCardPaymentService {

    public void pay(double amount){
        System.out.println("Payment of " + amount + " using credit card");
    }

    public void refund(double amount){
        System.out.println("Refund of " + amount + " to credit card");
    }

}
