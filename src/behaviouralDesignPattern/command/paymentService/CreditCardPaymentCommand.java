package behaviouralDesignPattern.command.paymentService;

public class CreditCardPaymentCommand implements PaymentCommand{

    private CreditCardPaymentService creditCardPaymentService;
    private double amount;

    public CreditCardPaymentCommand(CreditCardPaymentService creditCardPaymentService, double amount) {
        this.creditCardPaymentService = creditCardPaymentService;
        this.amount = amount;
    }

    @Override
    public void execute() {
        creditCardPaymentService.pay(amount);
    }

    @Override
    public void undo() {
        creditCardPaymentService.refund(amount);
    }
}
