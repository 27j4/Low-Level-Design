package structuralDesignPattern.decorator.chaiExample;

public class SpecialDecorator extends ChaiDecorator{

    public SpecialDecorator(Chai chai) {
        super(chai);
    }

    @Override
    public String getDescription() {
        return chai.getDescription() + " with special powder";
    }

    @Override
    public double amount() {
        return chai.amount() + 5;
    }
}
