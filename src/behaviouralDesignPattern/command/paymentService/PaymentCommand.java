package behaviouralDesignPattern.command.paymentService;

public interface PaymentCommand {
    void execute();
    void undo();
}


