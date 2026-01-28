package structuralDesignPattern.decorator;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " with Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 3.0;
    }
}
