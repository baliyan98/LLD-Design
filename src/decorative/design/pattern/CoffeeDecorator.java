package decorative.design.pattern;

abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription();
    }

    @Override
    public double getPrice() {
        return this.coffee.getPrice();
    }
}
