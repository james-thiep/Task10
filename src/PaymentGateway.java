public interface PaymentGateway {
    String processPayment(double amount);
    String refundPayment(double amount);
}
