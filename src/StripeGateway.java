
class StripeGateway implements PaymentGateway {
    private final String apiKey;

    public StripeGateway(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String processPayment(double amount) {
        return "Processing UGX" + amount + " via Stripe (Key: " + apiKey + ")";
    }

    @Override
    public String refundPayment(double amount) {
        return "Refunding UGX" + amount + " via Stripe";
    }
}