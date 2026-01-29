package structuralDesignPattern.decorator.chaiExample;

public class GingerDecorator extends ChaiDecorator{

    public GingerDecorator(Chai chai) {
        super(chai);
    }

    @Override
    public String getDescription() {
        return chai.getDescription() + " with Ginger";
    }

    @Override
    public double amount() {
        return chai.amount() + 10;
    }
}
