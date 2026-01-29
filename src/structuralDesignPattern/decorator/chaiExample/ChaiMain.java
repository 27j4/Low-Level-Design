import structuralDesignPattern.decorator.chaiExample.Chai;
import structuralDesignPattern.decorator.chaiExample.GingerDecorator;
import structuralDesignPattern.decorator.chaiExample.SimpleChai;
import structuralDesignPattern.decorator.chaiExample.SpecialDecorator;

void main(){

    Chai chai = new SimpleChai();
    System.out.println(chai.getDescription());
    System.out.println(chai.amount());


    chai = new GingerDecorator(chai);
    System.out.println(chai.getDescription());
    System.out.println(chai.amount());

    chai = new SpecialDecorator(chai);
    System.out.println(chai.getDescription());
    System.out.println(chai.amount());
}