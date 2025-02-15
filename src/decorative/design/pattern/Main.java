package decorative.design.pattern;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.getDescription() + " is of price " + coffee.getPrice());

        Coffee milkDecorator = new MilkDecorator(coffee);

        System.out.println(milkDecorator.getDescription() + " is of price " + milkDecorator.getPrice());

        Coffee sugarDecorator = new SugarDecorator(coffee);

        System.out.println(sugarDecorator.getDescription() + " is of price " + sugarDecorator.getPrice());
    }
}
