import structuralDesignPattern.decorator.pizzaExample.CheeseDecorator;
import structuralDesignPattern.decorator.pizzaExample.Pizza;
import structuralDesignPattern.decorator.pizzaExample.PlainPizza;
import structuralDesignPattern.decorator.pizzaExample.ToppingsDecorator;

void main(){

    Pizza myPizza = new PlainPizza();
    System.out.println("Description: " + myPizza.getDescription());
    System.out.println("Cost: $" + myPizza.getCost());

    myPizza = new CheeseDecorator(myPizza);
    System.out.println("Description: " + myPizza.getDescription());
    System.out.println("Cost: $" + myPizza.getCost());

    myPizza = new ToppingsDecorator(myPizza);
    System.out.println("Description: " + myPizza.getDescription());
    System.out.println("Cost: $" + myPizza.getCost());

}