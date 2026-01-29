package structuralDesignPattern.decorator.chaiExample;

abstract class ChaiDecorator implements Chai{
    Chai chai;
    public ChaiDecorator(Chai chai) {
        this.chai = chai;
    }
}
