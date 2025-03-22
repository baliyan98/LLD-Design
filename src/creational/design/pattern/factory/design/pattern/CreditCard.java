package creational.design.pattern.factory.design.pattern;

public class CreditCard implements Payment {

    @Override
    public void pay(){
        System.out.println("Paying via Credit card");
    }
}
