
class PayPalGateway implements PaymentGateway {
    private final String clientId;
    private final String secret;

    public PayPalGateway(String clientId, String secret) {
        this.clientId = clientId;
        this.secret = secret;
    }

    @Override
    public String processPayment(double amount) {
        return "Processing USD" + amount + " via PayPal (ClientID: " + clientId + ")";
    }

    @Override
    public String refundPayment(double amount) {
        return "Refunding USD" + amount + " via PayPal";
    }
}