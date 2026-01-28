import structuralDesignPattern.decorator.*;

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