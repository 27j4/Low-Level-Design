package behaviouralDesignPattern.command.paymentService;

import javax.swing.plaf.multi.MultiToolTipUI;

public class UpiPaymentCommand implements PaymentCommand{

    private UpiPaymentService upiPaymentService;
    private double amount;


    public UpiPaymentCommand(UpiPaymentService upiPaymentService, double amount) {
        this.upiPaymentService = upiPaymentService;
        this.amount = amount;
    }

    @Override
    public void execute() {
        upiPaymentService.pay(amount);
    }

    @Override
    public void undo() {
        upiPaymentService.refund(amount);
    }
}
