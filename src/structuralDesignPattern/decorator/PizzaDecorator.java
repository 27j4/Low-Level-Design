package structuralDesignPattern.decorator;

abstract public class PizzaDecorator implements Pizza{
    Pizza decoratedPizza;
    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }
}
