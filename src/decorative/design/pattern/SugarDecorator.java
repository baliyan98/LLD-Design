package decorative.design.pattern;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " with added sugar";
    }

    @Override
    public double getPrice() {
        return this.coffee.getPrice() + 0.7;
    }
}
