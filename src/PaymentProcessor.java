
class PaymentProcessor {
    private final PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }
    public String makePayment(double amount) {
        return gateway.processPayment(amount);
    }

    public String issueRefund(double amount) {
        return gateway.refundPayment(amount);
    }
}