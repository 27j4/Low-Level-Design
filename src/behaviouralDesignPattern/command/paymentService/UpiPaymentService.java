package behaviouralDesignPattern.command.paymentService;

public class UpiPaymentService {
    public void pay(double amount){
        System.out.println("Payment of " + amount + " using Upi");
    }

    public void refund(double amount){
        System.out.println("Refund of " + amount + " to Upi wallet");
    }
}
