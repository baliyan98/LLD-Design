package decorative.design.pattern;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
       return "Simple Coffee";
   }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
