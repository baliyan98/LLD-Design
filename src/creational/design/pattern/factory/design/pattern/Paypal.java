package creational.design.pattern.factory.design.pattern;

public class Paypal implements Payment{

    @Override
    public void pay(){
        System.out.println("Paying via Pay pal account");
    }
}
