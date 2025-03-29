package structuralDesignPattern.adapterPattern;

public class Adapter implements PaymentProcess {
    private LegacyPaymentProcessor processor;

    public Adapter(LegacyPaymentProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void pay() {
        this.processor.payment();
    }
}
