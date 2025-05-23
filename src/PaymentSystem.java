public class PaymentSystem {
    public static void main(String[] args) {

        PaymentGateway stripe = new StripeGateway("sk_test_12345");
        PaymentGateway paypal = new PayPalGateway("client_789", "secret_xyz");


        PaymentProcessor stripeProcessor = new PaymentProcessor(stripe);
        System.out.println(stripeProcessor.makePayment(9900));
        System.out.println(stripeProcessor.issueRefund(25000));


        PaymentProcessor paypalProcessor = new PaymentProcessor(paypal);
        System.out.println(paypalProcessor.makePayment(1400));
        System.out.println(paypalProcessor.issueRefund(500));


        System.out.println("\nDynamic Switching Demo:");
        PaymentProcessor processor = new PaymentProcessor(Math.random() > 0.5 ? stripe : paypal);
        System.out.println(processor.makePayment(1000));
    }
}