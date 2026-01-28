import structuralDesignPattern.adapter.paymentExample.PaymentProcessor;
import structuralDesignPattern.adapter.paymentExample.PaypalPaymentAdapter;
import structuralDesignPattern.adapter.paymentExample.PaypalPaymentGateway;

void main(){
    PaymentProcessor paymentProcessor = new PaypalPaymentAdapter(new PaypalPaymentGateway());
    paymentProcessor.processPayment(150.00);
}