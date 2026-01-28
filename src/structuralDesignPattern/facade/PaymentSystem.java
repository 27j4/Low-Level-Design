package structuralDesignPattern.facade;

class UserService {
    boolean isUserValid(int userId) {
        System.out.println("UserService: Validating user... with id " + userId);
        return true;
    }
}

class PaymentService {
    void processPayment(double amount) {
        System.out.println("PaymentService: Processing payment... of amount $ " + amount);
    }
}

class NotificationService {
    void sendConfirmation(int userId, double amount) {
        System.out.println("NotificationService: Sending payment confirmation... to user with userId " + userId  +  " for amount $ " + amount);
    }
}

class PaymentFacade {

    private final UserService userService;
    private final PaymentService paymentService;
    private final NotificationService notificationService;

    public PaymentFacade() {
        this.userService = new UserService();
        this.paymentService = new PaymentService();
        this.notificationService = new NotificationService();
    }

    public void makePayment(int userId, double amount) {
        System.out.println("----- Initiating Payment Process -----");
        if(userService.isUserValid(userId)){
            paymentService.processPayment(amount);
            notificationService.sendConfirmation(userId, amount);
            System.out.println("----- Payment Process Completed -----");
        } else {
            System.out.println("PaymentFacade: User validation failed. Payment aborted.");
        }
    }
}

public class PaymentSystem {
    public static void main(String args[]) {
        PaymentFacade paymentFacade = new PaymentFacade();
        paymentFacade.makePayment(123, 250.75);
    }
}
