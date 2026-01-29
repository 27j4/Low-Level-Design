package structuralDesignPattern.decorator.chaiExample;

public class SimpleChai implements Chai{

    @Override
    public String getDescription() {
        return "This is a simple coffee";
    }

    @Override
    public double amount() {
        return 10d;
    }
}
