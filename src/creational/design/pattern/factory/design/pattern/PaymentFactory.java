package creational.design.pattern.factory.design.pattern;

public class PaymentFactory {
    public static Payment proceedPayment(String type){
        return switch (type) {
            case "creditCard" -> new CreditCard();
            case "payPal" -> new Paypal();
            default -> null;
        };
    }
}
