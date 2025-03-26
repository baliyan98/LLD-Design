package parking.lot.lld;

public class Payment {
    PaymentMode paymentMode;
    double amount;

    public Payment(double amount , PaymentMode paymentMode){
        this.amount = amount;
        this.paymentMode = paymentMode;
    }

    public boolean processPayment(){
        System.out.println("Processing Payment via" + this.paymentMode + " with total amount" +  this.amount);
        return true;
    }
}
