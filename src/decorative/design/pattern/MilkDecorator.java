package decorative.design.pattern;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return this.coffee.getDescription() + " with added milk";
    }

    @Override
    public double getPrice(){
        return this.coffee.getPrice() + 1.2;
    }
}
