package structuralDesignPattern.decorator.pizzaExample;

public class ToppingsDecorator extends PizzaDecorator{

    public ToppingsDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return decoratedPizza.getDescription() + " with Toppings";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 5.0;
    }
}
