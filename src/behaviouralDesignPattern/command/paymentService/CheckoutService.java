package behaviouralDesignPattern.command.paymentService;


import java.util.Stack;

class CheckoutService {

    private Stack<PaymentCommand> commandHistory = new Stack<>();

    public void processPayment(PaymentCommand command) {
        command.execute();
        commandHistory.push(command);
    }

    public void refundLastPayment() {
        if (!commandHistory.isEmpty()) {
            commandHistory.pop().undo();
        }
    }
}
