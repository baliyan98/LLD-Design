package creational.design.pattern.factory.design.pattern;

public class Main {
    public static void main(String[] args){
        Payment creditCardPay = PaymentFactory.proceedPayment("creditCard");
        Payment payPalPay = PaymentFactory.proceedPayment("payPal");
        creditCardPay.pay();
        payPalPay.pay();
    }
}
