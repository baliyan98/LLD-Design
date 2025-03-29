package structuralDesignPattern.adapterPattern;

public class Main {
    public static void main(String[] args) {
        PaymentProcess process = new Adapter(new LegacyPaymentProcessor());
        process.pay();
    }
}
